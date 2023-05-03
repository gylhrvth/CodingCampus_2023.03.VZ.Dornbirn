package sandro.week08.ZooTycoon;

import java.util.HashMap;
import java.util.Vector;

public class Zoo {
    private String name;
    private int year;
    private Vector<Enclosure> enclosureList;
    private Vector<ZooKeeper> zooKeeperList;


    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
        this.enclosureList = new Vector<>();
        this.zooKeeperList = new Vector<>();
    }
    public void addZooKeeper (ZooKeeper zooKeeper){
        if (!zooKeeperList.contains(zooKeeper)) {
            zooKeeperList.add(zooKeeper);
        }
    }
    public void removeZooKeeper (ZooKeeper zooKeeper){
        zooKeeperList.add(zooKeeper);
    }

    public Vector<ZooKeeper> getZooKeeperList() {
        return zooKeeperList;
    }

    public void addenc(Enclosure enclosure) {
        if (!enclosureList.contains(enclosure)) {
            enclosureList.add(enclosure);
        }
    }

    public void removeenc(Enclosure enclosure) {
        enclosureList.remove((enclosure));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void printZoo() {
        System.out.println("├── " + "Zoo: " + name + " " + "Since: " + year);
        for (Enclosure enc : enclosureList) {
            enc.printZoo();
        }
        System.out.println("├──────────────────────────────────────────────────────────────────────");
        for (ZooKeeper keeper : zooKeeperList){
            keeper.printTask();
        }

    }

    public void printFoodCost() {
        HashMap<Food, Double> foodRequiert = new HashMap<>();

        for (Enclosure enclosure : enclosureList) {
            enclosure.collectFoodRequirement(foodRequiert);

        }
        System.out.println();
        System.out.println("Food requierment stats");
        double cost = 0;
        for (Food food : foodRequiert.keySet()) {
            System.out.println(food.getName() + " ==> " + foodRequiert.get(food) + " " + food.getUnit()+ " / $ per Unit: " +food.getUnitprice()) ;
            double amount = foodRequiert.get(food);
            double price = food.getUnitprice() * amount;

            cost += price;
        }
        System.out.println("Total costs for all Food requiered: " + cost +" $");
    }
}
