package ayguen.week10.Restaurant;

import java.util.Random;

public class Gruppe {
    private int anzahlGuest;
    private String gruppe;
    Random rand = new Random();
    public Gruppe(String gruppe) {
        this.anzahlGuest = rand.nextInt(15) + 1;
        this.gruppe = gruppe;
    }

    public int getAnzahlGuest() {
        return anzahlGuest;
    }

    public String getGruppe() {
        return gruppe;
    }
}