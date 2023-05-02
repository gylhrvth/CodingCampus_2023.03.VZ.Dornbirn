package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;

public class Animals {
    private String name;
    private HashMap<Food, Integer> foodReq;
    private int amount;
    private int cost;

    public Animals(String name) {
        this.name = name;
        this.foodReq = new HashMap<>();
        this.amount = 0;
        this.cost = 0;
    }

    public int getAmount() {
        return amount;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
    public void printAnimals(){
        if (getName().isEmpty()){
            System.out.println("│  │  │  ├── Enclosure ist Empty");
        } else {
            System.out.println("│  │  │  ├── " + Colors.COLORS[3] + "Animal: " + getName() + Colors.RESET);
        }
    }
}
