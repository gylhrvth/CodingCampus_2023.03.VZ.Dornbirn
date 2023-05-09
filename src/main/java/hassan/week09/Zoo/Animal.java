package hassan.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Animal {
    private String name;
    private hassan.week09.Zoo.Food food;
    private int dailyNeed;
    private List<ZooKeeper> keeper;
    private boolean isHungry;
    private int gesundheit;
    private int maxGesundheit;
    private int biss;
    private boolean isDead = false;

    public Animal(String name, hassan.week09.Zoo.Food food, int dailyNeed, int maxGesundheit, int biss) {
        this.biss = biss;
        this.maxGesundheit = maxGesundheit;
        this.name = name;
        this.dailyNeed = dailyNeed;
        this.food = food;
        this.isHungry = true;
        this.gesundheit = maxGesundheit;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public int getMaxGesundheit() {
        return maxGesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead() {
        isDead = true;
        gesundheit = 0;
        System.out.println(name + " ist Gestroben");
    }

    public int getBiss() {
        return biss;
    }

    public void attack(Animal other) {
        if (this.isDead() || other.isDead()) {
            return;
        }

        Random random = new Random();
        if (random.nextDouble() < 0.4 && this != other) {
            int schaden = biss;
            other.setGesundheit(other.getGesundheit() - schaden);
            if (other.getGesundheit() <= 0) {
                other.setDead();
                System.out.println(this.getName() + " hat " + other.getName() + " besiegt!");
            } else {
                System.out.println(Colors.COLORS[1] + this.getName() + Colors.RESET + " beißt " + Colors.COLORS[2] + other.getName() + Colors.RESET + " für " + schaden + " Schaden. " + Colors.COLORS[2] +other.getName() + Colors.RESET +" hat jetzt noch " + Colors.COLORS[1] + other.getGesundheit() + Colors.RESET + " Gesundheit.");
            }
        }
    }

    public List<ZooKeeper> getKeeper() {
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

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void feeding() {
        if (isHungry) {
            System.out.println(Colors.COLORS[6] + name + Colors.RESET + " is currently eating");
            isHungry = false;
        } else {
            System.out.println(Colors.COLORS[6] + name + Colors.RESET + " is currently not hungry");
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

