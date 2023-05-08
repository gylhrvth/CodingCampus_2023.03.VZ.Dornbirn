package benjamin.week09.zooSimulation;

import java.util.Random;

public class Doctor {
    private static Random rand = new Random();
    private String name;
    public Doctor(String name) {
        this.name = name;
    }
    public void healAnimal(Animal animal) {
        System.out.println(name + " goes of to visit a weak animal.");
            if (animal != null) {
                animal.setCurrentHealth(animal.getHealth());
                animal.heal();
                System.out.println(" " + name + " heals " );
            } else {
                System.out.println(name + " found no animal to heal.");
            }
    }
    public void work(Zoo zoo){
        Animal animal = zoo.findOverall();
        System.out.println("Animal to heal " + animal.getName());
        if(animal != null){
            healAnimal(animal);
        }

    }
}


