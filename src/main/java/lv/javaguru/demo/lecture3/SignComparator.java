package lv.javaguru.demo.lecture3;

public class SignComparator {

    public String compare(int number) {

        if (number == 0) {
            return "Number is equal to zero";
        } else if (number > 0) {
            return "Number is positive";
        } else {
            return "Number is negative";
        }
    }
}