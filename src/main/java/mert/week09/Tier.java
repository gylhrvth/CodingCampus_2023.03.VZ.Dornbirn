package mert.week09;


import java.util.Random;

public class Tier {
    Random rand = new Random();
    private String name;
    private String gattung;
    boolean feed = false;
    boolean beobachten = false;

    public Tier(String name, String gattung){
        this.name = name;
        this.gattung = gattung;
    }


    public void beobachtenAnimal(Pfleger pfleger){
         if (!beobachten){
            System.out.println(pfleger.getName() + " beobachtet: "  +name);
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


    public void resetBeobachten(){
        beobachten = false;
    }

    public boolean isFeed() {
        return feed;
    }

    public void setFeed(boolean feed) {
        this.feed = feed;
    }


    public void printzoo(){
        System.out.println("│       ├── " + name + ", " + gattung);
    }


    public void resetFeed(){
        feed = false;
    }
}
