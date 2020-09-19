package com.cybertek.step_definitions;

import com.cybertek.Utilities.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @AfterStep
    public void screenShot(Scenario scenario){

        byte [] screenShot = ( (TakesScreenshot) Driver.getDriver() ).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenShot,"image/png", scenario.getName());
    }


    @AfterClass
    public static void closeDriver(){
        Driver.closeDriver();
    }
}
