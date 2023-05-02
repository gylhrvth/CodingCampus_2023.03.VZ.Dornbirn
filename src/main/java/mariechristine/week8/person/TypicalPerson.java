package mariechristine.week8.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class TypicalPerson {
    private String fullName;
    private int age;
    private int height;
    private double weight;

    public TypicalPerson(String fullName, int age, int height, double weight) {
        this.fullName = fullName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "TypicalPerson{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}