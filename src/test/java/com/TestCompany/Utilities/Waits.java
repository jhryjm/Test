package com.TestCompany.Utilities;

import org.openqa.selenium.WebElement;

public class Waits {
    public static void waitForElement(WebElement elements, int time) throws InterruptedException {
        if (elements.isDisplayed()){
            elements.click();
        }else{
            Thread.sleep(time);
            elements.click();
        }
    }

}
