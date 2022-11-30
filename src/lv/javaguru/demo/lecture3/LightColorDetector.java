package lv.javaguru.demo.lecture3;

public class LightColorDetector {

    public String detect(int wavelength) {
        if ((wavelength <= 379) || (wavelength >= 751)) {
            return "Invisible";
        } else if (wavelength <= 449) {
            return "Violet";
        } else if (wavelength <= 494) {
            return "Blue";
        } else if (wavelength <= 569) {
            return "Green";
        } else if (wavelength <= 589) {
            return "Yellow";
        } else if (wavelength <= 619) {
            return "Orange";
        } else {
            return "Red";
        }
    }
}
