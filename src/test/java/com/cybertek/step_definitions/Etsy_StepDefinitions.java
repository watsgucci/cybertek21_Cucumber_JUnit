package com.cybertek.step_definitions;

import com.cybertek.pages.Etsy_Landing_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    private Etsy_Landing_Page e1 = new Etsy_Landing_Page();

    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url = ConfigurationReader.getValue("etsyURL");
        Driver.getDriver().get(url);
    }


    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("user searches {string} in the search field")
    public void userSearchesInTheSearchField(String arg0) {
        e1.searchInputField.sendKeys(arg0);
        e1.searchButton.click();
    }

    @Then("user should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }
}
