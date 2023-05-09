package mert.week09;


import lukas.week03.day4.Colors;

import java.util.Random;
import java.util.Vector;

public class Tier {
    Random rand = new Random();
    private String name;
    private String gattung;
    boolean feed = false;
    boolean beobachten = false;
    private int maxGesundheit;
    private int bissKraft;
    private Vector<Tier> tierList;


    public Tier(String name, String gattung, int maxGesundheit, int bissKraft) {
        this.name = name;
        this.gattung = gattung;
        this.maxGesundheit = maxGesundheit;
        this.bissKraft = bissKraft;
    }

    public void angriff(Tier opfer) {
        int i = opfer.maxGesundheit - bissKraft;
        System.out.println(Colors.COLORS[1] + name + " greift  -> " + opfer.name + " an. Leben: " + i + Colors.RESET);


    }

    public int getMaxGesundheit() {
        return maxGesundheit;
    }

    public String getName() {
        return name;
    }

    public void beobachtenAnimal(Pfleger pfleger) {
        if (!beobachten) {
            System.out.println(pfleger.getName() + " beobachtet: " + name);

            beobachten = true;
        }
    }

    public void feedAnimal(Pfleger pfleger) {
        if (!feed) {
            System.out.println(pfleger.getName() + " füttert: " + name);

            feed = true;
        }
    }


    public boolean isBeobachten() {
        return beobachten;
    }


    public void resetBeobachten() {
        beobachten = false;
    }

    public boolean isFeed() {
        return feed;
    }

    public void setFeed(boolean feed) {
        this.feed = feed;
    }


    public void printzoo() {
        System.out.println("│       ├── " + name + ", " + gattung + ", Gesundheit: " + maxGesundheit);
    }


    public void resetFeed() {
        feed = false;
    }
}
