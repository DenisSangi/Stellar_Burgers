package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


// page_url = https://stellarburgers.nomoreparties.site/account/profile
public class AccountPage {

    //локатор для ссылки Выход
    @FindBy(how = How.XPATH, using = "//*[text()='Выход']")
    private SelenideElement exitButton;

    //метод клика по кнопке Выход
    public void clickExitButton() {
        exitButton.click();
    }
}