package eric.week08.person2;

import eric.Week01.PrimitiveDatentypen;
import eric.week08.calculateNumbers.CalcMinMaxAvgNumbers;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonV2 {
    private String name;
    private int age;
    private int height;
    private int weight;

    public PersonV2(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public PersonV2(int age, int height, int weight) {
        this.age = age;
        this.height = height;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV2 { " +
                "name: " + name +
                " | age: " + age +
                " | height: " + height +
                " | weight: " + weight +
                " }";
    }
}
