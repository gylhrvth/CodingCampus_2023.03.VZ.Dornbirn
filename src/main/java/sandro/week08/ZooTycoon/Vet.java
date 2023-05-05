package sandro.week08.ZooTycoon;

import lukas.week03.day4.Colors;

import java.util.Random;
import java.util.Vector;

public class Vet {
    private String name;

    Random rand = new Random();


    public Vet(String name) {
        this.name = Colors.COLORS[6] + name + Colors.RESET;

    }

    public String getName() {
        return name;
    }


    public void reviveAnimal(Animal animal) {
        int reviveTrigger = rand.nextInt(0, 100);

        if (reviveTrigger > 50) {
            healAnimal(animal);
        } else {
            System.out.println(name + " has failed to revive " + animal.getName());
        }
    }

    public void healAnimal(Animal animal) {
        int procentheal = rand.nextInt(30, 100);
        int anmimal1procent = animal.getMaxHealth() / 100;
        int heal = anmimal1procent * procentheal;
        System.out.println(animal.getName() + " (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")");
        animal.setCurrentHealth(animal.getCurrentHealth() + heal);
        if (animal.getCurrentHealth() > animal.getMaxHealth()) {
            animal.setCurrentHealth(animal.getMaxHealth());
            System.out.println(animal.getName() + " gets healed complete (" + procentheal + "%)" + " from " + name + " / " + animal.getName() + " has now --> (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")");
        } else {
            System.out.println(animal.getName() + " gets healed for: " + heal + "HP(" + procentheal + "%)" + " from " + name + " / " + animal.getName() + " has now --> (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")");
        }
        //

//        System.out.println(animal.getName() + " (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")" + " gets healed complete from " + name);
//        animal.setCurrentHealth(animal.getMaxHealth());
//        System.out.println(animal.getName() + " (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")");
    }

    public void dailyRoutine(Zoo zoo) {
        Animal animal = zoo.findOverallLowestAnimal();
        if (animal != null) {
//            if (animal.getCurrentHealth() == 0 || animal.getCurrentHealth() < 0){
//                reviveAnimal(animal);
//            } else {
            healAnimal(animal);
        } else {
            System.out.println(name + " tells you: \"All Animals are in good condition, no heals needed\"");
        }
    }


}
