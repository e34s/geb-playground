import org.openqa.selenium.chrome.ChromeDriver

import static org.openqa.selenium.remote.DesiredCapabilities.firefox

/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/

System.setProperty("webdriver.chrome.driver", "/Users/gridfusion/Downloads/chromedriver")
driver = { new ChromeDriver() }

baseUrl = "http://gebish.org"
