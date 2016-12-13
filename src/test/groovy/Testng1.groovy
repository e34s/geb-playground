import geb.Browser
import geb.testng.GebTestTrait
import org.testng.Assert
import org.testng.annotations.Test



class Testng1 implements GebTestTrait {


    @Test(groups = "disabled")
    void test1() {

        Browser.drive {
            to GebishOrgHomePage
        }

        Thread.sleep(1000);
        println("test number one")
        Assert.assertTrue(true)

    }



    @Test(groups = "disabled")
    void test2() {


        Browser.drive {
            to GebishOrgHomePage
        }


        Thread.sleep(1000);

        println("test number two")
        Assert.assertTrue(true)

    }

}
