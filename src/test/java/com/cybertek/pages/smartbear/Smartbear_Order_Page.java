package com.cybertek.pages.smartbear;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Smartbear_Order_Page {

    public Smartbear_Order_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderPageLink;

    @FindBy(id ="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropDown;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2" )
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5" )
    public WebElement zipcode;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//tbody//td//label" )
    public List<WebElement> cardTypeText;
    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//tbody//td" )
    public List<WebElement> cardTypeInput;

       @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

       @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement cardExpirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;



}
