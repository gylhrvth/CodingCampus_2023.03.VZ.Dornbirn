package mert.week09;

import java.util.Vector;

public class Zoo {
    private int baujahr;
    private String name;
    Vector<Gehege> gehegeList;
    Vector<Pfleger> pflegerList;

    Zoo(String name, int baujahr) {
        this.name = name;
        this.baujahr = baujahr;
        this.gehegeList = new Vector<>();
        this.pflegerList = new Vector<>();

    }
    public void addPfleger(Pfleger pfleger){
       pflegerList.add(pfleger);
    }

    public void addGehege(Gehege gehege) {
        if (!gehegeList.contains(gehege)) {
            gehegeList.add(gehege);
        }
    }


    public String getName() {
        return name;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void printZoo() {
        System.out.println("├── Zoo; " + name + ", gegründet: " + baujahr);
        for (Gehege g : gehegeList) {
            g.printZoo();
        }
        for (Pfleger p: pflegerList) {
            p.printzoo();
        }
    }
}

