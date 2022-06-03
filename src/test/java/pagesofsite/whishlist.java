package pagesofsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class whishlist {


    WebDriver driver;


    public whishlist(WebDriver driver) {

        this.driver = driver;

    }

    public WebElement notification() {

        return driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//div"));
    }

    public WebElement notificationP() {

        return driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//p"));
    }

    public WebElement wishlist() {

        return driver.findElement(By.id("add-to-wishlist-button-4"));
    }


    public WebElement Mac() {
        return driver.findElement(By.xpath("//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]"));
    }

}





