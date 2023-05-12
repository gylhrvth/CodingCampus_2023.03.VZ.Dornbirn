package mert.week10.restaurant;

import java.util.Vector;

public class Kellner {
    private String name;
    Vector<Raum> raumList;

    public Kellner(String name){
        this.name = name;
        this.raumList = new Vector<>();
    }
    public void addRaum(Raum raum){
        raumList.add(raum);
    }
    public void printRestaurant(){
        for (Raum raum : raumList) {
            System.out.println("In " + raum.getName()+ " arbeitet: " + name);
        }
    }
}
