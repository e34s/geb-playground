import geb.driver.CachingDriverFactory
import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import spock.lang.Specification

/**
 * Created by gridfusion on 13/12/16.
 */
public class SpockSpec1 extends GebSpec {


    def "should open google"() {
        given:

        when:
        println("finishing test")
        go ("http://www.google.com")

        then:
        println("finishing test")
        //println("Page title: " + getTitle())
        //getTitle() == "Google"
        //CachingDriverFactory.clearCacheAndQuitDriver()
        browser.quit()
    }

    def "should open adcubum"() {
        given:

        when:
        println("finishing test")
        go ("http://www.adcubum.com")

        then:
        println("finishing test")

        //println("Page title: " + getTitle())
        //CachingDriverFactory.clearCacheAndQuitDriver()
        browser.quit()
    }
}


