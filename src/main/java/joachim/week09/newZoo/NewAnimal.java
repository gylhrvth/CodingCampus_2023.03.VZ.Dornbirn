package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

public class NewAnimal {
    private String name;
    private String species;
    private int age;
    private int health;

    public NewAnimal(String name, String species, int age, int health) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public String getSpecies() {
        return species;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return Colors.COLORS[3] + "Name: " + name + " ,Species: " + species +
                Colors.COLORS[5] + ",AGE: Years: " + age / 365 + " Days: " + age % 365 +
                Colors.COLORS[2] + " Health: " + health + Colors.RESET;
    }
}