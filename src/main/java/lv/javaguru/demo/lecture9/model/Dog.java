package lv.javaguru.demo.lecture9.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dog {

    private static final By BREED_FIELD = By.xpath("td[4]");
    private WebElement rootElement;

    public Dog(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public void open() {
        rootElement.click();
    }

    public String getBreed() {
        return rootElement.findElement(BREED_FIELD).getText();
    }
}
