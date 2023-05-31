package mert.week10.restaurant;

import java.util.Vector;

public class Tisch {
    private String name;
    private int sitzPlatz;
    Vector<Kunde> kundenlist;
    boolean besetzt;

    public Tisch(String name, int sitzPlatz) {
        this.name = name;
        this.sitzPlatz = sitzPlatz;
        this.kundenlist = new Vector<>();
        this.besetzt = false;
    }


    public void printRestaurant() {
        System.out.println("|      |--" + name + "    Sitzplätze: " + sitzPlatz);
        for (Kunde kunde : kundenlist) {
            kunde.printRestaurant();

        }
    }

    public boolean isBesetzt() {
        return besetzt;
    }

    public void setBesetzt(boolean besetzt) {
        this.besetzt = besetzt;
    }

    public String getName() {
        return name;
    }

    public int getSitzPlatz() {
        return sitzPlatz;
    }
}
