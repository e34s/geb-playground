import geb.Browser
import geb.testng.GebReportingTestTrait
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.Test

class JUnitTest1 implements GebReportingTestTrait {


    @org.junit.Test
    void junit1() {

        println("junit1 test running ")
        Thread.sleep(1000)
    }

    @org.junit.Test
    void junit2() {

        println("junit2 test running ")
        Thread.sleep(1000)
    }

}
