package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// page_url = https://stellarburgers.nomoreparties.site/
public class FirstPage {

    //локатор кнопки Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[text()='Войти в аккаунт']")
    public SelenideElement enterAccountButton;

    //локатор кнопки Оформить заказ
    @FindBy(how = How.XPATH, using = "//*[text()='Оформить заказ']")
    public SelenideElement makeOrder;


    //метод клика на кнопку Войти в аккаунт
    public void clickEnterAccountButton() {
        enterAccountButton.click();
    }
}

