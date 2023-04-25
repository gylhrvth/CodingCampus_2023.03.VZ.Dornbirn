package joachim.week08.person;

public class PersonStatistics {
    private int height;
    private int age;
    private String name;
    private int weight;

    public PersonStatistics(int height, int age, String name, int weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;

    }
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nHeight: " +  height + "\nWeight: " + weight;
    }
}
