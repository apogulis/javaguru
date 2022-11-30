package lv.javaguru.demo.lecture5;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu ievadii skaitli!");

        int number;
        do {
            number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Jūs ievadījāt:" + number);
            }
        } while (number != -1);
    }
}
