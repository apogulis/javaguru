package lv.javaguru.demo.lecture4;

import java.util.Arrays;

public class ArrayMin {

    public static void main(String[] args) {
        int[] numbers = {98, 9, 6, 16, 21};
        System.out.println("Array: " + Arrays.toString(numbers));
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest number: " + min);
    }
}
