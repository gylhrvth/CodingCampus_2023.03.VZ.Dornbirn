package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;

public class Zookeeper {
    private String name;
    private ArrayList<Enclosure> enclosureList;

    public Zookeeper(String name) {
        this.name = name;
        this.enclosureList = new ArrayList<>();
    }

    public Enclosure findOrCreateEnclosure(String enclosureName) {
        for (Enclosure enclosure : enclosureList) {
            if (enclosure.getEnclosureName().equals(enclosureName)){
                return enclosure;
            }
        }
        Enclosure newEnclosure = new Enclosure(enclosureName);
        enclosureList.add(newEnclosure);
        return newEnclosure;
    }


    public String getName() {
        return name;
    }

    public void printZookeeper() {
        System.out.println("│  │  ├── " + Colors.COLORS[4] + "Zookeeper: " + getName() + Colors.RESET);
    }
}
