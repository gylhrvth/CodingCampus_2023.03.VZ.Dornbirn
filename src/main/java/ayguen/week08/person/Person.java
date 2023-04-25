package ayguen.week08.person;

public class Person {

    private String personName;
    private int age;
    private double height;
    private double weight;

    public Person(String personName, int age, double height, double weight){
        this.personName = personName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String personName() {
        return personName;
    }
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Hallo! Mein Name ist " + personName + " und bin " + age + " Jahre alt.";
    }
}
