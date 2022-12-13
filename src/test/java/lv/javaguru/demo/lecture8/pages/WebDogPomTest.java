package lv.javaguru.demo.lecture8.pages;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture8.pages.CarsPage;
import lv.javaguru.demo.lecture8.pages.DogsPage;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WebDogPomTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void dogPomTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openDogsPage();

        DogsPage dogsPage = new DogsPage(driver);
        dogsPage.inputMinAge(1);
        Thread.sleep(10000);

        Assertions.assertThat(dogsPage.getAgeInput()).isEqualTo(1);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
