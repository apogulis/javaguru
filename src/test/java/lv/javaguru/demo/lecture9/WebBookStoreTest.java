package lv.javaguru.demo.lecture9;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture9.model.ShopUser;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WebBookStoreTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void profileTest() throws InterruptedException {

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

        Thread.sleep(20000);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
