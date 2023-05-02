package sandro.week08.ZooTycoon;

import java.util.HashMap;

public class Animal {
    private String name;
    private String genus;

    private Food food;
    private double amount;


    public Animal(String name, String genus, Food food, double amount){
        this.name = name;
        this.genus = genus;
        this.food = food;
        this.amount = amount;
    }

    public void collectFoodRequirement(HashMap<Food,Double> foodRequiert){
        if (foodRequiert.containsKey(food)){
            foodRequiert.put(food, foodRequiert.get(food) + amount);
        } else {
            foodRequiert.put(food, amount);
        }
    }

    public void printZoo() {
        System.out.println("│   │   ├── Animal: " + name + ", " + genus);
    }
}
