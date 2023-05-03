package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Zoo {

    private String name;
    private int baujahr;

    Vector<Enclouser> enclouserList;
    Vector<Pfleger> pflegerList;



    public Zoo(String name, int baujahr) {
        this.name = name;
        this.baujahr = baujahr;
        this.enclouserList = new Vector<>();
        this.pflegerList = new Vector<>();

    }

    public void addEnclosure(Enclouser e) {
        if (!enclouserList.contains(e)) {
            enclouserList.add(e);
        }
    }

    public void addPfleger(Pfleger p) {
        if (!pflegerList.contains(p)) {
            pflegerList.add(p);
        }
    }


    public String getName() {
        return name;
    }

    public int getBaujahr() {
        return baujahr;
    }


    public void printStructure() {
        System.out.println("├──" + Colors.COLORS[6] + "Zoo: " + name + ", gegründet: " + baujahr + Colors.RESET);
        for (Enclouser enc : enclouserList) {
            enc.printStructure();
        }
        for (Pfleger pfleger : pflegerList) {
            pfleger.printPfleger();
        }
    }


    public void simulateDay(int day){
        System.out.println("Guten Morgen! Der Tag " + day + " beginnt...");

        for (Enclouser enc: enclouserList){
            enc.resetHasBeenCleaned();
        }

        for (Pfleger p: pflegerList) {
            p.simulateDay();
        }

        System.out.println("Ende des Tages " + day +"\n\n");
    }


    @Override
    public String toString() {
        return "Zoo: " + name;
    }
}
