package hassan.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZooKeeper {
    private String name;
    private ArrayList<Enclosure> enclosureList;
    private ArrayList<Enclosure> enclosureToClean;
    private List<Animal> animal;
    private String favouriteAnimal;

    public ZooKeeper(String name) {
        this.name = name;
        this.enclosureList = new ArrayList<>();
        this.animal = new ArrayList<>();
    }

    public void addZookeeperToEnclosure(Enclosure enclosure) {
        enclosureList.add(enclosure);
        enclosure.getKeeperList().add(this);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
        enclosure.getKeeperList().remove(this);
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimal() {
        return animal;
    }


    public void printZookeeper() {
        System.out.println("│  │  ├── " + Colors.COLORS[1] + "ZOOKEEPER: " + name + Colors.RESET);
        if (name.isEmpty()) {
            System.out.println("│  │  ├── " + Colors.COLORS[4] + "(zookeeper has no name)" + Colors.RESET);
        }
    }

    public void initDay(){
        enclosureToClean = new ArrayList<>();
        enclosureToClean.addAll(enclosureList);
    }


    public boolean simulationKeeper() {
        boolean hasOneEnclosureBeenCleand = false;

        while (!hasOneEnclosureBeenCleand && !enclosureToClean.isEmpty()) {
            Enclosure enc = enclosureToClean.get(ZooData.random.nextInt(enclosureToClean.size()));
            enclosureToClean.remove(enc);
            hasOneEnclosureBeenCleand = enc.dailyClean(this);
        }
        return hasOneEnclosureBeenCleand;

    }


}
