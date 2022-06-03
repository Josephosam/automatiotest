package Definitionsofautomation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pagesofsite.homepage;

import java.util.concurrent.TimeUnit;


public class followus {

    homepage homePage = new homepage(hooksj.driver);



    @When("User click on Facebook and Twitter and Youtube and Rss")
    public void links() throws InterruptedException {
        homePage.facebook().click();
        Thread.sleep(2000);
        homePage.twitter().click();
        Thread.sleep(2000);
        homePage.youtube().click();
        Thread.sleep(2000);
        homePage.youtube().click();
        hooksj.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Then("Facebook page opens and Twitter page opens and Youtube page opens and RSS page opens")
    public void links_pages() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.facebook().getAttribute("href"),"http://www.facebook.com/nopCommerce");
        soft.assertEquals(homePage.twitter().getAttribute("href"),"https://twitter.com/nopCommerce");
        soft.assertEquals(homePage.youtube().getAttribute("href"),"http://www.youtube.com/user/nopCommerce");
        soft.assertEquals(homePage.rss().getAttribute("href"),"https://demo.nopcommerce.com/news/rss/1");
        soft.assertAll();
    }
}
