package Definitionsofautomation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pagesofsite.loginpage;

import java.util.concurrent.TimeUnit;

    public class login {

        loginpage login = new loginpage(hooksj.driver);

        @Given("User navigate to website F02")
        public void navigate() {
            hooksj.driver.navigate().to("https://demo.nopcommerce.com/");
            hooksj.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        }

        @And("User click on Login tab")
        public void login() {

            login.login().click();
        }

        @When("User enter email and password and login")
        public void details_personal() {
            login.email().sendKeys("jo@jo.jo");
            login.password().sendKeys("jojojo");
            login.password().sendKeys(Keys.ENTER);
        }

        @Then("User message success")
        public void message() {
            SoftAssert soft = new SoftAssert();
            soft.assertEquals(hooksj.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
            soft.assertTrue(login.myAccount().isDisplayed());
            soft.assertAll();

        }
    }




