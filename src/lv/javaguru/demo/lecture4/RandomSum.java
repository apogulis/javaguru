package lv.javaguru.demo.lecture4;

import java.util.Random;

public class RandomSum {

        public static void main(String[] args) {
            int result = 0;
            for (int i = 0; i < 3; i++) {
                Random random = new Random();
                int randomGen = random.nextInt(101);
                result += randomGen;
                System.out.println("Cipars Nr." + i + ": " + randomGen);
            }
            System.out.println(result);
        }
    }

