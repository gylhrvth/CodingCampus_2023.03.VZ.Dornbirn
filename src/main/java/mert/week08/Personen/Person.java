package mert.week08.Personen;

public class Person {
    private int groese;
    private int alter;
    private String name;
    private int gewicht;

    public Person(String name) {
        this.groese = 175;
        this.alter = 24;
        this.name = name;
        this.gewicht = 67;
    }

    @Override
    public String toString() {
        return "Größe: " + groese + "cm" + "\n" +
                "Alter: " + alter + "\n"+
                "Name: " + name +   "\n" +
                "Gewicht: " + gewicht + "Kg";
    }
}
