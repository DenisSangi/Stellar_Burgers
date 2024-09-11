package com.stellarburgers.stellar_burgers.registration;

import net.bytebuddy.utility.RandomString;
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
    public void registrationTest() {
        firstPage.clickEnterAccountButton();
        loginPage.clickRegistrationLink();
        registrationPage.enterName(RandomString.make(7));
        registrationPage.enterEmail(RandomString.make(5) + "@gmail.com");
        registrationPage.enterPassword(RandomString.make(8));
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(loginPage.enterButton.isDisplayed());
    }

}

