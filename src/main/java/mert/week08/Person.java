package mert.week08;

public class Person {
    private int größe;
    private int alter;
    private String name;
    private int gewicht;

    public Person(String name) {
        this.größe = 0;
        this.alter = 0;
        this.name = name;
        this.gewicht = 0;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Größe: " + größe + "Alter: " + alter + "Name: " + name + "Gewicht: " + gewicht;
    }
}
