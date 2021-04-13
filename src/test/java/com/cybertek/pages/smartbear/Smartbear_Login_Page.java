package com.cybertek.pages.smartbear;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Smartbear_Login_Page {



    public Smartbear_Login_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement usernameInputField;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']" )
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']" )
    public WebElement loginButton;



    public void loginToSmartBear(){
        usernameInputField.sendKeys("Tester");
        passwordInputField.sendKeys("test");
        loginButton.click();
    }

    //custom username and password
    public void loginTOSmartBear(String username, String password){
        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginButton.click();
    }

    //login method where we can pass data from config.properties
    public void loginToSmartBear_ConfigReader(){
        usernameInputField.sendKeys(ConfigurationReader.getValue("smartbearUsername"));
        passwordInputField.sendKeys(ConfigurationReader.getValue("smartbearPassword"));
        loginButton.click();
    }




}
