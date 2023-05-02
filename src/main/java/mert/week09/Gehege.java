package mert.week09;


import java.util.Vector;

public class Gehege {
    private String name;
    Vector<Tier> tierList;


    public Gehege(String name) {
        this.name = name;
        this.tierList = new Vector<>();

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
}

