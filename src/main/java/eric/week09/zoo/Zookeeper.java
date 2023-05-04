package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper {
    private String name;
    private ArrayList<Enclosure> enclosureList;
    private List<Animal> animal;

    public Zookeeper(String name) {
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

    public ArrayList<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void printZookeeper() {
        System.out.println("│  │  ├── " + Colors.COLORS[4] + "ZOOKEEPER: " + name + Colors.RESET);
        if (name.isEmpty()){
            System.out.println("│  │  ├── " + Colors.COLORS[4] + "(zookeeper has no name)" + Colors.RESET);
        }
    }

    public void simulationKeeper(){
        System.out.println("Zookeeper " + name + " will now start their job");
        for (Enclosure enc : enclosureList) {
            enc.simulationEnclosure();
        }
        System.out.println("Zookeeper " + name + " is now admiring " + getAnimal());
    }
}
