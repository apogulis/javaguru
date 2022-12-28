package lv.javaguru.demo.lecture11;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SelenideLaptopTest {
    @Test
    public void LaptopTest() throws InterruptedException {

        Configuration.browserSize = "1920x1080";
        Selenide.open("https://www.1a.lv/");

        $(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        $(By.partialLinkText("Datortehnika, preces birojam")).click();
        $(By.partialLinkText("Portatīvie datori un aksesuāri")).click();
        $(By.xpath("//img[contains(@src, 'LOGO_LENOVO.jpg')]")).click();

        Thread.sleep(8000);
    }
}
