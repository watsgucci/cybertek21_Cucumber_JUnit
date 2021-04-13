package com.cybertek.step_definitions;

import com.cybertek.pages.smartbear.Smartbear_Login_Page;
import com.cybertek.pages.smartbear.Smartbear_Order_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Smartbear_StepDefinitions {


    private Smartbear_Login_Page l1 = new Smartbear_Login_Page();
    private Smartbear_Order_Page o1 = new Smartbear_Order_Page();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getValue("smartbearURL"));
        l1.usernameInputField.sendKeys(ConfigurationReader.getValue("smartbearUsername"));
        l1.passwordInputField.sendKeys(ConfigurationReader.getValue("smartbearPassword"));
        l1.loginButton.click();
        //**************************
        o1.orderPageLink.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx"));

    }
/*
 Examples: Order Info
      | product | quantity | customer name | street     | city    | state | zip   | cardType | card number  | expiration date | expected name |
      | MyMoney | 1        | Ken Adams     | Kingle St. | Chicago | IL    | 60084 | Visa     | 313131313135 | 12/22           | Ken Adams     |


Examples:
      | product     | quantity | customer name      | street      | city        | state | zip   | card type        | card number   | expiration date | expected name      |
      | MyMoney     | 1        | Ken Adams          | Kinzie st   | Chicago     | IL    | 60004 | Visa             | 1333313133315 | 12/22           | Ken Adams          |
      | FamilyAlbum | 4        | Ken Joey Tribbiani | State st    | Chicago     | IL    | 60656 | American Express | 4746745687823 | 11/22           | Ken Joey Tribbiani |
      | ScreenSaver | 5        | Ken Rachel Green   | Michigan st | Chicago     | IL    | 60056 | MasterCard       | 5758759229384 | 10/22           | Ken Rachel Green   |
      | MyMoney     | 5        | Chandler Bing      | Erie st     | Chicago     | IL    | 60666 | Visa             | 4874375978392 | 10/22           | Chandler Bing      |
      | FamilyAlbum | 9        | Dr DrakerRamoray   | Dale st     | Arl Hgths   | IL    | 69452 | American Express | 5847242937438 | 10/22           | Dr DrakerRamoray   |
      | ScreenSaver | 10       | Monica Geller      | Euclid st   | Arl Hgths   | IL    | 60312 | MasterCard       | 4572872834927 | 11/22           | Monica Geller      |
      | MyMoney     | 3        | Ross Geller        | River st    | Des Plaines | IL    | 60666 | American Express | 5849822374383 | 12/22           | Ross Geller        |
      | MyMoney     | 1        | Ken Adams          | Kinzie st   | Chicago     | IL    | 60312 | MasterCard       | 1333313133315 | 12/22           | Ken Adams          |
 */

    @Then("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
        System.out.println("*** Starting The Form ***");
    }

    @Then("User selects {string} from product dropdown")
    public void user_selects_product_from_product_dropdown(String string) {
        Select s1 = new Select(o1.productDropDown);
        s1.selectByVisibleText(string);
    }

    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        o1.quantity.sendKeys(string);
    }

    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        o1.customerName.sendKeys(string);
    }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String string) {
        o1.street.sendKeys(string);
    }

    @Then("User enters {string} to city")
    public void user_enters_to_city(String string) {
        o1.city.sendKeys(string);
    }

    @Then("User enters {string}  to state")
    public void user_enters_to_state(String string) {
        o1.state.sendKeys(string);
    }

    @Then("User enters {string} to zip")
    public void user_enters_to_zip(String string) {
        o1.zipcode.sendKeys(string);
    }

    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        string = string.toLowerCase();
        System.out.println(string);
        for (int i = 0; i < o1.cardTypeText.size(); i++) {
            System.out.println(o1.cardTypeText.get(i).getText());
            if (o1.cardTypeText.get(i).getText().equalsIgnoreCase(string)) {

                o1.cardTypeInput.get(i).click();
            }
        }

    }


    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        o1.cardNumber.sendKeys(string);
    }

    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        o1.cardExpirationDate.sendKeys(string);
    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        o1.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {

    }


}
