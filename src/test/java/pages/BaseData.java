package pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public abstract class BaseData {

    public FirstPage firstPage = open("https://stellarburgers.nomoreparties.site/", FirstPage.class);
    public LoginPage loginPage = page(LoginPage.class);
}
