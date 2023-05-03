package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;

public class Animal {
    private String name;
    private Food food;
    private int dailyNeed;

    public Animal(String name, Food food, int dailyNeed) {
        this.name = name;
        this.dailyNeed = dailyNeed;
        this.food = food;
    }

    public double getCost() {
        return dailyNeed;
    }

    public String getName() {
        return name;
    }

    public void printAnimals() {
        if (getName().isEmpty()) {
            System.out.println("│  │  │  ├── Enclosure ist Empty");
        } else {
            System.out.println("│  │  │  ├── " + Colors.COLORS[3] + "Animal: " + getName() + Colors.RESET);
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
