package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

public class NewAnimal {
    private String name;
    private String species;
    private int age;

    public NewAnimal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;}

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }


    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return Colors.COLORS[3] +"Name: " + name + " ,Species: " + species + ",Age: " + age + Colors.RESET;
    }
}