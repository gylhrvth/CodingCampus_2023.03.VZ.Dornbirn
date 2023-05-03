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

    //    public void addPfleger(Pfleger pfleger) {
//        if (!pflegerList.contains(pfleger)) {
//            pflegerList.add(pfleger);
//            pfleger.addGehege(this);
//        }
//    }
    public void addPflegerToGehege(Pfleger pfleger) {
        if (ZooData.getPflegerList().contains(pfleger)) {
            pfleger.addGehege(this);
            pflegerList.add(pfleger);
        } else {
            System.out.println("Pfleger ist nicht im Zoo registriert und kann daher diesem Gehege nicht zugeordnet werden.");
        }
    }


    public void removePflegerFromGehege(Pfleger pfleger) {
        pfleger.removeGehege(this);
        pflegerList.remove(pfleger);
    }


    public List<Pfleger> getPflegerList() {
        return pflegerList;
    }

    public boolean isBearbeitet() {
        return this.bearbeitet;
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