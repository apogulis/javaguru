package lv.javaguru.demo.finalproject.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lv.javaguru.demo.finalproject.model.WebStoreUser;
import lv.javaguru.demo.finalproject.pages.ItemSearchPage;
import lv.javaguru.demo.finalproject.pages.MainStorePage;
import lv.javaguru.demo.finalproject.pages.ShoppingCartPage;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutStepdefs {

    private final WebDriver driver = new ChromeDriver();
    MainStorePage mainStore = new MainStorePage(driver);
    ItemSearchPage searchPage = new ItemSearchPage(driver);
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
    WebStoreUser user = new WebStoreUser("Andris","Pogulis","apogulis@gmail.com","28333333");


    @Before
    public void setUpDriver() {
        driver.manage().window().maximize();
    }
    @Given("web store page is open")
    public void web_store_page_is_open () {
        mainStore.open();
        System.setProperty("timeout", String.valueOf(5000));
        mainStore.pressAcceptCookies();
        System.setProperty("timeout", String.valueOf(2500));
    }
    @Given("item is added to the cart")
    public void item_is_added_to_the_cart () {
        searchPage.pressComputerEquipmentButton();
        searchPage.pressDataCarriersButton();
        searchPage.pressExternalHardDrivesButton(); //i have error in here, 'element is not attached to the page document'
        System.setProperty("timeout", String.valueOf(5000));
        searchPage.chooseHardDriveCapacity();
        searchPage.chooseHardDriveBrand();
        searchPage.clickOnItemButton();
        searchPage.pressAddToCartButton();
    }
    @Given("payment option had been chosen")
    public void payment_option_had_been_chosen () {
        shoppingCartPage.openShoppingCart();
        shoppingCartPage.pressContinueButton();
        shoppingCartPage.enterEmailAddress(user.getEmail());
        shoppingCartPage.pressSubmitEmail();
        shoppingCartPage.pickReceiveItemInStoreOption();
        shoppingCartPage.chooseStoreAddress();
    }
    @Given("customer information had been entered")
    public void customer_information_had_been_entered () {
        shoppingCartPage.enterFirstName(user.getFirstName());
        shoppingCartPage.enterLastName(user.getLastName());
        shoppingCartPage.enterPhoneNumber(user.getPhoneNumber());
        shoppingCartPage.pressSaveInformationButton();
        shoppingCartPage.pressContinueToPaymentButton();
        shoppingCartPage.choosePayInStoreOption();
    }
    @Then("verify that added item and price is correct")
    public void verify_that_added_item_and_price_is_correct () {

    }
    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
