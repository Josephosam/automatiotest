package pagesofsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addcart {

    WebDriver driver;


    public addcart(WebDriver driver) {

        this.driver = driver;

    }


    public WebElement notification(){

        return driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//div"));
    }

    public WebElement notification_new(){

        return driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//p"));
    }

    public WebElement cart(){

        return driver.findElement(By.id("add-to-cart-button-4"));
    }

    public WebElement MC(){
        return driver.findElement(By.xpath("//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]"));
    }



}




