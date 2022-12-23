package lv.javaguru.demo.lecture8.homework;

import org.openqa.selenium.WebDriver;

public class MainStorePage {

    private WebDriver driver;

    public MainStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebStore() {
        driver.get("https://www.saucedemo.com/");
    }

}
