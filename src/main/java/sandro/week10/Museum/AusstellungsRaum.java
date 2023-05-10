package sandro.week10.Museum;

import java.util.Vector;

public class AusstellungsRaum extends Raum {
    private Vector<Kunstwerk> kunstwerksliste;

    public AusstellungsRaum(String name) {
        super(name);
        this.kunstwerksliste = new Vector<>();
    }


    public void addKunstwerk(Kunstwerk kunstwerk) {
        if (!kunstwerksliste.contains(kunstwerk)) {
            kunstwerksliste.add(kunstwerk);
        }
    }

    public void printStruktur (){

    }

    @Override
    public String toString() {
        return "Ausstellungsraum: " + getName();
    }
}
