package lv.javaguru.demo.lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    private static final By CARS_LINK = By.xpath("//*[@id='mtd_97']");
    private static final By DOGS_LINK = By.xpath("//*[@id='mtd_300']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.ss.com/lv/");
    }

    public void openCarsPage() {
        driver.findElement(CARS_LINK).click();
    }
    public void openDogsPage() {
        driver.findElement(DOGS_LINK).click();
    }

}
