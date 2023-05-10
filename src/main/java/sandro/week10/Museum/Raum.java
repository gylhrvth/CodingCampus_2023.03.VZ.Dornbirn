package sandro.week10.Museum;

import sandro.week09.ZooTycoon.Vet;

import java.util.Vector;

public class Raum {
    private String name;

    private Vector<Mensch> menschenImRaumList;

    private Vector<Raum> nachbarRaeume;

    public Raum(String name) {
        this.name = name;
        this.nachbarRaeume = new Vector<>();
    }

    public void addTuerZuRaum(Raum r) {
        if (!nachbarRaeume.contains(r)){
            nachbarRaeume.add(r);
        }
        if (!r.nachbarRaeume.contains(this)){
            r.nachbarRaeume.add(this);
        }
    }

    public void eintreten(Mensch mensch) {
        if (!menschenImRaumList.contains(mensch)) {
            menschenImRaumList.add(mensch);
        }
    }

    public void ausgehen(Mensch mensch){
        if (menschenImRaumList.contains(mensch)) {
            menschenImRaumList.remove(mensch);
        }

    }

    public void printStruktur (){

    }

    public String getName() {
        return name;
    }
}
