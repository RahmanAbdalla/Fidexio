package com.cybertek.step_definitions;

import com.cybertek.Pages.FidexioPage;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FidexioSteps {

    FidexioPage fidexioPage = new FidexioPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @Given("User should be able to click on the Employee module")
    public void user_should_be_able_to_click_on_the_employee_module() throws InterruptedException {

        String username = ConfigurationReader.getProperty("fidexioUsername_salesmanager");
        String password = ConfigurationReader.getProperty("fidexioPassword_salemanager");

        Driver.getDriver().get("http://app.briteerp.com/web/login");
        fidexioPage.userNameInput.sendKeys(username);
        fidexioPage.passwordInput.sendKeys(password+ Keys.ENTER);

        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(fidexioPage.employeesModule));
        fidexioPage.employeesModule.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");


    }




    @Then("User should see the list of Employee")
    public void user_should_see_the_list_of_employee() throws InterruptedException {

        Thread.sleep(2000);

        List<WebElement> listOfAllEmployees = Driver.getDriver().findElements(By.xpath("//div[@class='oe_kanban_details']"));

        System.out.println("There are "+listOfAllEmployees.size()+" in the list");
    }
    @Then("User should be able to click on any employee profile and see all the info")
    public void user_should_be_able_to_click_on_any_employee_profile_and_see_all_the_info() throws InterruptedException {

        Thread.sleep(2000);
        Driver.closeDriver();

    }

}
