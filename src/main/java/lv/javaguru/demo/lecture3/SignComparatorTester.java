package lv.javaguru.demo.lecture3;

public class SignComparatorTester {

    public static void main(String[] args) {

        int[] numbers = {-1, 0, 1, -100, 100};

        SignComparator comparator = new SignComparator();
        for (int number : numbers) {
            System.out.printf("%s %s%n", number, comparator.compare(number));
        }
    }
}
