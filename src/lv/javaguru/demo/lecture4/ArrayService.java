package lv.javaguru.demo.lecture4;

import java.util.Random;

public class ArrayService {
    public static void main(String[] args) {
        public int[] create(int size) {
            int[] size = new int[9];
        }
        public void fillRandomly(int[] array) {
            Random randomSize = new Random();
            for(int i=0; i<size.length; i++) {
                size[i] = randomSize.nextInt();
                System.out.println("Random numbers are:" + randomSize);
            }
        }
        public void printArray(int[] array) {
            for (int i = 0; i<size.length; i++) {
                System.out.println(size[i]);
            }
        }
        public int sum(int[] array) {
            int sum = 0;
            for (int i : size) {
                sum += i;
                System.out.println("Sum is:" + sum);
            }
        }
        public double avg(int[] array) {
            double avgSum = sum/size.length;
            System.out.println("Average is:" + avgSum);
        }
    }
}
