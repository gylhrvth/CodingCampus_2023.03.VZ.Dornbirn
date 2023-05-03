package eric.week09.zoo;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private String name;
    private int foundingYear;
    private ArrayList<Enclosure> enclosureList;
    private ArrayList<Zookeeper> keeperList;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
    }

    public Enclosure findOrCreateEnclosure(String enclosureName) {
        Zookeeper zookeeper = findOrCreateZookeeper(enclosureName, " ");
        return  zookeeper.findOrCreateEnclosure(enclosureName);
    }

    public Zookeeper findOrCreateZookeeper(String name, String enclosureName) {
        Enclosure enclosure = findOrCreateEnclosure(enclosureName);
        return enclosure.findOrCreateZookeeper(name);
    }

    public Animal findOrCreateAnimal(String name, Food food, String enclosureName, int dailyNeed) {
        Enclosure enclosure = findOrCreateEnclosure(enclosureName);
        return enclosure.findOrCreateAnimal(name, food, dailyNeed);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public void removeKeeper(Zookeeper keeper) {
        this.keeperList.remove(keeper);
    }

    public void printZooStructure() {
        System.out.println("├── Zoo: " + name + ", founded in " + foundingYear);
        for (Enclosure enclosure : enclosureList) {
            enclosure.printEnclosure();
        }
    }

    public void printDailyFoodCost() {
        HashMap<Food, Integer> dailyNeed = new HashMap<>();
        for (Enclosure e : enclosureList) {
            e.calcDailyNeed(dailyNeed);
        }
        int costTotal = 0;
        for (Food f : dailyNeed.keySet()) {
            costTotal += f.getPrice() * dailyNeed.get(f);

            System.out.printf("│  ├── Daily Need: %5d %-10s %-20s: %8.2f €\n",
                    dailyNeed.get(f),
                    f.getUnit(),
                    f.getName(),
                    (f.getPrice() * dailyNeed.get(f) / 100.0));
        }
        System.out.printf("├── Total daily cost: %44.2f €\n", costTotal / 100.0);
    }
}
