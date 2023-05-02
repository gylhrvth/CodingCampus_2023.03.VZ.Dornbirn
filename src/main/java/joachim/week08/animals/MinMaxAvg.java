package joachim.week08.animals;

public class MinMaxAvg {
    private int age;
    private double height;
    private int weight;

    public MinMaxAvg(int age, double height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MinMaxAvg{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}