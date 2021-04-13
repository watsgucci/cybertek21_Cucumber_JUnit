package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Etsy_Landing_Page {

    public Etsy_Landing_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchInputField;

    @FindBy(xpath = "//span[@class='etsy-icon wt-nudge-b-1']")
    public WebElement searchButton;




}
