package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// page_url = https://stellarburgers.nomoreparties.site/login
public class LoginPage {

    //локатор кнопки Войти
    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    public SelenideElement enterButton;

    //локатор поля ввода Email
    @FindBy(how = How.XPATH, using = "//*[text()='Email']")
    public SelenideElement emailInputField;

    //локатор поля ввода Пароль
    @FindBy(how = How.XPATH, using = "//*[text()='Пароль']")
    public SelenideElement passwordInputField;

    //локатор ссылки Зарегистрироваться
    @FindBy(how = How.LINK_TEXT, using = "Зарегистрироваться")
    public SelenideElement registrationLink;

    //локатор ссылки Восстановить пароль
    @FindBy(how = How.LINK_TEXT, using = "Восстановить пароль")
    public SelenideElement restorePasswordLink;

    //метод клика на кнопку Войти
    public void clickEnterButton() {
        enterButton.click();
    }

    //метода заполнения поля ввода Email
    public void enterEmail(String email) {
        emailInputField.sendKeys(email);
    }

    //метод заполнения поля ввода Пароль
    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    //метод клика на ссылку Зарегистрироваться
    public void clickRegistrationLink() {
        registrationLink.click();
    }

    //метод клика на ссылку Восстановите пароль
    public void clickRestorePasswordLink() {
        restorePasswordLink.click();
    }

}