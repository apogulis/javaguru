package lv.javaguru.demo.finalproject.pages;

import lv.javaguru.demo.finalproject.model.WebStoreUser;
import lv.javaguru.demo.lecture7.DriverFactory;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FinalProjectCheckoutTest {
    private WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void addItemToCartAndCheckoutTest() throws InterruptedException {

        WebStoreUser user = new WebStoreUser("Andris","Pogulis","apogulis@gmail.com","28333333");

        MainStorePage mainStore = new MainStorePage(driver);
        mainStore.open();
        Thread.sleep(2500);


        mainStore.pressAcceptCookies();
        Thread.sleep(2500);

        ItemSearchPage searchPage = new ItemSearchPage(driver);
        searchPage.pressComputerEquipmentButton();
        searchPage.pressDataCarriersButton();
        Thread.sleep(2500);
        searchPage.pressExternalHardDrivesButton();
        Thread.sleep(2500);
        searchPage.chooseHardDriveCapacity();
        Thread.sleep(4000);
        searchPage.chooseHardDriveBrand();
        Thread.sleep(4000);
        searchPage.clickOnItemButton();
        searchPage.pressAddToCartButton();
        Thread.sleep(2500);

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.openShoppingCart();

        String actualItemName = driver.findElement(By.xpath("//a[@class='detailed-cart-item__name-link']")).getText();
        Assertions.assertThat(actualItemName).isEqualTo("Cietais disks Western Digital, HDD, 5 TB, melna");

        shoppingCartPage.pressContinueButton();
        Thread.sleep(2500);
        shoppingCartPage.enterEmailAddress(user.getEmail());
        shoppingCartPage.pressSubmitEmail();
        Thread.sleep(2500);
        shoppingCartPage.pickReceiveItemInStoreOption();
        Thread.sleep(2500);
        shoppingCartPage.chooseStoreAddress();
        Thread.sleep(2500);

        shoppingCartPage.enterFirstName(user.getFirstName());
        shoppingCartPage.enterLastName(user.getLastName());
        shoppingCartPage.enterPhoneNumber(user.getPhoneNumber());
        Thread.sleep(2500);

        shoppingCartPage.pressSaveInformationButton();
        Thread.sleep(2500);
        shoppingCartPage.pressContinueToPaymentButton();
        Thread.sleep(2500);
        shoppingCartPage.choosePayInStoreOption();
        Thread.sleep(6000);

        String actualTotalPrice = driver.findElement(By.xpath("//span[@class='checkout-order-summary-total__price']")).getText();
        Assertions.assertThat(actualTotalPrice).isEqualTo("113,00 €");

        System.out.println("Item name: " + actualItemName);
        System.out.println("Total price: " + actualTotalPrice);

        Thread.sleep(6000);
    }
    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
