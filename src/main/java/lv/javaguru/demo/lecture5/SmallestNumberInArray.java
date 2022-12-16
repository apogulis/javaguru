package lv.javaguru.demo.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumberInArray {

    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < array.length; i++) {
            array[i]= number.nextInt();
        }

        int smallestNumber = array[0];

        for (int i=0; i < array.length; i++) {
            if (array[i] < smallestNumber)
                smallestNumber = array[i];
        }

        System.out.println("Your numbers are: " + Arrays.toString(array));
        System.out.println("The smallest number in array is: " + smallestNumber);
    }
}