package sandro.week10.Museum;

import java.util.Vector;

public class Gang extends Raum {

    public Gang(String name) {
        super(name);

    }

    public void printStruktur() {

    }

    @Override
    public String toString() {
        return "Gang: " + getName();
    }
}
