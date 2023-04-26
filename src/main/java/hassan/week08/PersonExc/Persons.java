package hassan.week08.PersonExc;

public class Persons {
    private String name;
    private int age;
    private int height;
    private double weight;


    public Persons(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "Name    : " + name + "\n" +
                "Age     : " + age + " years old" + "\n" +
                "Height  : " + height + " cm" + "\n" +
                "Weight  : " + weight + "kg" + "\n";

    }


}
