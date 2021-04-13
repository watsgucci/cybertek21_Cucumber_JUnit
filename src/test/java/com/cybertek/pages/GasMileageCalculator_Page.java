package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GasMileageCalculator_Page {

    public GasMileageCalculator_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "uscodreading")
    public WebElement currentOdometerInput;

    @FindBy(id = "uspodreading")
    public WebElement previousOdometerInput;

    @FindBy(id = "usgasputin")
    public WebElement gasAddedToTank;

    @FindBy(id = "usgasprice")
    public WebElement gasPrice;

    @FindBy(xpath = "//input[@type='image']")
    public WebElement submitButton;

    @FindBy(xpath = "//b[contains(text(),'mpg')]")
    public WebElement resultGasMileage;


}
