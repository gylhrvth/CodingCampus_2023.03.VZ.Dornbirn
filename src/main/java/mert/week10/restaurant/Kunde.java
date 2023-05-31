package mert.week10.restaurant;

import java.util.Random;

public class Kunde {
    Random rand = new Random();

    private int anzahlKunden;
    private String gruppe;

    public Kunde(String gruppe) {
        this.gruppe = gruppe;
        this.anzahlKunden = rand.nextInt(1, 12);
    }

    public void printRestaurant() {
        System.out.println("Gruppe: " + gruppe + "    anzahl an Kunden: " + anzahlKunden);

    }

    public int getAnzahlKunden() {
        return anzahlKunden;
    }

    public String getGruppe() {
        return gruppe;
    }

}
