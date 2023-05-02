package joachim.week08.animals;

public class Human {
    private String name;
    private int age;
    private double height;
    private int weight;

    public Human(String name, int age, double height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MinMaxAvg{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                "}\n";
    }
}
