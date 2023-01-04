package lv.javaguru.demo.finalproject.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FinalProjectSelenideTest {
    @Test
    public void webCheckoutTest() throws InterruptedException {
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://www.1a.lv/");
        Thread.sleep(2500);

        $(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        Thread.sleep(2500);

        $(By.xpath("(//li[@class='submenu-lvl1__list-item color-theme-17 submenu-lvl1__list-item--has-child']/a)[2]")).click(); //click on Datortehnika
        $(By.xpath("(//ul[@class='menu product-categories-menu'] /li)[6]")).click(); //click on Datu nesēji
        $(By.xpath("(//ul[@class='din-list new-cat-list'] /li)[3]")).click(); //click on External Hard Drives
        $(By.xpath("(//span[@class='catalog-taxons-visual-filter-slider__title'])[4]")).click(); //choose 5 TB hard drives
        $(By.xpath("//a[@data-value='2p3']")).click(); //choose Western Digital hard drives
        Thread.sleep(2500);

        $(By.xpath("//a[@class='catalog-taxons-product__name' and @data-gtm-link='350551']")).click(); //add hard drive to the shopping cart
        $(By.xpath("//a[@class='main-button']")).click(); //open shopping cart
        $(By.xpath("//input[@class='main-button cart-main-button']")).click(); //press continue button
        $(By.xpath("//form[@id='new_user_guest']//input[@type='email']")).sendKeys("apogulis@gmail.com"); //enter your email address
        $(By.xpath("//input[@type='submit' and @value='Turpināt']")).click(); //press submit email button
        $(By.xpath("//input[@name='shipping_unused' and @value='2']")).click(); //choose to receive item in the store
        $(By.xpath("//input[@name='pickup_point_id' and @value='3543']")).click(); //choose store address

        $(By.xpath("//input[@id='address_first_name']")).sendKeys("Andris");
        $(By.xpath("//input[@id='address_last_name']")).sendKeys("Pogulis");
        $(By.xpath("//input[@id='address_phone_number']")).sendKeys("28333333");

        $(By.xpath("//button[@class='main-button upcase button-min-width']")).click(); //save your information
        $(By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']")).click(); //continue to payment
        $(By.xpath("//input[@id='payment_unused_22']")).click(); //choose pay in store

        Thread.sleep(6000);
    }
}
