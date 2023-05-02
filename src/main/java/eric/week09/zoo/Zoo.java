package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private String name;
    private int foundingYear;
    private ArrayList<Enclosure> enclosureList;
    private ArrayList<Zookeeper> keeper;

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.enclosureList = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public void printZooStructure() {
        System.out.println("├── Zoo: " + name + ", founded in " + foundingYear);
        for (Enclosure enclosure : enclosureList) {
            enclosure.printEnclosure();
        }
    }
}
