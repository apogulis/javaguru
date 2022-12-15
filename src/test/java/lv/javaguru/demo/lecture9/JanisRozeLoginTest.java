package lv.javaguru.demo.lecture9;

import lv.javaguru.demo.lecture7.DriverFactory;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JanisRozeLoginTest {
    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void CarTest() throws InterruptedException {
        driver.get("https://www.janisroze.lv/lv/customer/account/login/");
        WebElement loginInput = driver.findElement(By.xpath("//*[@id='email']"));
        String username = "andris@testakonts.com";
        loginInput.sendKeys(username);
        Thread.sleep(3000);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='pass']"));
        passwordInput.sendKeys("javaguru21");
        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.xpath("//*[@id='send2']"));
        submitButton.click();

        Thread.sleep(10000);

    }
    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}