package lv.javaguru.demo.lecture2;

import java.util.Random;

public class RandomSum {

    public static void main(String[] args) {
        Random generator = new Random();
        int randomInt1 = generator.nextInt(101);
        int randomInt2 = generator.nextInt(101);
        int result = randomInt1 + randomInt2;
        System.out.println(randomInt1);
        System.out.println(randomInt2);
        System.out.println("My random number is: " + result);
    }
}
