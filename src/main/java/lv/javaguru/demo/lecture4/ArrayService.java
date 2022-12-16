package lv.javaguru.demo.lecture4;
import java.util.Random;

public class ArrayService {
    public static void main(String[] args) {

        int[] array = new int[5];

        Random fillRandomly = new Random();
            for(int i=0; i<array.length; i++) {
                array[i] = fillRandomly.nextInt((100 - 1) + 1) + 1;
                System.out.println("Random number is:" + array[i]);
            }
        int sum = 0;
            for (int i : array) {
                sum += i;
            }
        System.out.println("Sum is:" + sum);

        double averageSum = (double)sum/array.length;
            System.out.println("Average is:" + averageSum);
    }
}