package mariechristine.week8.zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Zoo {
    private String zooName;
    private int yearEstablished;
    private Vector<Gehege> enclosureList;
    private Vector<Zookeeper> zookeeperList;

    public Zoo(String zooName, int yearEstablished) {
        this.zooName = zooName;
        this.yearEstablished = yearEstablished;
        this.enclosureList = new Vector<>();
        this.zookeeperList = new Vector<>();
    }

    public void setNewDay() {
        for(Gehege gehege : enclosureList) {
            gehege.setDirty(true);
        }
    }

    public String getZooName() {
        return zooName;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }


    public void addZookeeper(Zookeeper keeper) {
        if (!zookeeperList.contains(keeper)) {
            zookeeperList.add(keeper);
        }
    }


    public void addEnclosure(Gehege gehege) {
        if (!enclosureList.contains(gehege)) {
            enclosureList.add(gehege);
        }
    }

    public void removeEnclosure(Gehege gehege) {
        enclosureList.remove(gehege);
    }

    public void printStructure() {
        System.out.println("├── Zoo: " + zooName + ", gegründet " + yearEstablished);
        if (enclosureList.isEmpty()) {
            System.out.println("   no enclosure");
        } else {
            for (Gehege gehege : enclosureList) {
                gehege.printStructure();
            }
        }
        System.out.println();
        if (zookeeperList.isEmpty()) {
            System.out.println("****ATTENTION: NO ZOOKEEPER AVAILABLE TODAY!****");
        } else {
            for (Zookeeper zookeeper : zookeeperList) {
                //System.out.println("\n⇒ Zookeeper: " + zookeeper + ", responsible enclosure: " + enclosureList.get(0));
                zookeeper.printStructure();
            }
        }

    }

    @Override
    public String toString() {
        return zooName + ", gegründet " + yearEstablished;
    }

    public void simulate() {
        System.out.println(Colors.COLORS[4] + "WELCOME TO A BEAUTIFUL NEW DAY IN '" + zooName + "'" + Colors.RESET);
        for (Zookeeper keeper : zookeeperList) {
            keeper.simulate();
        }
        for (Gehege gehege : enclosureList) {
            gehege.simulate();
        }
    }
}
