package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;
import java.util.List;

public class Animal {
    private String name;
    private Food food;
    private int dailyNeed;
    private List<Zookeeper> keeper;



    public Animal(String name, Food food, int dailyNeed) {
        this.name = name;
        this.dailyNeed = dailyNeed;
        this.food = food;
    }

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


    public void simulationAnimal(){
        boolean alreadyAte;
        System.out.println("This Animal " + name + " eats " + food);
        if (alreadyAte = false){
            System.out.println("Zookeeper " + getKeeper() + " is feeding " + name + " with " + food);
            alreadyAte = true;
        }
    }

    public void calcDailyCost(HashMap<Food, Integer> dailyCost) {
        Integer oldNeed = 0;
        if (dailyCost.containsKey(food)) {
            oldNeed = dailyCost.get(food);
        }
        dailyCost.put(food, oldNeed + this.dailyNeed);
    }
}
