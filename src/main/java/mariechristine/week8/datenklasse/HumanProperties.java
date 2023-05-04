package mariechristine.week8.datenklasse;

public class HumanProperties {
    private String fullName;
    private int size;
    private int age;
    private double weight;

    public HumanProperties(String fullName, int size, int age, double weight) {
        this.fullName = fullName;
        this.size = size;
        this.age = age;
        this.weight = weight;

    }

    public int getSize(){
        return size;
    }

    public int getAge(){
        return age;
    }

    public String getFullName(){
        return fullName;
    }

    public double getWeight(){
        return weight;
    }

    public String toString(){
        return "Personal data of " + fullName + " are listed below:\nAge: " + age + "\nSize: " + size + "\nWeight: " + weight + "";
    }

}
