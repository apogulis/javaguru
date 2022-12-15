package lv.javaguru.demo.lecture9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {

    private static final By CONTACT_DETAILS = By.xpath("//*[contains(@class,'box-account')]//*[@class='col-1']//*[@class='box-content']");
    private WebDriver driver;


    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONTACT_DETAILS));
        return true;
    }

    public String getContactDetails() {
        return driver.findElement(CONTACT_DETAILS).getText().trim();
    }
}
