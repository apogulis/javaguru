package lv.javaguru.demo.lecture9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final By EMAIL_INPUT = By.xpath("//*[@id='email']");
    private static final By PASSWORD_INPUT = By.xpath("//*[@id='pass']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@id='send2']");
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage inputEmail(String email) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        return this;
    }

    public ProfilePage logIn() {
        driver.findElement(LOGIN_BUTTON).click();
        return new ProfilePage(driver);
    }
}