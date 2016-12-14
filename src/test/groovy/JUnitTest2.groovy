import geb.testng.GebReportingTestTrait

class JUnitTest2 implements GebReportingTestTrait {


    @org.junit.Test
    void junit3() {

        println("junit1 test running ")
        Thread.sleep(1000)

        //CachingDriverFactory.clearCacheAndQuitDriver()

    }

    @org.junit.Test
    void junit4() {

        println("junit2 test running ")
        Thread.sleep(1000)

        //CachingDriverFactory.clearCacheAndQuitDriver()

    }

}
