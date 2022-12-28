package lv.javaguru.demo.lecture9;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture9.homework.AddToCartPage;
import lv.javaguru.demo.lecture9.model.ShopUser;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddBookToCartTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void addBookToCartTest() throws InterruptedException {

        ShopUser user = new ShopUser("Andris", "Javaguru", "andris@testakonts.com", "javaguru21", "11111111");

        MainShopPage mainShop = new MainShopPage(driver);
        ProfilePage profilePage = mainShop.open()
                .goToProfile()
                .inputEmail(user.getEmail())
                .inputPassword(user.getPassword())
                .logIn();

        Assertions.assertThat(profilePage.isDisplayed()).isTrue();
        String contactDetails = profilePage.getContactDetails();
        SoftAssertions soft = new SoftAssertions();
        soft.assertThat(contactDetails).contains(user.getName());
        soft.assertThat(contactDetails).contains(user.getLastName());
        soft.assertThat(contactDetails).contains(user.getEmail());
        soft.assertThat(contactDetails).contains(user.getPhoneNumber());
        soft.assertAll();

        Thread.sleep(15000);

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.enterSearchKeyword("kvalitāte");
        addToCartPage.pressSearchButton();
        addToCartPage.pressBookTitle();
        addToCartPage.addBookToCart();
        addToCartPage.pressCartCheckoutButton();

        Thread.sleep(5000);

        String actualBookNameInCart = driver.findElement(By.xpath("//*[@class='product-name']")).getText();
        Assertions.assertThat(actualBookNameInCart).contains("KVALITĀTES NODROŠINĀŠANAS VADĪBA");

        String actualBookPriceInCart = driver.findElement(By.xpath("//*[@class='cart-price']")).getText();
        Assertions.assertThat(actualBookPriceInCart).contains("€10,93");

        System.out.println("Book name in cart: " + actualBookNameInCart);
        System.out.println("Book price in cart: " + actualBookPriceInCart);
    }
    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
