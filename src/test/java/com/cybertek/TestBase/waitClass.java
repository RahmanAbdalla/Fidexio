package com.cybertek.TestBase;

import com.cybertek.Utilities.Driver;

import java.util.concurrent.TimeUnit;

public class waitClass {

    public static void implicitWait(){

        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
