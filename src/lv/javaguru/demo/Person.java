package lv.javaguru.demo;

public class Person {
    private String name;
    private int age;
    private int weight;
    private static boolean isHungry;

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

    public static boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        Person.isHungry = isHungry;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Andris Javaguru ");
        person1.setAge(25);
        person1.setWeight(70);
        person1.setHungry(isHungry = true);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Weight (kg): " + person1.getWeight());
        System.out.println("Is the person hungry? " + isHungry());
    }


}
















