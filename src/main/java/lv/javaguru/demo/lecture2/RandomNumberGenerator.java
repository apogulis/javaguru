package lv.javaguru.demo.lecture2;

import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Random generator = new Random();
        int randomInt = generator.nextInt(101);
        System.out.println("My random number is: " + randomInt);
    }
}
