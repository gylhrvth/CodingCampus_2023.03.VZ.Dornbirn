package ayguen.week10.Restaurant;

import java.util.Vector;

public class Tisch {

    private String name;
    private int sitzPlatz;
    boolean besetzt;
    Vector<Raum> raumList;

    public Tisch(String name, int sitzPlatz) {

        this.name = name;
        this.sitzPlatz = sitzPlatz;
        this.raumList = new Vector<>();
        this.besetzt = false;
    }

    public int getSitzPlatz() {
        return sitzPlatz;
    }
    public boolean isBesetzt(){
        return besetzt;
    }

    public void setBesetzt(boolean besetzt) {
        this.besetzt = besetzt;
    }

    public String getName() {
        return name;
    }
}


