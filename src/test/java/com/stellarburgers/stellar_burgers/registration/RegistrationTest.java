package com.stellarburgers.stellar_burgers.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseData;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationTest extends BaseData {

    private final WebDriver driver = new ChromeDriver();

    @Test
    public void redirectToLoginPageTest() {
        firstPage.clickEnterAccountButton();
        Assert.assertTrue(loginPage.enterButton.isDisplayed());
    }

}

