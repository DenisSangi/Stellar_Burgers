package com.stellarburgers.stellar_burgers.registration;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseData;

public class RegistrationTest extends BaseData {

    @Test
    public void redirectToLoginPageTest() {
        firstPage.clickEnterAccountButton();
        Assert.assertTrue(loginPage.enterButton.isDisplayed());
        closeDriver();
    }

}

