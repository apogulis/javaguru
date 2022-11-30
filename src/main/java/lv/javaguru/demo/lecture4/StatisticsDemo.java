package lv.javaguru.demo.lecture4;

public class StatisticsDemo {

    public static void main(String[] args) {
        Statistics statistika = new Statistics();

        int[] numbers = {30, 20, 300, 10, 40, 100};
        int sum = 0;
        statistika.min = numbers[0]; //10
        statistika.max = numbers[0]; //300

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < statistika.min) {
                statistika.min = numbers[i];
            }
            if (numbers[i] > statistika.max) {
                statistika.max = numbers[i];
            }
            sum += numbers[i];
        }
        statistika.average = sum / numbers.length;

        System.out.println("\nMin:" + statistika.min);
        System.out.println("Max:" + statistika.max);
        System.out.println("Average:" + statistika.average);
    }
}
