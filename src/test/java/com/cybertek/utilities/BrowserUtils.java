package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

/*

 */
//hold CONTROL+SHIFT+D TO MOVE LINES AROUND!
public class BrowserUtils {

    //create method name: sleep
    //converting milliseconds to seconds
    //handle checked exceptions

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds *= 1000));
        } catch (InterruptedException e) {
            System.out.println("Something happened in your SLEEP METHOD");
        }
    }

    /*
    Method to Assert Title
     */
    public static void titleVerification(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    public static boolean titleVerificationBoolean(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        return actualTitle.equals(expectedTitle);
    }


    /*
    This method accepts List<WebElement> and returns List<String>
     */
    public static List<String> convertElementsToText(List<WebElement> webElementList) {

        List<String> result = new LinkedList<>();
        for (WebElement webElement : webElementList) {
            result.add(webElement.getText());
        }

        return result;
    }

}