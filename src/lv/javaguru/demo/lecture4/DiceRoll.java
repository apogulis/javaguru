package lv.javaguru.demo.lecture4;

import java.util.Random;

public class DiceRoll {

    /**
     * Throw dice, until 6 is thrown and then print out the count how many times it took.
     *
     * @param args
     */

    public static void main(String[] args) {

        int i = 0;
        int diceValue = 0;
        Random random = new Random();

        while (diceValue != 6) {
            diceValue = random.nextInt(6) + 1;
            System.out.println("Dice:" + diceValue);
            i++;
        }
        System.out.printf("\nIt took %s throws!%n", i);
    }
}
