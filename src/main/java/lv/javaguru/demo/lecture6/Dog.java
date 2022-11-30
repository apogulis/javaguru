package lv.javaguru.demo.lecture6;

public class Dog extends Animal {

    public String breed;
    public String favouriteMeat;

    public Dog(String name, String breed, String favouriteMeat) {
        super(name);
        this.breed = breed;
        this.favouriteMeat = favouriteMeat;
    }

    public void fetchBall() {
        System.out.println("I fetched the ball!!");
    }
}
