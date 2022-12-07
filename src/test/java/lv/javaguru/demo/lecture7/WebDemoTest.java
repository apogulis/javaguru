package lv.javaguru.demo.lecture7;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDemoTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoTest() throws InterruptedException {
        driver.get("https://www.ss.com/lv/");
        String dogsLocator = "//*[@id='mtd_300']";
        WebElement dogsSectionLink = driver.findElement(By.xpath(dogsLocator));
        dogsSectionLink.click();

        String ageFromLocator = "//*[@id='f_o_1276_min']";
        WebElement ageFromInput = driver.findElement(By.xpath(ageFromLocator));
        ageFromInput.sendKeys("1");
        Thread.sleep(5000);

        String actualAge = ageFromInput.getAttribute("value");
        Assertions.assertThat(actualAge).isEqualTo("1");


    }
    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
