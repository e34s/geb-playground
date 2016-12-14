import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

import static org.openqa.selenium.remote.DesiredCapabilities.firefox

/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/
System.setProperty("webdriver.gecko.driver", "/Users/gridfusion/Downloads/geckodriver")
System.setProperty("webdriver.chrome.driver", "/Users/gridfusion/Downloads/chromedriver")

//default browser
driver = { new ChromeDriver() }


baseUrl = "http://gebish.org"
cacheDriver = false
cacheDriverPerThread = true //not sure if this is needed

environments {

    // run as 'grails -Dgeb.env=chrome test-app'
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        println("setting up chrome")
        driver = { new ChromeDriver() }
    }

    // run as 'grails -Dgeb.env=firefox test-app'
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        println("setting up chrome")
        driver = { new FirefoxDriver() }
    }

    remoteFF {
        println("setting up remote webdriver")
        DesiredCapabilities caps = DesiredCapabilities.firefox()
        driver = { new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps)  }
    }
}

