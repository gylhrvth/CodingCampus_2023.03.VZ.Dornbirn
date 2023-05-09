package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Tier {

    private String name;
    private String gattung;
    Vector<Enclouser> enclouserList;

    private int gesundheit;

    private int bissKraft;

    public Tier(String name, String gattung, int gesundheit, int bissKraft) {
        this.name = name;
        this.gattung = gattung;
        this.gesundheit = gesundheit;
        this.bissKraft = bissKraft;
        this.enclouserList = new Vector<>();
    }

    public void printTier() {
        System.out.println("│       ├── " + Colors.COLORS[2] + name + " (" + gattung + ")" + Colors.RESET);
    }

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public void feed(Pfleger pfleger) {
        System.out.println(Colors.COLORS[3] + "Das Tier " + name + " wurde von " + pfleger.getName() + " gefüttert!" + Colors.RESET);
    }

    public void attack(Tier opfer) {
        System.out.println(name + " hat " + opfer.name + " angegriffen. ");
        opfer.gesundheit = opfer.gesundheit - bissKraft;
        System.out.println(opfer.name + " gesundheit : " + opfer.gesundheit);

        if (opfer.gesundheit <= 0) {
            System.out.println(Colors.COLORS[6] + "Das Tier " + opfer.name + " ist leider gestorben" + Colors.RESET);

        } else {
            System.out.println("Das Tier " + opfer.name + " hatte eine Gesundheit von " + gesundheit + " und wurde von " + name + " gebissen. Und hat jetzt einen gesundheit von " + opfer.gesundheit);
        }

    }

    @Override
    public String toString() {
        return name;
    }

    public int getGesundheit() {
        return gesundheit;
    }

}
