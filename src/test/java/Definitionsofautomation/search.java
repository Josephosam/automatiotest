package Definitionsofautomation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pagesofsite.homepage;

public class search {

    homepage homePage = new homepage(hooksj.driver);
    String searchProduct;


    @When("User enter apple in search box and hit enter")
    public void search_box() {
        String product = "nokia";
        homePage.search().sendKeys(product);
        homePage.search().sendKeys(Keys.ENTER);
        searchProduct = product;
    }

    @When("User enter AP_MBP_13 in search box and hit enter")
    public void ap_13() {
        String product = "N_1020_LU";
        homePage.search().sendKeys(product);
        homePage.search().sendKeys(Keys.ENTER);
        searchProduct = product;
    }

    @Then("User found nokia product")
    public void nokia_product() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.searchKey().getAttribute("value"),searchProduct);
        soft.assertAll();
    }


}
