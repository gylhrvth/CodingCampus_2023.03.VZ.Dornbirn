package eric.week09.zoo;

import hassan.week09.Zoo.Tier;
import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Enclosure {
    private static Random rand = new Random();
    private String enclosureName;
    private List<Animal> animalList;

    private boolean hasToClean;


    public Enclosure(String name) {
        this.enclosureName = name;
        this.animalList = new ArrayList<>();

        hasToClean = true;
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public void addAnimalToEnclosure(Animal animal) {
        animalList.add(animal);
    }

    public void removeAnimals(Animal animal) {
        animalList.remove(animal);
    }


    public void printEnclosure() {
        System.out.println("│  ├──" + Colors.COLORS[2] + " Enclosure: " + getEnclosureName() + Colors.RESET);
        if (!animalList.isEmpty()) {
            for (Animal animal : animalList) {
                animal.printAnimals();
            }
        } else {
            System.out.println("│  │  ├── " + Colors.COLORS[3] + "(this enclosure is currently empty)" + Colors.RESET);

        }
    }

    public void calcDailyNeed(HashMap<Food, Integer> dailyNeed) {
        for (Animal a : animalList) {
            a.calcDailyCost(dailyNeed);
        }
    }


    public void initDay(){
        hasToClean = true;
    }

    public void enclosureSimulation(Zookeeper worker) {
        if (hasToClean) {
            hasToClean = false;
            System.out.println("\n" + Colors.COLORS[4] + worker.getName() + Colors.RESET + " is currently working on " + Colors.COLORS[2] + enclosureName + Colors.RESET);
            if (!animalList.isEmpty()) {
                for (Animal animal : animalList) {
                    animal.feeding();
                }
                Animal animals = animalList.get(rand.nextInt(animalList.size()));
                System.out.println(Colors.COLORS[4] + worker.getName() + Colors.RESET + " is done with his work in enclosure " + Colors.COLORS[2] + enclosureName + Colors.RESET + " and is currently watching " + animals.getName());
            }
            System.out.println(Colors.COLORS[4] + worker.getName() + Colors.RESET + " is done working on " + Colors.COLORS[2] + enclosureName + Colors.RESET + "\n");
        }
    }
}
