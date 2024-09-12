package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// page_url = https://stellarburgers.nomoreparties.site/forgot-password
public class RestorePasswordPage {

    //локатор ссылки Войти
    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    private SelenideElement enterLink;

    //метод клика на ссылку Войти
    public void clickEnterLink() {
        enterLink.click();
    }
}