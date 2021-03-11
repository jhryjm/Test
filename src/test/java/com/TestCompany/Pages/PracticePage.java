package com.TestCompany.Pages;

import com.TestCompany.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {

    public PracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"content\"]/ul/li[2]/a")
    public WebElement addRemoveElement;



}


