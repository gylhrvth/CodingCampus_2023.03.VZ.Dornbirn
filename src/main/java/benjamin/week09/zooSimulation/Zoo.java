package benjamin.week09.zooSimulation;

import java.util.HashMap;
import java.util.Vector;

public class Zoo {
    private String name;
    private String foundingYear;
    private Vector<Enclosure> enclosureList;


    public Zoo(String name, String foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public Vector<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public void printZoo() {
        System.out.println("├── Zoo: " + name + ", founded " + foundingYear);
        for (Enclosure enclosure : enclosureList) {
            enclosure.printEnclosure();
        }
    }

    public void printFoodRequirement(){
        HashMap<Food, Double> foodRequirement = new HashMap<>();
        for (Enclosure enclosure: enclosureList) {
            enclosure.addFoodRequirement(foodRequirement);
        }
        System.out.println();
        System.out.println("Food Requirement:");
        double cost = 0;
        for (Food food : foodRequirement.keySet()) {
            double amount = foodRequirement.get(food);
            double price = food.getUnitPrice() * amount;
            cost += price;
            System.out.println("Food: " + food.getName() + " Amount: " + amount + " Price: " + price + " €");
        }
        System.out.println("Total costs: " + cost + " €");
    }
}
