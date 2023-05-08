package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zookeeper {
    private String name;
    private ArrayList<Enclosure> enclosureList;
    private List<Animal> animal;
    private String favouriteAnimal;

    public Zookeeper(String name) {
        this.name = name;
        this.enclosureList = new ArrayList<>();
        this.animal = new ArrayList<>();
    }

    public void addZookeeperToEnclosure(Enclosure enclosure) {
        if (!enclosureList.contains(enclosure)) {
            enclosureList.add(enclosure);
        }
        //enclosure.getKeeperList().add(this);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
        //enclosure.getKeeperList().remove(this);
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public String getFavouriteAnimal() {
        return favouriteAnimal;
    }

    public ArrayList<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void printZookeeper() {
        System.out.println("│  │  ├── " + Colors.COLORS[4] + "ZOOKEEPER: " + name + Colors.RESET);
        if (name.isEmpty()) {
            System.out.println("│  │  ├── " + Colors.COLORS[4] + "(zookeeper has no name)" + Colors.RESET);
        }
    }

    public void simulationKeeper() {
        if (enclosureList.isEmpty()) {
            System.out.println(Colors.COLORS[2] + name + Colors.RESET + " didn't get an enclosure to clean");
            return;
        }
        for (Enclosure enclosure : enclosureList) {
            enclosure.enclosureSimulation(this);
        }
    }
}
