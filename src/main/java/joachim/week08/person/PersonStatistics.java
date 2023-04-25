package joachim.week08.person;

public class PersonStatistics {
    private int height;
    private int age;
    private String name;
    private int weight;

    public PersonStatistics(int heights, int ages, String names, int weights) {
        height = heights;
        age = ages;
        name = names;
        weight = weights;

    }
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nHeight: " +  height + "\nWeight: " + weight;
    }
}
