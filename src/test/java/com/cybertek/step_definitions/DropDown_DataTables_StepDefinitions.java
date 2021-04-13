package com.cybertek.step_definitions;

import com.cybertek.pages.DropDown_CyberTekPractice_Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown_DataTables_StepDefinitions {

    private DropDown_CyberTekPractice_Page d1 = new DropDown_CyberTekPractice_Page();


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }


    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> monthList) {
        Select s1 = new Select(d1.monthDropDown);
//need to use .getOptions()
        Assert.assertTrue(monthList.equals(BrowserUtils.convertElementsToText(s1.getOptions())));



        /*List<WebElement> dropDownOptions = new ArrayList<>(s1.getOptions());

        for (int i = 0; i < monthList.size(); i++) {
            System.out.println("monthList.get(i) = " + monthList.get(i));
            System.out.println("dropDownOptions.get(i).getText() = " + dropDownOptions.get(i).getText());
            Assert.assertEquals(monthList.get(i), dropDownOptions.get(i).getText());
        }*/

    }


}
