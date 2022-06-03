package Definitionsofautomation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pagesofsite.homepage;

public class currencies {

    homepage homePage = new homepage(hooksj.driver);
    String LE;


    @When("User Select Euro from currency dropdown list")
    public void select_currency() {
        homePage.currency().click();
        LE = "Euro";
    }

    @Then("Currency has been changed from US to Euro")
    public void currency_changed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(homePage.currency().getText().contains(LE));
        soft.assertAll();
    }
}
