package eric.week08.personData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PersonData {
    private int height;
    private int age;
    private String name;
    private int weight;


    public PersonData(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {return "Name: " + name + "\nAge: " + age + "\nHeight: " +
            height + "cm\nWeight: " + weight + "kg";}
}
