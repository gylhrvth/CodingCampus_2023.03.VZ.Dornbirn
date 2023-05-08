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
//        for (Enclosure enc : enclosureList) {
//            if (!enc.isCleaned()){
//                System.out.println(this.getName() + " is currently cleaning " + enc.getEnclosureName());
//                for (Animal animal : enc.getAnimalList()){
//                    animal.feeding();
//                    animal.setHungry(true);
//                }
//                enc.setProcess(true);
//                System.out.println(this.getName() + " is done cleaning " + enc.getEnclosureName() + "\n");
//            }
//        }

        Random rand = new Random();
        int index = rand.nextInt(enclosureList.size());
        Enclosure enclosure = enclosureList.get(index);
        if (!enclosure.isCleaned()) {
            System.out.println(Colors.COLORS[4] + name + Colors.RESET + " is currently working on " + Colors.COLORS[2] + enclosure.getEnclosureName() + Colors.RESET);
            for (Animal animal : enclosure.getAnimalList()) {
                animal.feeding();
                animal.setHungry(true);
            }
            enclosure.setProcess(false);
        }
        List<Animal> animalGetEnclosureList = enclosure.getAnimalList();
        if (!animalGetEnclosureList.isEmpty()) {
            int animalIndex = rand.nextInt(animalGetEnclosureList.size());
            Animal animals = animalGetEnclosureList.get(animalIndex);
            System.out.println("\n" + Colors.COLORS[4] + name + Colors.RESET + " is currently watching " + Colors.COLORS[3] + animals.getName() + Colors.RESET);

            if (animals.getName().equals(favouriteAnimal)) {
                System.out.println("\n" + Colors.COLORS[4] + name + Colors.RESET + " is currently admiring " + Colors.COLORS[3] + animals.getName() + Colors.RESET);
            }
        }
        System.out.println("Zookeeper " + Colors.COLORS[4] + name + Colors.RESET + " has finished cleaning " + Colors.COLORS[2] + enclosure.getEnclosureName() + Colors.RESET + " right now\n");
    }
}
