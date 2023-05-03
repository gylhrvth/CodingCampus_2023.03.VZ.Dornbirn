package mert.week09;


import java.util.Vector;

public class Gehege {
    private String name;
    Vector<Tier> tierList;
    boolean sauber = false;


    public Gehege(String name) {
        this.name = name;
        this.tierList = new Vector<>();

    }

    public void resetSauber() {
        sauber = false;
    }

    public void simulateTage(Pfleger p) {
        if (!sauber) {
            System.out.println(p.getName() + " füttert die Tiere in " + name);
            sauber = true;
        }
    }


    public void addTiere(Tier tier) {
        tierList.add(tier);
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

