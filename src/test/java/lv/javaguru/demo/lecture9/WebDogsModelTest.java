package lv.javaguru.demo.lecture9;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture9.DogsPage;
import lv.javaguru.demo.lecture8.pages.MainPage;
import lv.javaguru.demo.lecture9.model.Dog;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class WebDogsModelTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoTest() {

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openDogsPage();

        DogsPage dogsPage = new DogsPage(driver);
        dogsPage.inputAge(1);

        Assertions.assertThat(dogsPage.getAgeInputValue()).isEqualTo(1);
        dogsPage.search();

        List<Dog> dogs = dogsPage.getAllDogs();
        System.out.println("\n\nPieejamās šķirnes:");
        for (Dog dog : dogs) {
            System.out.println(dog.getBreed());
        }
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
