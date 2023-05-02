package benjamin.week09.zooSimulation;

import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private Food food;
    private double amount;


    public Animal(String name, String species, Food food, double amount) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.amount = amount;
    }

    public Food getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getAmount() {
        return amount;
    }

    public void addFoodRequirement(HashMap<Food, Double> foodReq) {
        if (!foodReq.containsKey(food)) {
            foodReq.put(food, amount);
        } else {
            foodReq.put(food, foodReq.get(food) + amount);
        }
    }

    public void printAnimal() {
        System.out.println("│       ├── Animal: " + name + ", " + species);
    }
}

