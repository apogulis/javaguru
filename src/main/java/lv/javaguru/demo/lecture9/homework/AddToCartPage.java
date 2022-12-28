package lv.javaguru.demo.lecture9.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    private static final By SEARCH_INPUT = By.xpath("//*[@id='search']");

    private static final By SEARCH_BUTTON = By.xpath("//*[@class='button']");

    private static final By BOOK_TITLE_BUTTON = By.xpath("//*[@id='product-48329']");

    private static final By ADD_BOOK_TO_CART_BUTTON = By.xpath("//*[@id='product-addtocart-button']");

    private static final By CART_CHECKOUT_BUTTON = By.xpath("//*[@class='mini-cart-heading dropdown-heading cover skip-link skip-cart']");



    private static WebDriver driver;
    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public AddToCartPage enterSearchKeyword(String keyword) {
        driver.findElement(SEARCH_INPUT).sendKeys(keyword);
        return this;
    }
    public void pressSearchButton() {
        driver.findElement(SEARCH_BUTTON).click();
    }
    public void pressBookTitle() {
        driver.findElement(BOOK_TITLE_BUTTON).click();
    }

    public void addBookToCart() { driver.findElement(ADD_BOOK_TO_CART_BUTTON).click();}

    public void pressCartCheckoutButton() { driver.findElement(CART_CHECKOUT_BUTTON).click();}
}
