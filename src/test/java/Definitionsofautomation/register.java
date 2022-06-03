package Definitionsofautomation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pagesofsite.Registerpage;


public class register {

    Registerpage register = new Registerpage(hooksj.driver);


    @When("Click on register tab")
    public void register_page() {

        register.register().click();
    }

    @When("User fill personal data")
    public void personal_data() {
        register.gender().click();
        register.firstname().sendKeys("first");
        register.lastname().sendKeys("last");
        register.day().click();
        register.month().click();
        register.year().click();
        register.email().sendKeys("jo@jo.jo");
        register.password().sendKeys("jojojo");
        register.confirmpassword().sendKeys("jojojo");


    }

    @And("User hit enter")
    public void enter() {

        register.confirmpassword().sendKeys(Keys.ENTER);
    }

    @Then("User registered successfully")
    public void successfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.result().getText().contains("Your registration completed"));
        soft.assertEquals(register.result().getCssValue("color"), "rgba(76, 177, 124, 1)");
        soft.assertAll();
    }
}
