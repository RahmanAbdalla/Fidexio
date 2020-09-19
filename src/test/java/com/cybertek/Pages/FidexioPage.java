package com.cybertek.Pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FidexioPage {

    public FidexioPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "login")
    public WebElement userNameInput;


    @FindBy(id = "password")
    public WebElement passwordInput;


    @FindBy (xpath = "(//span[@class='oe_menu_text'])[15]")
    public WebElement employeesModule;


}
