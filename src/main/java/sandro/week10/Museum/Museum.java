package sandro.week10.Museum;

import java.util.Vector;

public class Museum {
    private String name;
    private String offen;

    private Gang eingang;
    private Vector<Raum> raumliste;
    private Vector<Werter> werterliste;


    public Museum(String name, String offen, Gang eingang) {
        this.name = name;
        this.offen = offen;
        this.raumliste = new Vector<>();
        this.eingang = eingang;
    }

    public void addRaum(Raum raum) {
        if (!raumliste.contains(raum)) {
            raumliste.add(raum);
        }
    }

    public void addWerter(Werter werter) {
        if (!werterliste.contains(werter)) {
            werterliste.add(werter);
        }
    }

    public void printStruktur (){

    }


}
