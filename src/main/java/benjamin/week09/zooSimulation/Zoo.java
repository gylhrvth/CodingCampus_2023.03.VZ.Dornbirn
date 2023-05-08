package benjamin.week09.zooSimulation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class Zoo {
    private static Random rand = new Random();
    private String name;
    private int foundingYear;
    private Vector<Enclosure> enclosureList;
    private Vector<Keeper> keeperList;
    private Vector<Doctor> doctorList;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new Vector<>();
        this.keeperList = new Vector<>();
        this.doctorList = new Vector<>();
    }

    public void addDoctor(Doctor doctor){
        doctorList.add(doctor);
    }

    public void removeDoctor(Doctor doctor){
        doctorList.remove(doctor);
    }

    public String getName() {
        return name;
    }

    public void addEnclosure(Enclosure enclosure) {
        if (!enclosureList.contains(enclosure)) {
            enclosureList.add(enclosure);
        }
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public void addKeeper(Keeper keeper) {
        if (!keeperList.contains(keeper)) {
            keeperList.add(keeper);
        }
    }

    public void simulate() {
        /* Reset isProcessed Flag */
        for (Enclosure enc : enclosureList) {
            enc.removeIsProcessed();
        }
        Collections.shuffle(keeperList);
        for (Keeper keeper : keeperList) {
            keeper.simulate();
        }
        for (Enclosure enc : enclosureList) {
            enc.simulate();
        }
        for (Doctor doc: doctorList) {
                doc.work(this);
            }
    }

    public Animal findOverall() {
        Animal overallLowest = null;
        for (Enclosure enclosure : enclosureList) {
            overallLowest = enclosure.findLowestHealthAnimal(overallLowest);
        }
            /*
            Animal enclosureLowest = enclosure.findLowestHealthAnimal();
            if(enclosureLowest == null){
                continue;
            }
            if (enclosureLowest.getCurrentHealth() == enclosureLowest.getHealth()) {
                continue;
            }
            if (overallLowest == null){
                overallLowest = enclosureLowest;
            } else if (enclosureLowest.getHealthPercent() < overallLowest.getHealthPercent()) {
                overallLowest = enclosureLowest;
            }
        }
        */
        return overallLowest;
    }

    public void printZoo() {
        System.out.println("├── Zoo: " + name + ", founded " + foundingYear);
        for (Enclosure enclosure : enclosureList) {
            enclosure.printEnclosure();
        }
        System.out.println("│  ");
        System.out.println("│├── KeeperList: ");
        for (Keeper keeper : keeperList) {
            keeper.printKeeper();
        }
    }

    public void printFoodRequirement() {
        HashMap<Food, Double> foodRequirement = new HashMap<>();
        for (Enclosure enclosure : enclosureList) {
            enclosure.addFoodRequirement(foodRequirement);
        }
        System.out.println();
        System.out.println("Food Requirement:");
        double cost = 0;
        for (Food food : foodRequirement.keySet()) {
            double amount = foodRequirement.get(food);
            double price = food.getUnitPrice() * amount;
            cost += price;
            System.out.println("Food: " + food.getName() + ", Amount: " + amount + " " + food.getUnit() + ", Price: " + price + " €");
        }
        System.out.println("Total costs: " + cost + " €");
        System.out.println();
    }
}
