package lv.javaguru.demo.lecture7;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebMulticopterTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void priceAndManufacturerTest() throws InterruptedException {
        driver.get("https://www.ss.com/lv/");
        String hobbyLocator = "//*[@id='mtd_282509']";
        WebElement hobbySectionLink = driver.findElement(By.xpath(hobbyLocator));
        hobbySectionLink.click();

        String radioControlledModelsLocator = "//*[@id='ahc_286490']";
        WebElement radioControlledModelsSectionLink = driver.findElement(By.xpath(radioControlledModelsLocator));
        radioControlledModelsSectionLink.click();

        String multicopterLocator = "//*[@id='ahc_286523']";
        WebElement multicopterSectionLink = driver.findElement(By.xpath(multicopterLocator));
        multicopterSectionLink.click();

        String priceFromLocator = "//*[@id='f_o_8_min']";
        WebElement priceFromInput = driver.findElement(By.xpath(priceFromLocator));
        priceFromInput.sendKeys("300");
        Thread.sleep(3000);

        String manufacturerLocator = "//*[@id='f_o_51']";
        WebElement manufacturerInput = driver.findElement(By.xpath(manufacturerLocator));
        manufacturerInput.sendKeys("Dji");
        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.xpath("//*[@class='b s12']"));
        submitButton.click();


        String actualManufacturer = driver.findElement(By.xpath("//*[@id='f_o_51']")).getAttribute("value");
        Assertions.assertThat(actualManufacturer).isEqualTo("Dji");

        String actualPrice = driver.findElement(By.xpath("//*[@id='f_o_8_min']")).getAttribute("value");
        Assertions.assertThat(actualPrice).isEqualTo("300");
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
