package gyula.week09.zoo;

import java.util.HashMap;

public class Animal {
    private String name;
    private String genus;

    private Food food;
    private int dailyNeed;

    Animal(String name, String genus, Food food, int dailyNeed){
        this.name = name;
        this.genus = genus;
        this.food = food;
        this.dailyNeed = dailyNeed;
    }

    String getName() {
        return name;
    }

    void printStucture(){
        System.out.println("│   ├── " + name + "(" + genus + ")");
    }

    void calculateDailyNeed(HashMap<Food, Integer> dailyNeed){
        Integer oldNeed = 0;
        if (dailyNeed.containsKey(food)) {
            oldNeed = dailyNeed.get(food);
        }
        dailyNeed.put(food, oldNeed + this.dailyNeed);
    }

}
