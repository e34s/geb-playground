import geb.Browser
import geb.driver.CachingDriverFactory
import geb.testng.GebTestTrait
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test



class Testng1 implements GebTestTrait {

    @BeforeTest
    public void setup() {
        println("SETUP")
        System.setProperty("webdriver.chrome.driver", "/Users/gridfusion/Downloads/chromedriver")
        driver = new ChromeDriver();
    }

    @Test(groups = "e2e")
    void test1() {

        go ("http://www.google.com")

        //println("Page title: " + getTitle())
        //getTitle() == "Google"
        Thread.sleep(5000)
    }



    @Test(groups = "e2e")
    void test2() {
        go ("http://www.google.com")

        //println("Page title: " + getTitle())
        //getTitle() == "Google"
        Thread.sleep(5000)
        //CachingDriverFactory.clearCacheAndQuitDriver()
    }


    @AfterTest
    public void cleanup() {
        println("CLEANUP")
        driver.quit()
    }

}
