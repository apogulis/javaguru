package lv.javaguru.demo.lecture6;

import org.junit.Test;

public class DogTest {

    @Test
    public void dogTest() {
        Dog myDog = new Dog("Riko", "German shepherd", "Beef");
        System.out.println("Hi! My name is " + myDog.name);
        myDog.fetchBall();
        myDog.eat("Beef");
    }
}
