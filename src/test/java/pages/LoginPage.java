package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://stellarburgers.nomoreparties.site/login
public class LoginPage {

    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    public SelenideElement enterButton;
}