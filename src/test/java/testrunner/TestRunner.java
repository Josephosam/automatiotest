package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(


            //report//

            features = "src\\main\\resources\\myfeatures",
            glue = {"Definitionsofautomation",
            } ,
            tags = "@cucumber",
            plugin = {"pretty","html:target/cucumber-reports/index.html"}

    )

    public class TestRunner extends AbstractTestNGCucumberTests {


    }

