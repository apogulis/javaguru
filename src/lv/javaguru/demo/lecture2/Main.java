package lv.javaguru.demo.lecture2;

public class Main {

    public static void main(String[] args) {

        CalculatorImproved calculator = new CalculatorImproved();

        System.out.println("SUM:" + calculator.sum(100, 33));
        System.out.println("SUB:" + calculator.subtract(100, 33));
        System.out.println("MUL:" + calculator.multiply(100, 33));
        System.out.println("DIV:" + calculator.division(100, 33));
    }
}