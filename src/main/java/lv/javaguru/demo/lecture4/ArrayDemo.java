package lv.javaguru.demo.lecture4;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;
        System.out.println("Array:" + Arrays.toString(numbers));
        System.out.println("Summa:" + sum);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\nApstrādāju skaitli numbers[" + i + "]=" + numbers[i]);
            sum += numbers[i];
            System.out.println("Summa:" + sum);
        }
        System.out.println("\nSumma ir " + sum);
    }
}
