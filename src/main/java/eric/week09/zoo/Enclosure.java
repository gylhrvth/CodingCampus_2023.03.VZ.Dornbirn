package eric.week09.zoo;

import hassan.week09.Zoo.Tier;
import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enclosure {
    private String enclosureName;
    private List<Animal> animalList;
    private List<Zookeeper> keeperList;

    public Enclosure(String name) {
        this.enclosureName = name;
        this.animalList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
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

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Zookeeper> getKeeperList() {
        return keeperList;
    }

    public void printEnclosure() {
        System.out.println("│  ├──" + Colors.COLORS[2] + " Enclosure: " + getEnclosureName() + Colors.RESET);
        for (Zookeeper zookeeper : keeperList) {
            zookeeper.printZookeeper();
        }
        if (!animalList.isEmpty()) {
            for (Animal animal : animalList) {
                animal.printAnimals();
            }
        } else {
            System.out.println("│  │  ├── " + Colors.COLORS[3] + "(this enclosure is currently empty)" + Colors.RESET);

        }
    }

    public void simulationEnclosure() {
        while (true) {
            System.out.println("Zookeeper " + getKeeperList() + " has finished cleaning " + enclosureName + " right now");
            return;
        }
    }

    public void calcDailyNeed(HashMap<Food, Integer> dailyNeed) {
        for (Animal a : animalList) {
            a.calcDailyCost(dailyNeed);
        }
    }
}
