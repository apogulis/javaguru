package lv.javaguru.demo.lecture2;

public class Main {

    public static void main(String[] args) {

//        CalculatorNewImproved kursi2022 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator = new CalculatorNewImproved();
//        CalculatorNewImproved calculator1 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator2 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator3 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator4 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator5 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator6 = new CalculatorNewImproved();
//        CalculatorNewImproved calculator7 = new CalculatorNewImproved();
//
//        System.out.println("SUM:" + calculator6.sum(100, 33));
//        System.out.println("SUB:" + calculator7.subtract(100, 33));
//        System.out.println("MUL:" + calculator4.multiply(100, 33));
//        System.out.println("DIV:" + calculator2.division(100, 33));

        Person persona1 = new Person("Jānis", 30, 95, true);
        System.out.println("Vārds:" + persona1.getName());
        persona1.setName("Kristaps");
        System.out.println("Vārds otrreiz:" + persona1.getName());

        System.out.println("Vai " + persona1.getName() + " ir izsalcis: " + persona1.isHungry());

        persona1.eat("Pusdienas");
        System.out.println("Vai " + persona1.getName() + " ir izsalcis: " + persona1.isHungry());

    }
}