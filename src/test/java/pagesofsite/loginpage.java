package pagesofsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    WebDriver driver = null;

    public loginpage(WebDriver driver){
        
        this.driver = driver;
    }

    public WebElement login(){
        
        return driver.findElement(By.className("ico-login"));
    }

    public WebElement email(){
        
        return driver.findElement(By.id("Email"));
    }

    public WebElement password(){
        
        return driver.findElement(By.id("Password"));
    }

    public WebElement myAccount(){
        
        return driver.findElement(By.className("ico-account"));
    }



}
