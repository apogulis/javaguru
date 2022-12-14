package lv.javaguru.demo.lecture2;

public class Person {

    private String name;
    private int age;
    private int weight;
    private boolean isHungry;

    public Person(String name, int age, int weight, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isHungry = isHungry;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void eat(String food) {
        System.out.println("I ate " + food + " now");
        this.isHungry = false;
    }
}
