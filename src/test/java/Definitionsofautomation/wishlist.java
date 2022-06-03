package Definitionsofautomation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pagesofsite.whishlist;

import java.util.concurrent.TimeUnit;

public class wishlist {


    whishlist wihshlist = new whishlist(hooksj.driver);

    @Given("User navigate to website F08")
    public void navigate_website() {
        hooksj.driver.navigate().to("https://demo.nopcommerce.com/");
        hooksj.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User choose a random product and click on add to wishlist icon")
    public void wishlist_icons() throws InterruptedException {
        wihshlist.Mac().click();
        wihshlist.wishlist().click();
        hooksj.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);



    }

    @Then("message appears says The product has been added to your wishlist")
    public void message_wishlist() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(wihshlist.notificationP().getText(),"The product has been added to your wishlist");
        soft.assertEquals(wihshlist.notification().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
