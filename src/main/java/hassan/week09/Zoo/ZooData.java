package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZooData {
    private String name;
    private int bauJahr;
    private List<Gehege> gehegeList;
    private HashMap<String, Futter> futter;
    private List<Pfleger> pflegerList;


    public ZooData(String name, int bauJahr) {
        this.name = name;
        this.bauJahr = bauJahr;
        this.gehegeList = new ArrayList<>();
        this.futter = new HashMap<>();
        this.pflegerList = new ArrayList<>();
    }

    public void addGehege(Gehege gehege) {
        if (gehegeList.contains(gehege)) {
            return;
        }
        gehegeList.add(gehege);
    }

    public  List<Pfleger> getPflegerList() {
        return this.pflegerList;
    }


    public void removeGehege(Gehege gehege) {
        gehegeList.remove(gehege);
    }

    public void addFutter(Futter futter) {
        if (!this.futter.containsKey(futter.getName())) {
            this.futter.put(futter.getName(), futter);
        }
    }

    public void removeFutter(Futter futter) {
        this.futter.remove(futter.getName());
    }


    public void addTierToGehege(Tier tier, Gehege gehege) {
        gehege.addTier(tier);
        for (Futter futter : tier.getFutterbedarf().keySet()) {
            addFutter(futter);
        }
    }

    public void removeTierFromGehege(Tier tier, Gehege gehege) {
        gehege.removeTier(tier);
    }

    public void addPfleger(Pfleger pfleger) {
        pflegerList.add(pfleger);
    }

    public void removePfleger(Pfleger pfleger) {
        pflegerList.remove(pfleger);
        for (Gehege gehege : gehegeList) {
            if (gehege.getPflegerList().contains(pfleger)) {
                gehege.removePflegerFromGehege(pfleger);
            }
        }
    }
    public void printPflegerListe() {
        System.out.println("Liste der Pfleger:");
        for (Pfleger pfleger : pflegerList) {
            System.out.println(pfleger.getName());
        }
    }
    public void resetBearbeitet() {
        for (Gehege gehege : this.gehegeList) {
            gehege.setBearbeitet(false);
        }
    }

    public void simulate() {
        for (Pfleger pfleger : pflegerList) {
            pfleger.doesWork();

        }

        for (Gehege gehege : gehegeList) {
            gehege.simulate();
        }

        resetBearbeitet();
    }

    public List<Gehege> getGehegeList() {
        return this.gehegeList;
    }

    public void printStruktur() {
        System.out.println("├── Zoo: " + name + ", gegründet " + bauJahr);
        for (Gehege gehege : gehegeList) {
            gehege.printStruktur();
            if (!gehege.getPflegerList().isEmpty()) {
                System.out.print("│   │   ├── PFLEGER: ");
                for (Pfleger pfleger : gehege.getPflegerList()) {
                    System.out.print(" " + pfleger.getName());
                }
                System.out.println();
            }
        }
        if (!pflegerList.isEmpty()) {
            System.out.print("│   ├── Pfleger:");
            for (Pfleger pfleger : pflegerList) {
                System.out.print("--" + pfleger.getName());
            }
            System.out.println();
        }
    }

}



