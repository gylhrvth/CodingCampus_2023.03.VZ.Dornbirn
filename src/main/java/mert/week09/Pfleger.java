package mert.week09;

import java.util.Random;
import java.util.Vector;

public class Pfleger {
    private static Random rand = new Random();

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
        Tier tier = gehege.getZufalligesTier();
        if (tier != null) {
            if (!tier.isBeobachten()) {
                tier.beobachtenAnimal(this);
            }
        } else {
            System.out.println("Es ist traurig eine leere Gehege, wie " + gehege.getName() + " zu sehen.");
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


