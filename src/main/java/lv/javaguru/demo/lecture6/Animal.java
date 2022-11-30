package lv.javaguru.demo.lecture6;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println("I am eating " + food);
    }
}
