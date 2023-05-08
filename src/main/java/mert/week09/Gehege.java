package mert.week09;


import java.util.Random;
import java.util.Vector;

public class Gehege {
    private static Random rand = new Random();
    private String name;
    Vector<Tier> tierList;
    private boolean sauber = false;
    private boolean angiff = false;


    public Gehege(String name) {
        this.name = name;
        this.tierList = new Vector<>();

    }

    public void angriff2() {
        for (Tier angreifer : tierList) {
            if (Math.random() < 0.4 && tierList.size() > 1) {
                Tier opfer = getZufalligesTier();

                if (opfer != angreifer) {
                    angreifer.angriff(opfer);

                }

            }

        }
    }

    public void entferneToteTiere() {
        for (int tier = 0; tier < tierList.size(); tier++) {
            Tier opfer = tierList.get(tier);
            if (opfer.getMaxGesundheit() <= 0) {
                tierList.remove(tier);
                tier--;
                System.out.println("Das gestorbene Tier " + opfer.getName() + "ist gestorben");
            }
        }
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

    public int getAnimalCount() {
        return tierList.size();
    }


    public Tier getZufalligesTier() {
        if (!tierList.isEmpty()) {
            return tierList.get(rand.nextInt(tierList.size()));
        } else {
            return null;
        }
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

