package joachim.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private int age;
    private Food food;
    private int amount;

    public Animal(String name, String species, int age, Food food ,int amount) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.food = food;
        this.amount=amount;
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }

    public int getAmount() {
        return amount;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return Colors.COLORS[3] +"Name: " + name + " ,Species: " + species + ",Age: " + age + " ,Food: " + food.getName() + " " + amount + food.getUnit() + Colors.COLORS[1] + "\n│   │   ├── " + Colors.COLORS[4] + food.getCost()*amount + " € per day" + Colors.RESET;
    }

    public void collectFoodRequest(HashMap<Food, Integer> foodRequest){
        if (foodRequest.containsKey(food)){
            foodRequest.put(food, foodRequest.get(food) + amount);
        } else {
            foodRequest.put(food, amount);
        }
    }
}
