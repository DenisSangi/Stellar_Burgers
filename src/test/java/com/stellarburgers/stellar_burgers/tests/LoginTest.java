package com.stellarburgers.stellar_burgers.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BaseData;
import pages.User;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseData {

    @AfterClass
    private void tearDown() {
        closeDriver();
    }


    @Test(priority = 1, description = "Test of Login via FirstPage/enterAccountButton")
//    @DisplayName("Login test 1")
//    @Description("Test of Login via FirstPage/enterAccountButton")
    public void loginViaEnterIntoAccountButton() {
        User user = User.getExistedUser();
        firstPage.clickEnterAccountButton();
        loginPage.login(user.getEmail(), user.getPassword());
        Assert.assertTrue(firstPage.makeOrderButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
        firstPage.clickPersonalCabinetButton();
        logoutAndRedirectToFirstPage();

    }

    @Test(priority = 2)
//    @DisplayName("Login Test 2")
//    @Description("Test of Login via FirstPage/Registration/enterLink")
    public void loginViaEnterLink() {
        User user = User.getExistedUser();
        firstPage.clickEnterAccountButton();
        loginPage.clickRegistrationLink();
        registrationPage.clickEnterLink();
        loginPage.login(user.getEmail(), user.getPassword());
        Assert.assertTrue(firstPage.makeOrderButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
        firstPage.clickPersonalCabinetButton();
        logoutAndRedirectToFirstPage();
    }

    @Test(priority = 3)
//    @DisplayName("Login Test 3")
//    @Description("Test of Login via FirstPage/Registration/ForegotPassword/restorePasswordLink")
    public void loginViaRestorePasswordPageEnterLink() {
        User user = User.getExistedUser();
        firstPage.clickEnterAccountButton();
        loginPage.clickRestorePasswordLink();
        restorePasswordPage.clickEnterLink();
        loginPage.login(user.getEmail(), user.getPassword());
        Assert.assertTrue(firstPage.makeOrderButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
        firstPage.clickPersonalCabinetButton();
        logoutAndRedirectToFirstPage();
    }

    @Test(priority = 4)
//    @DisplayName("Login Test 4")
//    @Description("Test of Login via FirstPage/personalAccount")
    public void loginViaPersonalAccount() {
        User user = User.getExistedUser();
        firstPage.clickPersonalCabinetButton();
        loginPage.login(user.getEmail(), user.getPassword());
        Assert.assertTrue(firstPage.makeOrderButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
        firstPage.clickPersonalCabinetButton();
        logoutAndRedirectToFirstPage();
    }
}
