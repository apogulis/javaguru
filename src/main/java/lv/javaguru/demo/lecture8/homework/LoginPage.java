package lv.javaguru.demo.lecture8.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final By USERNAME_INPUT = By.xpath("//*[@id='user-name']");

    private static final By PASSWORD_INPUT = By.xpath("//*[@id='password']");

    private static final By LOGIN_BUTTON = By.xpath("//*[@id='login-button']");

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage enterUsername(String username) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        return this;
    }

    public void pressLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }
}
