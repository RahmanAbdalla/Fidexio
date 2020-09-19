package com.cybertek.Utilities;

import java.util.concurrent.TimeUnit;

public class implicitWaits {

    public static void impctWait(){

        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
