package lv.javaguru.demo.lecture6;

import lv.javaguru.demo.lecture3.LightColorDetector;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LightColorDetectorTest extends TestBase {

    @Test
    public void violetTest() {
        LightColorDetector detector = new LightColorDetector();

        assertThat(detector.detect(490)).as("Violet detector").isEqualTo("Blue");
        System.out.println("Violet test successful!");
    }

    @Test
    public void blueTest() {
        LightColorDetector detector = new LightColorDetector();

        assertThat(detector.detect(440)).as("Blue detector").isEqualTo("Violet");
        System.out.println("Blue test successful!");
    }
}
