package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


// page_url = https://stellarburgers.nomoreparties.site/account/profile
public class AccountPage {

    //локатор для ссылки Выход
    @FindBy(how = How.XPATH, using = "//*[text()='Выход']")
    public SelenideElement exitButton;

    //локатор закладки Конструктор
    @FindBy(how = How.LINK_TEXT, using = "Конструктор")
    public SelenideElement constructorTabAccountPage;

    //метод клика по кнопке Выход
    public void clickExitButton() {
        exitButton.click();
    }

    //метод клика на закладку Конструктор
    public void clickConstructorTab() {
        constructorTabAccountPage.click();
    }
}