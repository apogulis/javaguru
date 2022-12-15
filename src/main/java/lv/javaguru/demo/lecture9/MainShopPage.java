package lv.javaguru.demo.lecture9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainShopPage {

    private static final String BASE_URL = "https://www.janisroze.lv/";
    private static final By PROFILE_BUTTON = By.xpath("//ul[contains(@class,'account-dropdown')]");
    private WebDriver driver;

    public MainShopPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainShopPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public LoginPage goToProfile() {
        driver.findElement(PROFILE_BUTTON).click();
        return new LoginPage(driver);
    }
}
