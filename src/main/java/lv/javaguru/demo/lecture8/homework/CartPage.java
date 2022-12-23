package lv.javaguru.demo.lecture8.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private static final By ADD_JACKET_TO_CART = By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");

    private static final By OPEN_SHOPPING_CART = By.xpath("//*[@id='shopping_cart_container']");

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void pressBuyJacketButton() {
        driver.findElement(ADD_JACKET_TO_CART).click();
    }

    public void pressOpenShoppingCartButton() {
        driver.findElement(OPEN_SHOPPING_CART).click();
    }
}
