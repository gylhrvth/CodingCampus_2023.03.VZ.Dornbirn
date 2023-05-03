package gyula.week09.zoo;

import java.util.HashMap;
import java.util.Vector;

public class Zoo {
    private String name;
    private int established;

    private Vector<Enclosure> enclosureList;

    private Vector<Food> foodList;

    public Zoo(String name, int established) {
        this.name = name;
        this.established = established;
        enclosureList = new Vector<>();
        foodList = new Vector<>();
    }

    public Enclosure findOrCreateEnclosure(String description) {
        for (Enclosure enclosure : enclosureList) {
            if (enclosure.getDescription().equals(description)) {
                return enclosure;
            }
        }
        Enclosure newEnclosure = new Enclosure(description);
        enclosureList.add(newEnclosure);
        return newEnclosure;
    }

    public Animal findOrCreateAnimal(String name, String genus, String enclosureName, Food food, int dailyNeed) {
        Enclosure enclosure = findOrCreateEnclosure(enclosureName);
        return enclosure.findOrCreateAnimal(name, genus, food, dailyNeed);
    }

    public Food findOrCreateFood(String name, String unit, int pricePerUnit) {
        for (Food food : foodList) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        Food newFood = new Food(name, unit, pricePerUnit);
        foodList.add(newFood);
        return newFood;
    }

    public void printStucture(){
        System.out.println("Zoo: " + name + " (established at " + established + ")");
        for (Enclosure e: enclosureList) {
            e.printStucture();
        }
    }

    public void printDailyFoodNeed(){
        HashMap<Food, Integer> dailyNeed = new HashMap<>();
        for (Enclosure e: enclosureList) {
            e.calculateDailyNeed(dailyNeed);
        }

        int costTotal = 0;
        for (Food f: dailyNeed.keySet()) {
            costTotal += f.getPricePerUnitInCent() * dailyNeed.get(f);

            System.out.printf("%5d %-10s %-20s: %8.2f €\n",
                dailyNeed.get(f),
                f.getUnit(),
                f.getName(),
                (f.getPricePerUnitInCent() * dailyNeed.get(f))/100.0
            );
        }
        System.out.printf("Total Daily cost: %.2f €\n", costTotal/100.0);
    }
}