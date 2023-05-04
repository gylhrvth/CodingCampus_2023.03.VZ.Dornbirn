package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
    private String name;
    private List<Tier> tierList;
    private List<Pfleger> pflegerList;
    private boolean bearbeitet;

    public Gehege(String name) {
        this.name = name;
        this.tierList = new ArrayList<>();
        this.pflegerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTier(Tier tier) {
        tierList.add(tier);
    }

    public void removeTier(Tier tier) {
        tierList.remove(tier);
    }

    public List<Tier> getTiere() {
        return tierList;
    }

    public void addPflegerToGehege(Pfleger pfleger) {
        if (!pflegerList.contains(pfleger)) {
            pfleger.addGehege(this);
            pflegerList.add(pfleger);
        } else {
            System.out.println("Pfleger ist nicht im Zoo registriert und kann daher diesem Gehege nicht zugeordnet werden.");
        }
    }


    public void removePflegerFromGehege(Pfleger pfleger) {
        if (pflegerList.contains(pfleger)) {
            pfleger.removeGehege(this);
        } else {
            System.out.println("Der Pfleger ist nicht zuständig für dieses Gehege.");
        }
    }

    public void setBearbeitet(boolean bearbeitet) {
        this.bearbeitet = bearbeitet;
    }

    public List<Pfleger> getPflegerList() {
        return pflegerList;
    }

    public boolean isBearbeitet() {
        return this.bearbeitet;
    }

    public void simulate() {
        System.out.println();
        System.out.println("Ich bin Gehege " + name + " meine Pfleger sind:");
        for (Pfleger pfleger : pflegerList) {
            System.out.println("\t" + pfleger.getName());
        }
    }
 

    public void printStruktur() {
        System.out.println("│   ├── Gehege: " + name);
        if (pflegerList.isEmpty()) {
            System.out.println("│   │   ├── (kein Pfleger zuständig)");
        } else if (tierList.isEmpty()) {
            System.out.println("│   │   ├── (leer)");
        } else {
            for (Tier tier : tierList) {
                tier.printStruktur();
            }
        }
    }
}