package mert.week08.Personen2;

import java.util.ArrayList;
import java.util.List;

public class Personnnn2 {
    private int height;
    private int age;
    private String name;
    private int weight;

    public Personnnn2(String name, int height, int age, int weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Name: " + name +   "\n" +
                "Größe: " + height + "cm" + "\n" +
                "Alter: " + age + "\n"+
                "Gewicht: " + height + "Kg" + "\n\n";


    }
}
