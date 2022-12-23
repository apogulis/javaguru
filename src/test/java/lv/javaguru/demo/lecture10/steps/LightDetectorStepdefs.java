package lv.javaguru.demo.lecture10.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lv.javaguru.demo.lecture3.LightColorDetector;
import org.assertj.core.api.Assertions;

public class LightDetectorStepdefs {

    private static Integer wavelength;

    @When("light shines {int} Hz")
    public void light_shines_hz(Integer wavelength) {
        LightDetectorStepdefs.wavelength = wavelength;
    }

    @Then("it should be {string}")
    public void it_is_invisible(String lightDesc) {
        LightColorDetector detector = new LightColorDetector();
        Assertions.assertThat(detector.detect(LightDetectorStepdefs.wavelength)).isEqualTo(lightDesc);
    }
}
