package pages;

import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BaseData {

    public FirstPage firstPage = open("https://stellarburgers.nomoreparties.site/", FirstPage.class);
    public LoginPage loginPage = page(LoginPage.class);
    public RegistrationPage registrationPage = page(RegistrationPage.class);
    public AccountPage accountPage = page(AccountPage.class);
    public RestorePasswordPage restorePasswordPage = page(RestorePasswordPage.class);

    public void closeDriver() {
        getWebDriver().quit();
    }

    public void logoutFromFirstPage() {
        firstPage.clickPersonalCabinetButton();
        accountPage.clickExitButton();
        loginPage.clickStellarBurgerLogo();
        Assert.assertTrue(firstPage.enterAccountButton.shouldBe(visible, Duration.ofSeconds(2)).isDisplayed());
    }
}
