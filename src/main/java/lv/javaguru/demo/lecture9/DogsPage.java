package lv.javaguru.demo.lecture9;

import lv.javaguru.demo.lecture9.model.Dog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DogsPage {

    private static final By AGE_INPUT = By.xpath("//*[@id='f_o_1276_min']");
    private static final By SEARCH_BUTTON = By.xpath("//input[@type='submit']");
    private static final By DOG_RECORDS = By.xpath("//table//*[contains(@id,'tr_5')]");
    private WebDriver driver;

    public DogsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputAge(int age) {
        driver.findElement(AGE_INPUT).sendKeys(Integer.toString(age));
    }

    public int getAgeInputValue() {
        WebElement ageInput = driver.findElement(AGE_INPUT);
        String ageText = ageInput.getAttribute("value");
        return Integer.parseInt(ageText);
    }

    public void search() {
        driver.findElement(SEARCH_BUTTON).click();
    }

    public List<Dog> getAllDogs() {
        List<WebElement> dogsElements = driver.findElements(DOG_RECORDS);
        List<Dog> dogs = new ArrayList<>();
        for (WebElement dogElem : dogsElements) {
            dogs.add(new Dog(dogElem));
        }
        return dogs;
    }
}
