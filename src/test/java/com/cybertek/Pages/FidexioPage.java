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


    @FindBy (xpath = "//a[@href='#']")
    public WebElement moreDropDown;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[18]")
    public WebElement leaveModule;

    @FindBy(xpath = "//td[@data-date='2020-08-31']")
    public WebElement Monday;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement descriptionInput;

    @FindBy (id = "o_field_input_21")
    public WebElement leaveDropDown;

    @FindBy (xpath = "(//li[@class='ui-menu-item'])[1]")
    public WebElement sickLeave;

    @FindBy (xpath = "//input[@name='date_from']")
    public WebElement dateFrom;

    @FindBy (xpath = "//input[@name='date_to']")
    public WebElement dateTo;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement employee;

    @FindBy (xpath = "(//li[@class='ui-menu-item']/a)[7]")
    public WebElement demoUser;

    @FindBy (xpath = "(//input[@ autocomplete ='off'])[4]")
    public WebElement department;

    @FindBy(xpath = "(//li[@class='ui-menu-item']/a)[12]")
    public WebElement crmDepartment;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;

}
