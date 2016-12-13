import geb.Browser
import geb.driver.CachingDriverFactory
import geb.testng.GebReportingTestTrait
import geb.testng.GebTestTrait
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.Test

class Testng2 implements GebReportingTestTrait {


    @Test(groups = "e2e")
    void test1() {

        def browser1 = new Browser()
        browser1.driver = new ChromeDriver()

        browser1.go "http://spiegel.de"

        println("Page title: " + browser1.getTitle())
        try {
            assert browser1.getTitle() == "SPIEGEL ONLINE - Aktuelle Nachrichten"
        }
        finally {
            browser1.quit()
        }
        //CachingDriverFactory.clearCacheAndQuitDriver()

    }



    @Test(groups = "e2e")
    void test2() {

        to GebishOrgHomePage

        println("Page title: " + browser.getTitle())
        quit()
        //CachingDriverFactory.clearCacheAndQuitDriver()
    }

}
