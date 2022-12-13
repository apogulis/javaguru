package lv.javaguru.demo.lecture8.pages;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture8.pages.CarsPage;
import lv.javaguru.demo.lecture8.pages.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class WebCarsPomTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoPomTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openCarsPage();

        CarsPage carsPage = new CarsPage(driver);
        carsPage.inputMinPrice(6000);
        carsPage.inputMaxPrice(10000);
        carsPage.selectColor("Balta");

        Thread.sleep(10000);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
