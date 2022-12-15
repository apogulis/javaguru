package lv.javaguru.demo.lecture7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebStoreTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoTest() throws InterruptedException {
        driver.get("https://220.lv/lv/");

        WebElement cookiesAcceptButton = driver.findElement(By.xpath("//button[@widget-attachpoint='agree']"));
        cookiesAcceptButton.click();

        WebElement searchInput = driver.findElement(By.xpath("//*[@id='searchInput']"));
        searchInput.sendKeys("Intel");

        WebElement searchSubmitButton = driver.findElement(By.xpath("//*[@widget-attachpoint='searchBarSubmitButton']"));
        searchSubmitButton.click();

        Thread.sleep(1000);

        WebElement priceFrom = driver.findElement(By.xpath("//*[@class='price-from']"));
        WebElement priceTo = driver.findElement(By.xpath("//*[@class='price-to']"));
        priceFrom.sendKeys("50");
        priceTo.click();
        priceTo.sendKeys(Keys.ARROW_RIGHT);
        priceTo.sendKeys(Keys.BACK_SPACE);
        priceTo.sendKeys(Keys.BACK_SPACE);
        priceTo.sendKeys(Keys.BACK_SPACE);
        priceTo.sendKeys(Keys.BACK_SPACE);
        priceTo.sendKeys("300");

        Thread.sleep(10000);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
