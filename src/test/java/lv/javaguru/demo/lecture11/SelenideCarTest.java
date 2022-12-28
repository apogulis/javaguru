package lv.javaguru.demo.lecture11;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SelenideCarTest {

    @Test
    public void CarTest() throws InterruptedException {
        Selenide.open("https://www.ss.lv/");

        $(By.id("mtd_97")).click();

        $(By.id("f_o_8_min")).sendKeys("6000");
        $(By.id("f_o_8_max")).sendKeys("10000");

        $(By.id("f_o_17")).selectOption("Balta");

        Thread.sleep(8000);
    }
}
