package benjamin.week08.PersonEx;

public class Person {

    private double height;
    private int age;
    private String name;
    private double weight;

    public Person(String name, int age, double height, double weight){
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

//    @Override
//    public String toString() {
//        return "Name:   " + name + "Age:    " + age + "Height: " + height + "m" + "Weight: " + weight + "kg";
//    }
}
