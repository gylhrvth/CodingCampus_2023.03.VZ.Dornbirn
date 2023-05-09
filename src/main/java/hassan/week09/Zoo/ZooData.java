package hassan.week09.Zoo;

import eric.week09.zoo.Zookeeper;
import lukas.week03.day4.Colors;

import java.util.*;

public class ZooData {

    static Random random = new Random();
    private final String name;
    private final int foundingYear;
    private final List<Enclosure> enclosureList;
    private final List<ZooKeeper> keeperList;


    public ZooData(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new ArrayList<>();
        this.keeperList = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

    public void addZookeeper(ZooKeeper keeper) {
        keeperList.add(keeper);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public void removeKeeper(Zookeeper keeper) {
        this.keeperList.remove(keeper);
    }

    public void printZooStructure() {
        System.out.println("├── Zoo: " + name + ", founded in " + foundingYear);
        for (Enclosure enc : enclosureList) {
            enc.printEnclosure();
        }
    }

    public void printDailyFoodCost() {
        HashMap<hassan.week09.Zoo.Food, Integer> dailyNeed = new HashMap<>();
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
        for (Enclosure enclosure : enclosureList){
            enclosure.initDay();
            enclosure.dayAttack();
        }
        for (ZooKeeper keeper : keeperList) {
            keeper.initDay();
        }

        ArrayList<ZooKeeper> keeperOrder = new ArrayList<>();
        keeperOrder.addAll(keeperList);
        Collections.shuffle(keeperOrder);

        boolean hasSomethingDone = true;
        while (hasSomethingDone) {
            hasSomethingDone = false;
            for (ZooKeeper keeper : keeperOrder) {
                hasSomethingDone |= keeper.simulationKeeper();
            }
        }

    }

    public boolean beforeSimulation() {
        return false;
    }


}



