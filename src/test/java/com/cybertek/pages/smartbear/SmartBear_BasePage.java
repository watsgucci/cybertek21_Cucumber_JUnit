package com.cybertek.pages.smartbear;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SmartBear_BasePage {
    //SUPER CLASS. ANOTHER LAYER OR RE-USABILITY
    //WE WANT TO USE THIS PAGE TO PUT ALL THE COMMON ELEMENTS IN THIS PAGE
    //Like the modules on the top and side bars that can be seen on every page
    //This way we have access to click them thru any page we create after
    public SmartBear_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
