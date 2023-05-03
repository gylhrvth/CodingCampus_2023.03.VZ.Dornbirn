package mariechristine.week8.zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Vector<Gehege> enclosureList;

    public Zookeeper(String name) {
        this.name = name;
        this.enclosureList = new Vector<>();
    }


    public void addTask(Gehege gehege) {
        if (!enclosureList.contains(gehege)) {
            enclosureList.add(gehege);
        }

    }

    public String getName() {
        return name;
    }

    public Vector<Gehege> getEnclosureList() {
        return enclosureList;
    }

    public void printStructure() {
        System.out.print("⇒ Zookeeper: " + Colors.COLORS[2] + name + Colors.RESET);
        if (enclosureList.isEmpty()) {
            System.out.print(" has no assigned task.");
        } else {
            System.out.print(", responsible enclosure: ");
            for (Gehege g : enclosureList) {
                if (!g.equals(enclosureList.firstElement())) {
                    if (!g.equals(enclosureList.lastElement())) {
                        System.out.print(", ");
                    } else {
                        System.out.print(" and ");
                    }
                }
                System.out.print(Colors.COLORS[4] + g.getEnclosureName() + Colors.RESET);
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return name;
    }
}
