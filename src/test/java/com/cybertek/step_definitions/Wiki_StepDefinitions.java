package com.cybertek.step_definitions;

import com.cybertek.pages.Wikipedia_Landing_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Wiki_StepDefinitions {

    private Wikipedia_Landing_Page w1 = new Wikipedia_Landing_Page();


    @Given("User is on Wiki home page")
    public void user_is_on_wiki_home_page() {
        Driver.getDriver().get(ConfigurationReader.getValue("wikiURL"));
    }


    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        w1.searchInputField.sendKeys(string);

    }

    @When("User clicks Wiki search button")
    public void user_clicks_wiki_search_button() {
        w1.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = string+" - Wikipedia";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        WebElement h1 = Driver.getDriver().findElement(By.xpath("//h1[@id='firstHeading']"));
        Assert.assertEquals(h1.getText().toLowerCase(),arg0.toLowerCase());
    }
}
