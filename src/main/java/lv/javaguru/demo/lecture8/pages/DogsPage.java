package lv.javaguru.demo.lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DogsPage {
    private WebDriver driver;

    private static final By DOGS_MIN_AGE_INPUT = By.xpath("//*[@id='f_o_1276_min']");

    public DogsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputMinAge(int minAge) {
        driver.findElement(DOGS_MIN_AGE_INPUT).sendKeys(Integer.toString(minAge));
    }
    public int getAgeInput() {
        WebElement ageInput = driver.findElement(DOGS_MIN_AGE_INPUT);
        String ageText = ageInput.getAttribute("value");
        return Integer.parseInt(ageText);
    }
}
