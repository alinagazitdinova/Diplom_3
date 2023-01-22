package burgersTests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import pom.BrowserRule;
import pom.MainPage;

public class ConstructorTests {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @DisplayName("Раздел Соусы  есть в Конструкторе")
    public void checkSauces() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.checkSauces();
    }

    @Test
    @DisplayName("Раздел Булки есть в Конструкторе")
    public void checkBuns() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.checkBuns();
    }

    @Test
    @DisplayName("Раздел Начинки есть в Конструкторе")
    public void checkFillings() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.checkFillings();
    }

    @Test
    @DisplayName("Переход по клику на кнопку бренда в хедере из ЛК")
    public void checkStellarBurger() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.clickLogin();
        mainPage.clickStellarBurger();
        mainPage.checkStellarBurger();
    }

    @Test
    @DisplayName("Переход по кнопке Конструктор из ЛК")
    public void checkDesignerButton() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.clickLogin();
        mainPage.clickConstructorButton();
    }

    @Test
    @DisplayName("провера перехода через кнопку Войти в аккаунт")
    public void checkLoginToAccount() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.clickLogin();
        mainPage.checkEnterPageOpen();

    }

    @Test
    @DisplayName("провера перехода через кнопку Личный кабинет")
    public void checkPersonalAccount() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open();
        mainPage.clickPersonalAccount();
        mainPage.checkEnterPageOpen();

    }
}
