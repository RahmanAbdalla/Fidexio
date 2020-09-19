package com.cybertek.step_definitions;

import com.cybertek.Pages.FidexioPage;
import com.cybertek.TestBase.waitClass;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PosManager_Steps extends waitClass {

    FidexioPage fidexioPage = new FidexioPage();

    @Given("user logs in with correct credentials")
    public void userLogsInWithCorrectCredentials() {

        implicitWait();

        Driver.getDriver().get("http://app.briteerp.com/web/login");
        fidexioPage.userNameInput.sendKeys(ConfigurationReader.getProperty("fidexioUsername_posManager"));
        fidexioPage.passwordInput.sendKeys(ConfigurationReader.getProperty("fidexioPassword_posManager")+ Keys.ENTER);
    }

    @When("pos Manager click on leave module")
    public void posManagerClickOnLeaveModule() throws InterruptedException {
        implicitWait();

        fidexioPage.moreDropDown.click();
        fidexioPage.leaveModule.click();
    }

    @Then("pos Manager clicks on a calender day")
    public void posManagerClicksOnACalenderDay() throws InterruptedException {
        implicitWait();

        fidexioPage.Monday.click();
    }

    @And("pos Manager fill in the leave request")
    public void posManagerFillInTheLeaveRequest() {
        implicitWait();

        fidexioPage.descriptionInput.sendKeys("test");
        fidexioPage.leaveDropDown.click();
        fidexioPage.sickLeave.click();
        fidexioPage.employee.click();
        fidexioPage.demoUser.click();
        fidexioPage.department.click();
        fidexioPage.crmDepartment.click();
        fidexioPage.saveBtn.click();
    }

}
