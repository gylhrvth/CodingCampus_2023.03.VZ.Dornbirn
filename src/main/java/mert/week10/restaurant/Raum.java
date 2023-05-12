package mert.week10.restaurant;

import java.util.Vector;

public class Raum {
    private String name;
    Vector<Tisch> tischList;


    public Raum(String name) {
        this.name = name;
        this.tischList = new Vector<>();
    }
    public void addTisch(Tisch tisch){
        tischList.add(tisch);
    }

    public void printRestaurant() {
        System.out.println("|   |--" + name);
        for (Tisch tisch : tischList) {
            tisch.printRestaurant();
        }
    }

    public Vector<Tisch> getTischList() {
        return tischList;
    }

    public String getName() {
        return name;
    }
}
