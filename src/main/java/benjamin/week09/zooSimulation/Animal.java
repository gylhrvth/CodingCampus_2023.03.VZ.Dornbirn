package benjamin.week09.zooSimulation;

import lukas.week03.day4.Colors;

import java.util.HashMap;
import java.util.Random;

public class Animal {
    private static Random rand = new Random();
    private String name;
    private String species;
    private Food food;
    private double amount;
    private boolean isfeeded;
    private int health;

    private int currentHealth;
    private int bite;

    public Animal(String name, String species, int health, int currentHealth, int bite, Food food, double amount) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.amount = amount;
        this.isfeeded = false;
        this.health = health;
        this.currentHealth = currentHealth;
        this.bite = bite;
    }

    public void heal() {
        int healAmount = rand.nextInt(100) + 30;
        currentHealth = Math.min(currentHealth + healAmount,health);
        System.out.print(name + "'s life is healed to " + currentHealth + " with " + healAmount + " healing from");
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getHealth() {
        return health;
    }


    public boolean isDead() {
        return currentHealth <= 0;
    }


    public boolean isIsfeeded() {
        return isfeeded;
    }

    public void removeIsFeeded() {
        isfeeded = false;
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

    public void feed() {
        if (!isfeeded) {
            System.out.println(Colors.COLORS[2] + name + " (" + species + ") is fed" + Colors.RESET);
            isfeeded = true;
        } else {
            System.out.println(Colors.COLORS[1] + name + " (" + species + ") is already fed." + Colors.RESET);
        }
    }

    public void attack(Animal victom){
        victom.currentHealth -= bite;
        System.out.println(Colors.COLORS[5] + name + " bites " + victom.name + " (Life of " + victom.name + " " + victom.currentHealth + ")" + Colors.RESET);
        if (victom.isDead()) {
            System.out.println(Colors.COLORS[1] + victom.name + " is dead. " + Colors.RESET);
        }
    }

    public Animal findLowestHealthAnimal(Animal bestChoice){
        if (bestChoice == null){
            bestChoice = this;
        } else {
            if (currentHealth/(double)health < bestChoice.currentHealth/(double)bestChoice.health){
                System.out.printf("%s [%.2f %%] replaces as best choice %s [%.2f %%]\n",
                        name,
                        100*currentHealth/(double)health,
                        bestChoice.name,
                        100*bestChoice.currentHealth/(double)bestChoice.health);
                bestChoice = this;
            }
        }
        return bestChoice;
    }

}


