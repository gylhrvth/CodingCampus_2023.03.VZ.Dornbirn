package mert.week09;

import java.util.Vector;

public class Pfleger {
    private String name;

    Vector<Gehege> gehegeList;

    public Pfleger(String name) {
        this.name = name;
        gehegeList = new Vector<>();
    }

    public void addBearbeiten(Simulation01 bearbeiten, Gehege gehege) {
        if (!gehegeList.contains(bearbeiten)){



        }
    }

    public void addGehegeList(Gehege gehege) {
        gehegeList.add(gehege);
    }

    public void printzoo() {
        System.out.println("├── " + "Pfleger: " + name);
        for (Gehege g : gehegeList) {
            g.printZoo();
        }

    }
}

