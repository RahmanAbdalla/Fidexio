package com.cybertek.step_definitions;

import com.cybertek.Pages.FidexioPage;
import com.cybertek.TestBase.waitClass;
import com.cybertek.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Fidexio_Login_Steps extends waitClass {

    FidexioPage fidexioPage = new FidexioPage();

    @Given("{string} goes to the login page")
    public void goesToTheLoginPage(String user) {

        Driver.getDriver().get("http://app.briteerp.com/web/login");

        System.out.println(user+" is on the login page");
    }

    @Then("{string} enters {string}'s {string}")
    public void entersS(String user, String his, String username) {
        fidexioPage.userNameInput.sendKeys(username);

        System.out.println(user+" enters "+his+" username");
    }

    @When("{string} enters {string}'s {string} and clicks login")
    public void entersSAndClicksLogin(String user, String his, String password) {

        fidexioPage.passwordInput.sendKeys(password+ Keys.ENTER);

        System.out.println(user+" enters "+his+" password");
    }

    @And("{string} is on the main page and sees {string}'s account on the right")
    public void isOnTheMainPageAndSeesSAccountOnTheRight(String user, String his) {

        System.out.println("Title is "+Driver.getDriver().getTitle());

        System.out.println(user+" is logged in and sees "+his+" account");
    }


}
