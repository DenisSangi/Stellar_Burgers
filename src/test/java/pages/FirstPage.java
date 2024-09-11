package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// page_url = https://stellarburgers.nomoreparties.site/
@Data
public class FirstPage {

    //УРЛ
    private String firstPageURL = "https://stellarburgers.nomoreparties.site/";

    //локатор кнопки Войти в аккаунт
    //private By enterAccountButton = new By.ByLinkText("Войти в аккаунт");
    @FindBy(how = How.XPATH, using = "//*[text()='Войти в аккаунт']")
    SelenideElement enterAccountButton;

    //метод клика на кнопку Войти в аккаунт
    public void clickEnterAccountButton() {
        enterAccountButton.click();
    }
}

