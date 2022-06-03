package Definitionsofautomation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pagesofsite.addcart;

import java.util.concurrent.TimeUnit;

public class shoppingcart {

    addcart shoppingcart = new addcart(hooksj.driver);


    @When("User choose a random product and click on add to shopping cart button")
    public void random_product() throws InterruptedException {
        shoppingcart.MC().click();
        shoppingcart.cart().click();
        hooksj.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(1000);


    }

    @Then("message appears says The product has been added to your shopping cart")
    public void message() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(shoppingcart.notification_new().getText(),"The product has been added to your shopping cart");
        soft.assertEquals(shoppingcart.notification().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
