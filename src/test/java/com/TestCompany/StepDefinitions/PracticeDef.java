package com.TestCompany.StepDefinitions;

import com.TestCompany.Pages.PracticePage;
import com.TestCompany.Utilities.ConfigurationReader;
import com.TestCompany.Utilities.Driver;
import com.TestCompany.Utilities.Waits;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeDef extends Waits {
    //    HomePage homePage = new HomePage();
//    DownloadPage downloadPage = new DownloadPage();
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