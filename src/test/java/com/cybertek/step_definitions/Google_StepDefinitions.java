package com.cybertek.step_definitions;

import com.cybertek.pages.Google_LandingPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {

    private String actualTitle = Driver.getDriver().getTitle();
    private Google_LandingPage g1 = new Google_LandingPage();

    //got the framework for this method when running the test initially and having it fail
    @Given("User is on Google home page") //make sure this text matches the text from the corresponding feature file
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com");

    }


    @When("User searched for apple")
    public void user_searched_for_apple() {
        Google_LandingPage g1 = new Google_LandingPage();
        g1.searchbar.sendKeys("apple");
    }


    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


    @Then("User should see title is Google")
    public void userShouldSeeTitleIsGoogle() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Google"));
    }




    @When("User searched for {string}")
    public void userSearchedFor(String arg0) {

        g1.searchbar.sendKeys(arg0+ Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Failed message: "+actualTitle,actualTitle.contains(arg0));
        /*Driver.closeDriver();*/
    }



    @Then("User should see following links")
    public void user_should_see_following_links(List<String> listOfLinks) {
        Assert.fail();
        int i=0;
        for (WebElement eachLink : g1.linkList) {
           Assert.assertEquals(listOfLinks.get(i), eachLink.getText());
            System.out.println("webElement.getText() = " + eachLink.getText());
            i++;
        }
    }

}
