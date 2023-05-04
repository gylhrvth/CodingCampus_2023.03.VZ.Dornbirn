package mert.week09;


import java.util.Vector;

public class Gehege {
    private String name;
    Vector<Tier> tierList;
    private boolean sauber = false;


    public Gehege(String name) {
        this.name = name;
        this.tierList = new Vector<>();

    }



    public void reset() {
        sauber = false;
        for (Tier t : tierList) {
            t.resetFeed();
            t.resetBeobachten();
        }
    }

    public void cleanUp(Pfleger p) {
        System.out.println(p.getName() + " putzt die Gehege in: " + name);
        sauber = true;
    }

    public Vector<Tier> getTierList() {
        return tierList;
    }

    public void addTiere(Tier tier) {
        tierList.add(tier);
    }


    public boolean isSauber() {
        return sauber;
    }


    public void printZoo() {
        System.out.println("│   ├── Gehege: " + name);
        for (Tier t : tierList) {
            t.printzoo();

        }
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
}

