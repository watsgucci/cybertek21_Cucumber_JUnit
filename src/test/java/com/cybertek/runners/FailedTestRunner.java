package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //CHANGING FEATURES TO LOOK AT THE RERUN.TXT FOR THE FAILS
        features = "@target/rerun.txt", //features folder - content root because it is outside the package we are using for this file
        glue = "com/cybertek/step_definitions" //step_definitions folder - source root is used because we are in the same package

)
public class FailedTestRunner {
}//when we run this Runner it will only do the failed tests found in Rerun.txt file.


