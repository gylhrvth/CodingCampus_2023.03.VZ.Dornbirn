package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;
import lukas.week09.Animal;

import java.util.Random;
import java.util.Vector;

public class Zoo {
    static Random random = new Random();

    private String name;
    private int baujahr;

    Vector<Enclouser> enclouserList;
    Vector<Pfleger> pflegerList;
    Vector<Tier> tierList;


    public Zoo(String name, int baujahr) {
        this.name = name;
        this.baujahr = baujahr;
        this.enclouserList = new Vector<>();
        this.pflegerList = new Vector<>();
        this.tierList = new Vector<>();
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


    public void simulateDay(int day) {
        System.out.println("Der Tag " + day);

        for (Enclouser enc : enclouserList) {
            enc.resetHasBeenCleaned();
        }

        for (Pfleger p : pflegerList) {
            p.simulateDay();
        }

        // Attack Animals
        for (Enclouser enc : enclouserList) {
            enc.simulateAnimalAttacks();
            enc.removeDeadAnimals();
        }
        System.out.println("Ende der Tag " + day + "\n\n");



    }

    @Override
    public String toString() {
        return "Zoo: " + name;
    }

}