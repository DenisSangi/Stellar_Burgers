package com.stellarburgers.stellar_burgers.registration;

import io.qameta.allure.Description;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BaseData;

public class RegistrationTest extends BaseData {

    @AfterClass
    private void tearDown() {
        closeDriver();
    }

    @Test
    public void redirectToLoginPageTest() {
        firstPage.clickEnterAccountButton();
        Assert.assertTrue(loginPage.enterButton.isDisplayed());
    }

    @Test
    @DisplayName("Registration test one")
    @Description ("Test of Registration positive")
    public void registrationTest() {
        firstPage.clickEnterAccountButton();
        loginPage.clickRegistrationLink();
        registrationPage.enterName(RandomString.make(7));
        registrationPage.enterEmail(RandomString.make(5) + "@gmail.com");
        registrationPage.enterPassword(RandomString.make(8));
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(loginPage.enterButton.isDisplayed());
    }

    @Test
    @DisplayName("Registration test two")
    @Description("Test of Registration with to short Password")
    public void incorrectPasswordRegistrationTest() {
        firstPage.clickEnterAccountButton();
        loginPage.clickRegistrationLink();
        registrationPage.enterName(RandomString.make(7));
        registrationPage.enterEmail(RandomString.make(5) + "@gmail.com");
        registrationPage.enterPassword(RandomString.make(5));
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(registrationPage.incorrectPasswordErrorMessage.isDisplayed());
    }

}

