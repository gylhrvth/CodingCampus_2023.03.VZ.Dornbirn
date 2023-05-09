package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Animal {
    private String name;
    private Food food;
    private int dailyNeed;
    private List<Zookeeper> keeper;
    private List<Enclosure> enclosureList;


    public Animal(String name, Food food, int dailyNeed) {
        this.name = name;
        this.dailyNeed = dailyNeed;
        this.food = food;
        this.keeper = new ArrayList<>();
        this.enclosureList = new ArrayList<>();
    }

//    public void setHungry(boolean hungry) {
//        isHungry = hungry;
//    }

    public List<Zookeeper> getKeeper() {
        return keeper;
    }

    public double getCost() {
        return dailyNeed;
    }

    public String getName() {
        return name;
    }

    public void printAnimals() {
        System.out.println("│  │  │  ├── " + Colors.COLORS[3] + "Animal: " + name + Colors.RESET);
    }

    public void feeding() {
        System.out.println(Colors.COLORS[3] + name + Colors.RESET + " is currently eating " + Colors.COLORS[5] + food + Colors.RESET);
    }

    public void calcDailyCost(HashMap<Food, Integer> dailyCost) {
        Integer oldNeed = 0;
        if (dailyCost.containsKey(food)) {
            oldNeed = dailyCost.get(food);
        }
        dailyCost.put(food, oldNeed + this.dailyNeed);
    }
}
