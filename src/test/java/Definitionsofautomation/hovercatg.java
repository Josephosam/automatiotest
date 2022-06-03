package Definitionsofautomation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pagesofsite.homepage;

public class hovercatg {

    homepage homePage = new homepage(hooksj.driver);
    Actions hoveraction = new Actions(hooksj.driver);



    @When("User hover and select random category")
    public void hover() {
        hoveraction.moveToElement(homePage.mainMenu()).perform();
        hoveraction.moveToElement(homePage.computersMenu()).perform();
    }

    @When("User click on random sub-category")
    public void categroies() {
        hoveraction.moveToElement(homePage.softwareMenu());
        hoveraction.click().build().perform();
    }

    @Then("User redirect to sub-category page")
    public void category_page() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(hooksj.driver.getCurrentUrl(), "https://demo.nopcommerce.com/software");
        soft.assertAll();
    }
}
