package com.stellarburgers.stellar_burgers.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BaseData;
import pages.User;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class RedirectTest extends BaseData {

    private final User existedUser = User.getExistedUser();

    @AfterClass
    private void tearDown() {
        closeDriver();
    }

    @Test(priority = 1)
//    @DisplayName("Testing redirect to PersonalCabinet")
//    @Description("Basic test of redirection into Account via FirstPage/personalCabinetButton")
    public void redirectToPersonalAccountFormFirstPageTest() {

        firstPage.clickEnterAccountButton();
        loginPage.login(existedUser.getEmail(), existedUser.getPassword());
        firstPage.clickPersonalCabinetButton();
        Assert.assertTrue(accountPage.exitButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
        logoutAndRedirectToFirstPage();
    }

    @Test(priority = 2)
//    @DisplayName("Testing redirect to Constructor")
//    @Description("Basic test of redirection from Account Constructor")
    public void redirectToConstructorFormPersonalAccountTest() {

        firstPage.clickEnterAccountButton();
        loginPage.login(existedUser.getEmail(), existedUser.getPassword());
        firstPage.clickPersonalCabinetButton();
        accountPage.clickConstructorTab();
        Assert.assertEquals(WebDriverRunner.url(), "https://stellarburgers.nomoreparties.site/");
    }

    @Test(priority = 3)
//    @DisplayName("Testing of switching tabs of a Constructor")
//    @Description("Switching between tabs of a Constructor Buns/Sauce/Filler")
    public void switchingTabsOfAConstructorTest() {

        firstPage.clickPersonalCabinetButton();
        accountPage.clickConstructorTab();
        Assert.assertTrue(firstPage.clickSauceTab());
        Assert.assertTrue(firstPage.clickFillerTab());
        Assert.assertTrue(firstPage.clickBunsTab());
    }

    @Test(priority = 4)
//    @DisplayName("Testing of logout")
//    @Description("Redirecting to Account Page and Logout")
    public void redirectingAndLogoutTest() {

        firstPage.clickPersonalCabinetButton();
        logoutAndRedirectToFirstPage();
    }
}
