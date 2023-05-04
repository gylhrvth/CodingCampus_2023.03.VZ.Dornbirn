package mert.week09;

import java.util.Random;
import java.util.Vector;

public class Pfleger {
    Random rand = new Random();
    private String name;

    Vector<Gehege> gehegeList;

    public Pfleger(String name) {
        this.name = name;
        gehegeList = new Vector<>();
    }


    public void simulateTage() {
        //Reinigen
        for (Gehege g : gehegeList) {
            if (!g.isSauber()) {
                g.cleanUp(this);
            }
        }
        //Füttern
        for (Gehege g : gehegeList) {
            for (Tier t : g.getTierList()) {
                if (!t.isFeed()) {
                    t.feedAnimal(this);
                }
            }
        }
        //Beobachten
        Gehege gehege = gehegeList.get(rand.nextInt(gehegeList.size()));
        Tier tier = gehege.getTierList().get(rand.nextInt(gehege.getTierList().size()));

        if (!tier.isBeobachten()) {
            tier.beobachtenAnimal(this);
        }


    }

    public Vector<Gehege> getGehegeList() {
        return gehegeList;
    }

    public String getName() {
        return name;
    }

    public void addGehegeList(Gehege gehege) {
        gehegeList.add(gehege);
    }

    public void printzoo() {
        System.out.print(name + " ist verantwortlich für ");
        for (Gehege g : gehegeList) {
            if (!g.equals(gehegeList.firstElement())) {
                if (!g.equals(gehegeList.lastElement())) {
                    System.out.print(", ");
                } else {
                    System.out.print(" und ");
                }
            }
            System.out.print(g.getName());
        }
        System.out.println();
    }

}


