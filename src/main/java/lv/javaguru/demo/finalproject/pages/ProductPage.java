package lv.javaguru.demo.finalproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private static final By CART_ITEM_NAME = By.xpath("//a[@class='detailed-cart-item__name-link']");

    private static final By TOTAL_PRICE = By.xpath("//span[@class='checkout-order-summary-total__price']");

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartItemName() {
        return driver.findElement(CART_ITEM_NAME).getText();
    }

    public String getItemTotalPrice() {
        return driver.findElement(TOTAL_PRICE).getText();
    }

    String expectedItemName = "Cietais disks Western Digital, HDD, 5 TB, melna";
    String expectedTotalPrice = "113,00 €";
}
