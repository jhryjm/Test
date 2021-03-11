package com.TestCompany.StepDefinitions;


import com.TestCompany.Pages.PracticePage;
import com.TestCompany.Utilities.ConfigurationReader;
import com.TestCompany.Utilities.Driver;

import static com.TestCompany.Utilities.Waits.waitForElement;

public class Stepdefinitions {
    PracticePage practicePage = new PracticePage();

    public void theUserGoesToPracticeURL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    public void userClicksOnPracticeExample() throws InterruptedException {
        Thread.sleep(5000);
        practicePage.addRemoveElement.click();
        waitForElement(practicePage.addRemoveElement, 5000);
    }

    public void thePageOpensVerification () {
    }

    public void userAddsAnElement () {
    }

    public void userDeletesAnElement () {
    }

}
