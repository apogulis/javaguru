package lv.javaguru.demo.lecture7;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebCarsTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void CarTest() throws InterruptedException {
        driver.get("https://www.ss.com/lv/");
        String carsLocator = "//*[@id='mtd_97']";
        WebElement carSectionLink = driver.findElement(By.xpath(carsLocator));
        carSectionLink.click();

        String priceFromLocator = "//*[@id='f_o_8_min']";
        WebElement priceFromInput = driver.findElement(By.xpath(priceFromLocator));
        priceFromInput.sendKeys("6000");
        Thread.sleep(3000);

        WebElement priceToInput = driver.findElement(By.xpath("//*[@id='f_o_8_max']"));
        priceToInput.sendKeys("10000");
        Thread.sleep(3000);

        Select dropDownColor = new Select(driver.findElement(By.xpath("//*[@id='f_o_17']")));
        String whiteColorValue = "6318";
        dropDownColor.selectByValue("6318");

        WebElement submitButton = driver.findElement(By.xpath("//*[@class='b s12']"));
        submitButton.click();


    }
    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
