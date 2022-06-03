package Definitionsofautomation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public  class hooksj {



     public static WebDriver driver = null;

    @Before
    public static void open_browser(){

        WebDriverManager.chromedriver().setup();

        hooksj.driver = new ChromeDriver();
        hooksj.driver.manage().window().maximize();
        String website ="https://demo.nopcommerce.com/";
        hooksj.driver.navigate().to(website);
        hooksj.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }

        @After
        public void quit_browser() {

            driver.quit();
        }
    }


