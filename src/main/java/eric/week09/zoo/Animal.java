package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;
import java.util.List;

public class Animal {
    private String name;
    private Food food;
    private int dailyNeed;
    private List<Zookeeper> keeper;
    private boolean isHungry;



    public Animal(String name, Food food, int dailyNeed) {
        this.name = name;
        this.dailyNeed = dailyNeed;
        this.food = food;
        this.isHungry = true;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
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

    public boolean feeding(){
        if (isHungry){
            System.out.println(Colors.COLORS[3] + name + Colors.RESET + " is currently eating");
            isHungry = false;
        } else {
            System.out.println(Colors.COLORS[3] + name + Colors.RESET + " is currently not hungry");
        }
        return true;
    }

    public void calcDailyCost(HashMap<Food, Integer> dailyCost) {
        Integer oldNeed = 0;
        if (dailyCost.containsKey(food)) {
            oldNeed = dailyCost.get(food);
        }
        dailyCost.put(food, oldNeed + this.dailyNeed);
    }
}
