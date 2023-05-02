package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
    private String name;
    private List<Tier> tierList;
    private List<Pfleger> pflegerList;

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

    public void addPfleger(Pfleger pfleger) {
        if (!pflegerList.contains(pfleger)) {
            pflegerList.add(pfleger);
            pfleger.addGehege(this);
        }
    }

    public void removePfleger(Pfleger pfleger) {
        pflegerList.remove(pfleger);
        pfleger.removeGehege(this);
    }

    public List<Pfleger> getPflegerList() {
        return pflegerList;
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