package lv.javaguru.demo.lecture8.pages;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture8.homework.CartPage;
import lv.javaguru.demo.lecture8.homework.LoginPage;
import lv.javaguru.demo.lecture8.homework.MainStorePage;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebCartTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void cartItemTest() throws InterruptedException {
        MainStorePage mainStorePage = new MainStorePage(driver);
        mainStorePage.openWebStore();
        Thread.sleep(3000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        Thread.sleep(2500);
        loginPage.enterPassword("secret_sauce");
        Thread.sleep(2500);
        loginPage.pressLoginButton();
        Thread.sleep(3000);

        CartPage cartPage = new CartPage(driver);
        cartPage.pressBuyJacketButton();
        Thread.sleep(2500);
        cartPage.pressOpenShoppingCartButton();
        Thread.sleep(2500);

        String actualBoughtItem = driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText();
        Assertions.assertThat(actualBoughtItem).contains("Sauce Labs Fleece Jacket");

        String actualPriceOfItem = driver.findElement(By.xpath("//*[@class='inventory_item_price']")).getText();
        Assertions.assertThat(actualPriceOfItem).contains("49.99");

        System.out.println("Item in shopping cart: " + actualBoughtItem);
        System.out.println("Price of Item: " + actualPriceOfItem);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}