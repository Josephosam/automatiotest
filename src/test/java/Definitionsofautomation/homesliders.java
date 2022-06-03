package Definitionsofautomation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pagesofsite.homepage;

public class homesliders {

    homepage homePage = new homepage(hooksj.driver);



    @When("Click on first slider")
    public void first_slider() throws InterruptedException {
        homePage.iphoneBox().click();
        homePage.iphoneBanner().click();

    }

    @Then("User could click on the banner and redirect to the product link")
    public void product_link() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.iphoneBanner().getAttribute("href"), "http://demo.nopcommerce.com/");
        soft.assertAll();

    }


}
