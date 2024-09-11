package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// page_url = https://stellarburgers.nomoreparties.site/register
public class RegistrationPage {

    //локатор поля ввода Имя
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/fieldset[1]/div/div/input")
    public SelenideElement nameInputField;

    //локатор поля ввода Email
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input")
    public SelenideElement emailInputField;

    //Локатор поля ввода Пароль
    @FindBy(how = How.XPATH, using = "//input[contains(@name, 'Пароль')]")
    public SelenideElement passwordInputField;

    //Локатор кнопки Зарегистрироваться
    @FindBy(how = How.XPATH, using = "//*[text()='Зарегистрироваться']")
    public SelenideElement registrationButton;

    //локатор ошибкт Некорректный пароль
    @FindBy(how = How.XPATH, using = "//*[text()='Некорректный пароль']")
    public SelenideElement incorrectPasswordErrorMessage;

    //метод заполнения поля ввода Имя
    public void enterName(String name) {
        nameInputField.sendKeys(name);
    }

    //метод заполнения поля ввода Email
    public void enterEmail(String email) {
        emailInputField.sendKeys(email);
    }

    //метод заполнения поля ввода Пароль
    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    //метод клика на кнопку Зарегистрироваться
    public void clickRegistrationButton() {
        registrationButton.click();
    }

}