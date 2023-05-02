package mariechristine.week8.zoo;

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

    public String getZooName() {
        return zooName;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }


    public void addEnclosure(Gehege gehege) {
        if (!enclosureList.contains(gehege)) {
            enclosureList.add(gehege);
        }
    }

    public void removeEnclosure(Gehege gehege) {
        enclosureList.remove(gehege);
    }

    public void addZookeeper(Zookeeper zookeeper) {
        if (!zookeeperList.contains(zookeeper)) {
            zookeeperList.add(zookeeper);
        }
    }

    public void printStructure(){
        System.out.println("├── Zoo: " + zooName + ", gegründet " + yearEstablished);
        if (!enclosureList.isEmpty()){
            System.out.println("   no enclosure");
        } else {
            for (Gehege gehege: enclosureList) {
                gehege.printStructure();

            }
        }
    }

    @Override
    public String toString() {
        return zooName + ", gegründet " + yearEstablished;
    }
}
