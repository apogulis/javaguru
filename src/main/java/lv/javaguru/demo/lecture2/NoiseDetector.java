package lv.javaguru.demo.lecture2;

public class NoiseDetector {
    public static void main(String[] args) {
        int noise = 69;
        if (noise <= 39) {
            System.out.println("Faint");
        } else if ((noise >= 40) && (noise <= 69)) {
            System.out.println("Moderate");
        } else if ((noise >= 70) && (noise <= 99)) {
            System.out.println("Very loud");
        } else if ((noise >= 100) && (noise <= 129)) {
            System.out.println("Extremely loud");
        } else {
            System.out.println("Painful");
        }
    }
}
