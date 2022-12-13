package lv.javaguru.demo.lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CarsPage {
    private WebDriver driver;

    private static final By MIN_PRICE_INPUT = By.xpath("//*[@id='f_o_8_min']");

    private static final By MAX_PRICE_INPUT = By.xpath("//*[@id='f_o_8_max']");

    private static final By COLOR_SELECT_DROPDOWN = By.xpath("//*[@id='f_o_17']");

    public CarsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputMinPrice(int minPrice) {
        driver.findElement(MIN_PRICE_INPUT).sendKeys(Integer.toString(minPrice));
    }

    public void inputMaxPrice(int maxPrice) {
        driver.findElement(MAX_PRICE_INPUT).sendKeys(Integer.toString(maxPrice));
    }

    public void selectColor(String color) {
        Select colorDropdown = new Select(driver.findElement(COLOR_SELECT_DROPDOWN));
        colorDropdown.selectByVisibleText(color);
    }

}
