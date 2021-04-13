package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//will apply to your CukeRunner AUTOMATICALLY
public class Hooks {

    @Before(order = 2,value = "@database")
    public void setupScenario(){
        System.out.println("Setting up browser with further details...");
    }

    @Before (value = "@database", order = 1) //will only be applied to scenarios with the tag @database
    public void setupDatabase(){
        System.out.println("---- CONNECTING TO DATABASE");
    }



    @After(value = "@database")
    public void tearDownScenario(){
        System.out.println("Closing browser and sleep");
        System.out.println("Take a screenshot");
    }

    //TAKE SCREENSHOT*************************
    @After (order = 1)
    public void tearDownScenario(Scenario scenario){
        //if my scenario is failed, GO and take screenshot

        if(scenario.isFailed()) {

            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
            Driver.closeDriver();

        }

        System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        Driver.sleep(1);
        Driver.closeDriver();
    }


    @BeforeStep(value = "@database")
    public void runBeforeSteps(){
        System.out.println("--------Running before each Step-----------");
    }

    @AfterStep(value = "@database")
    public void runAfterStep(){
        System.out.println("----------Running After each Step-------------");
    }

}
