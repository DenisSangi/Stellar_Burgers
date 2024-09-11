package pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BaseData {

    public FirstPage firstPage = open("https://stellarburgers.nomoreparties.site/", FirstPage.class);
    public LoginPage loginPage = page(LoginPage.class);
    public RegistrationPage registrationPage = page(RegistrationPage.class);

    public void closeDriver() {
        getWebDriver().quit();
    }
}
