package lv.javaguru.demo.lecture3;

public class SoundLevels {

    public static void main(String[] args) {
        int a = 129;

        if (a < 39) {
            System.out.println("Faint");
        } else if ((a >= 40) && (a < 69)) {
            System.out.println("Moderate");
        } else if ((a >= 70) && (a < 99)) {
            System.out.println("Very loud");
        } else if ((a >= 100) && (a <= 129)) {
            System.out.println("Extremely loud");
        } else {
            System.out.println("Painful");
        }
    }
}
