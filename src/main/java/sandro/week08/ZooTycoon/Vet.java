package sandro.week08.ZooTycoon;

import lukas.week03.day4.Colors;

import java.util.Random;
import java.util.Vector;

public class Vet {
    private String name;
    private Vector<Enclosure> vetTaskList;
    Random rand = new Random();


    public Vet(String name) {
        this.name = Colors.COLORS[6] + name + Colors.RESET;
        this.vetTaskList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Zoo zoo, Enclosure task) {
        zoo.addVet(this);
        vetTaskList.add(task);
    }

    public void reviveAnimal(Animal animal) {
        int reviveTrigger = rand.nextInt(0, 100);

        if (reviveTrigger > 50) {
            healAnimal(animal);
        } else {
            System.out.println(name + " has failed to revive " +animal.getName());
        }
    }

    public void healAnimal(Animal animal) {
        System.out.println(animal.getName() + " (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")" + " gets healed complete from " + name);
        animal.setCurrentHealth(animal.getMaxHealth());
        System.out.println(animal.getName() + " (Health: " + animal.getCurrentHealth() + "\\" + animal.getMaxHealth() + ")");
    }


}
