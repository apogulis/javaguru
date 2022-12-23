package lv.javaguru.demo.lecture8.pages;

import lv.javaguru.demo.lecture7.DriverFactory;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoOldStyleTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void cartItemTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        String loginLocator = "//*[@id='user-name']";
        WebElement loginInput = driver.findElement(By.xpath(loginLocator));
        loginInput.sendKeys("standard_user");
        Thread.sleep(2500);

        String passwordLocator = "//*[@id='password']";
        WebElement passwordInput = driver.findElement(By.xpath(passwordLocator));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(2500);

        String loginButtonLocator = "//*[@id='login-button']";
        WebElement pressLoginButton = driver.findElement(By.xpath(loginButtonLocator));
        pressLoginButton.click();
        Thread.sleep(2500);

        String addToCartJacketLocator = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']";
        WebElement pressAddToCartButton = driver.findElement(By.xpath(addToCartJacketLocator));
        pressAddToCartButton.click();
        Thread.sleep(2500);

        String shoppingCartLocator = "//*[@id='shopping_cart_container']";
        WebElement pressShoppingCartButton = driver.findElement(By.xpath(shoppingCartLocator));
        pressShoppingCartButton.click();
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
