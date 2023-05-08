package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Zoo {
    private final String name;
    private final int foundingYear;
    private final List<Enclosure> enclosureList;
    private final List<Zookeeper> keeperList;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

    public void addZookeeper(Zookeeper keeper) {
        keeperList.add(keeper);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public void removeKeeper(Zookeeper keeper) {
        this.keeperList.remove(keeper);
    }

    public List<Zookeeper> getKeeperList() {
        return keeperList;
    }


    public void printZooStructure() {
        System.out.println("├── Zoo: " + name + ", founded in " + foundingYear);
        for (Enclosure enc : enclosureList) {
            enc.printEnclosure();
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

            System.out.printf("│  ├── Daily Need: %6d %-11s %-21s: %9.2f €\n",
                    dailyNeed.get(f),
                    f.getUnit(),
                    f.getName(),
                    (f.getPrice() * dailyNeed.get(f) / 100.0));
        }
        System.out.printf("├── Total daily cost: %48.2f €\n", costTotal / 100.0);
    }

    public void simulation() {
        for (Enclosure enc: enclosureList) {
            enc.initDay();
        }

        for (Zookeeper keeper : keeperList) {
            keeper.simulationKeeper();
//            Random rand = new Random();
//            if (!enclosureList.isEmpty()) {
//
//                int index = rand.nextInt(enclosureList.size());
//                Enclosure enclosure = enclosureList.get(index);
//                List<Animal> animalGetEnclosureList = enclosure.getAnimalList();
//
//                int animalIndex = rand.nextInt(animalGetEnclosureList.size());
//                if (animalIndex <= animalGetEnclosureList.size()) {
//                    Animal animals = animalGetEnclosureList.get(animalIndex);
//                    System.out.println(Colors.COLORS[4] + keeper.getName() + Colors.RESET + " is done with his work for the day and is currently watching " + animals.getName());
//                }
//            }
        }
    }
}
