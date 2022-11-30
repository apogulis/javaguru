package lv.javaguru.demo.lecture3;

public class LightColorDetectorTester {

    public static void main(String[] args) {
        int[] wavelengths = {379, 380, 449, 450, 494, 495, 569, 570, 589, 590, 619, 620, 750, 751, 1000};

        LightColorDetector detector = new LightColorDetector();

        for (int wavelength : wavelengths) {
            System.out.printf("%s is %s%n", wavelength, detector.detect(wavelength));
        }
    }
}
