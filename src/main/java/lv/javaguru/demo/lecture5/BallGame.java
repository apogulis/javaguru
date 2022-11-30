package lv.javaguru.demo.lecture5;

import java.util.Random;
import java.util.Scanner;

public class BallGame {

    public static void main(String[] args) {
        Random random = new Random();
        int random_number;

        random_number = random.nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Number from 1 to 3!");

        int number;
        do {
            number = scanner.nextInt();
            if (number == random_number) {
                System.out.println("You guessed number " + random_number);
            } else {
                System.out.println("You Entered " + number + " and did not guess!");
            }
        } while (number != random_number);
    }
}
