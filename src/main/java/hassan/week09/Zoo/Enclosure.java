package hassan.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enclosure {
    private String enclosureName;
    private List<Animal> animalList;
    private List<ZooKeeper> keeperList;

    private boolean hasToClean;

    public Enclosure(String name) {
        this.enclosureName = name;
        this.animalList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
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
    public List<Animal> getAnimalList() {
        return animalList;
    }
    public List<ZooKeeper> getKeeperList() {
        return keeperList;
    }

    public void printEnclosure() {
        System.out.println("│  ├──" + Colors.COLORS[5] + " Enclosure: " + getEnclosureName() + Colors.RESET);
        for (ZooKeeper zookeeper : keeperList) {
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
    public void removeDeadAnimals(){
        animalList.removeIf(animal -> animal.getGesundheit() <= 0);
    }

    public void dayAttack(){
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            for (int j = 0; j < animalList.size(); j++) {
                if (i != j){
                    Animal other = animalList.get(i);
                    animal.attack(other);
                }
            }
        }
        removeDeadAnimals();
    }
    public void calcDailyNeed(HashMap<Food, Integer> dailyNeed) {
        for (Animal a : animalList) {
            a.calcDailyCost(dailyNeed);
        }
    }

    public void initDay() {
        hasToClean = true;

        //Begegnung zwischen tiere
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal1 = animalList.get(i);
            for (int j = i + 1; j < animalList.size(); j++) {
                Animal animal2 = animalList.get(j);
                animal1.attack(animal2);
                animal2.attack(animal1);
            }
        }
    }


    public boolean dailyClean(ZooKeeper keeper){
        if (hasToClean){
            System.out.println(Colors.COLORS[2] + keeper.getName() + Colors.RESET + " is currently working on " + Colors.COLORS[2] + enclosureName + Colors.RESET);
            hasToClean = false;
            return true;
        }
        return false;
    }




}