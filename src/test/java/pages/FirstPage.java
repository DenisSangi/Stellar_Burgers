package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://stellarburgers.nomoreparties.site/
public class FirstPage {

    //локатор кнопки Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[text()='Войти в аккаунт']")
    public SelenideElement enterAccountButton;

    //локатор кнопки Оформить заказ
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[2]/div/button")
    public SelenideElement makeOrderButton;

    //локатор кнопки Личный кабинет
    @FindBy(how = How.XPATH, using = "//*[text()='Личный Кабинет']")
    private SelenideElement personalCabinetButton;

    //локатор закладки Булки
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[1]/div[1]/span")
    private SelenideElement bunsTab;

    //локатор закладки Соусы
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[1]/div[2]/span")
    private SelenideElement sauceTab;

    //локатор закладки Начинки
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[1]/div[3]/span")
    private SelenideElement fillerTab;


    //метод клика на кнопку Войти в аккаунт
    public void clickEnterAccountButton() {
        enterAccountButton.click();
    }

    //метод клика на кнопку Личный кабинет
    public void clickPersonalCabinetButton() {
        personalCabinetButton.click();
    }

    //метод клика на вкладку Булки
    public boolean clickBunsTab() {
        bunsTab.click();
        return $(byXpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/ul[1]/a[1]/p")).isDisplayed();
    }

    //метод клика на вкладу Соусы
    public boolean clickSauceTab() {
        sauceTab.click();
        return $(byXpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/ul[2]/a[1]/p")).isDisplayed();
    }

    //метод клика на вкладу Начинки
    public boolean clickFillerTab() {
        fillerTab.click();
        return $(byXpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/ul[3]/a[1]/p")).isDisplayed();
    }
}
