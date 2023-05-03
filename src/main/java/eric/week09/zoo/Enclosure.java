package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;

public class Enclosure {
    private String enclosureName;
    private ArrayList<Animal> animalList;
    private ArrayList<Zookeeper> keeperList;

    public Enclosure(String name) {
        this.enclosureName = name;
        this.animalList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public Zookeeper findOrCreateZookeeper(String name) {
        for (Zookeeper keeper : keeperList) {
            if (keeper.getName().equals(name)) {
                return keeper;
            }
        }
        Zookeeper newZookeeper = new Zookeeper(name);
        keeperList.add(newZookeeper);
        return newZookeeper;
    }

    public Animal findOrCreateAnimal(String name, Food food, int dailyNeed) {
        for (Animal animal : animalList) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        Animal newAnimal = new Animal(name, food, dailyNeed);
        animalList.add(newAnimal);
        return newAnimal;
    }

    public void removeAnimals(Animal animal) {
        animalList.remove(animal);
    }

    public void removeKeeper(Zookeeper keeper) {
        this.keeperList.remove(keeper);
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public ArrayList<Zookeeper> getKeeperList() {
        return keeperList;
    }

    public void printEnclosure() {
        System.out.println("│  ├── " + Colors.COLORS[2] + "Enclosure: " + getEnclosureName() + Colors.RESET);
        for (Zookeeper keeper : getKeeperList()) {
            keeper.printZookeeper();
        }
        for (Animal animal : getAnimalList()) {
            animal.printAnimals();
        }
    }

    public void calcDailyNeed(HashMap<Food, Integer> dailyNeed) {
        for (Animal a : animalList) {
            a.calcDailyCost(dailyNeed);
        }
    }
}
