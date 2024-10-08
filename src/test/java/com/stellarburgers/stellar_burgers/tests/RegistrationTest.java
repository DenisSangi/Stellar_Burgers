package com.stellarburgers.stellar_burgers.tests;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BaseData;
import pages.User;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

@Slf4j
public class RegistrationTest extends BaseData {

    @AfterClass
    private void tearDown() {
        closeDriver();
    }

    @Test(priority = 1)
//    @DisplayName("Registration test 1")
//    @Description ("Test of Registration positive")
    public void registrationTest() {
        User user = User.getRandomUser();
        firstPage.clickEnterAccountButton();
        loginPage.clickRegistrationLink();
        registrationPage.register(user.getName(), user.getEmail(), user.getPassword());
        Assert.assertTrue(loginPage.enterButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
    }

    @Test(priority = 2)
//    @DisplayName("Registration test 2")
//    @Description("Test of Registration with to short Password")
    public void incorrectPasswordRegistrationTest() {
        User user = User.geShortPasswordUser();
        loginPage.clickStellarBurgerLogo();
        firstPage.clickEnterAccountButton();
        loginPage.clickRegistrationLink();
        registrationPage.register(user.getName(), user.getEmail(), user.getPassword());
        Assert.assertTrue(registrationPage.incorrectPasswordErrorMessage.isDisplayed());
    }
}

