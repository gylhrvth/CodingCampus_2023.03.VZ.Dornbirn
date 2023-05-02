package sandro.week08.ZooTycoon;

import java.util.HashMap;
import java.util.Vector;

public class Enclosure {
    private String name;
    private String description;
    private String climate;
    private Vector<Animal> animalList;


    public Enclosure (String name, String description, String climate){
        this.name = name;
        this.description = description;
        this.climate = climate;
        this.animalList = new Vector<>();

    }

    public String getName() {
        return name;
    }

    public void addAnimal (Animal animal){
        animalList.add(animal);
    }
    public void removeAnimal (Animal animal){
        animalList.remove(animal);
    }


    public void collectFoodRequirement(HashMap<Food,Double> foodRequiert){
        for (Animal a: animalList) {
            a.collectFoodRequirement(foodRequiert);
        }
    }

    public void printZoo() {
        System.out.println("│   ├── " + "Enclosure: " + name +", "+ description +" ("+ climate+")");
        if (animalList.isEmpty()){
            System.out.println("│   │   ├── (is Empty)");
        } else {
            for (Animal ani : animalList) {
                ani.printZoo();
            }
        }

    }
}
