package benjamin.week08.PersonEx;

public class DataOfPerson {

    private double height;
    private int age;
    private String name;
    private double weight;

    public DataOfPerson(double height, int age, String name, double weight){
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name:   " + name + "\nAge:    " + age + "\nHeight: " + height + "m" + "\nWeight: " + weight + "kg";
    }
}
