package lv.javaguru.demo.lecture2;

import java.util.Random;

public class DemoSum {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomint = generator.nextInt(101);
        System.out.println("My random nummber is; " +randomint);
    }
}
