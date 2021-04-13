package com.cybertek.step_definitions;

import com.cybertek.pages.smartbear.Smartbear_Login_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class dataTables_StepDefinitions {
    private String title = "";

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList ) {
        System.out.println("fruitList.size() = " + fruitList.size());
        System.out.println("fruitList = " + fruitList);

        for (String eachFruit : fruitList) {
            System.out.println("eachFruit = " + eachFruit);
        }
    }


    @Given("User is on the login page of SmartBear")
    public void user_is_on_the_login_page_of_smart_bear() {
        Driver.getDriver().get(ConfigurationReader.getValue("smartbearURL"));
        title = Driver.getDriver().getTitle();
    }

    @When("User enters below info") // dataTable returns us a List, Map or Set, etc.
    public void user_enters_below_info(Map<String, String> loginInfo) {
        String username = loginInfo.get("username"); //-> will return Tester
        String password = loginInfo.get("password"); //-> will return test
        Smartbear_Login_Page l1 = new Smartbear_Login_Page();
       l1.loginTOSmartBear(username,password);

    }
    @Then("User should see title changed to Web Orders")
    public void user_should_see_title_changed_to_web_orders() {
        System.out.println("title = " + title);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertFalse(title.equals(Driver.getDriver().getTitle()));
    }









}
