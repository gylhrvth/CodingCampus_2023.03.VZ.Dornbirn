package benjamin.week09.zooSimulation;

import lukas.week03.day4.Colors;

import java.util.Random;
import java.util.Vector;

public class Keeper {

    private static Random rand = new Random();
    private String name;
    private Vector<Enclosure> jobList;

    private String favoriteAnimal;


    public Keeper(String name, String favoriteAnimal) {
        this.name = name;
        this.favoriteAnimal = favoriteAnimal;
        this.jobList = new Vector<>();
    }

    public String getName() {
        return name;
    }


    public void addEnclosure(Zoo zoo, Enclosure enclosure) {
        zoo.addKeeper(this);
        jobList.add(enclosure);
    }

    public void simulate() {
        work();
    }

    private void work() {
        System.out.println("Keeper " + name + " goes off to work at enclosures...");
        for (Enclosure enclosure : jobList) {
            if (!enclosure.isProcessed()) {
                System.out.println(Colors.COLORS[4] + name + " works on " + enclosure.getName() + Colors.RESET);
                for (Animal animal : enclosure.getAnimalList()) {
                    if (!animal.isIsfeeded()) {
                        animal.feed();
                    }
                }
                enclosure.observeAnimal(favoriteAnimal);
                enclosure.setProcessed(true);
            } else {
                System.out.println(Colors.COLORS[3] + enclosure.getName() + " is already processed." + Colors.RESET);
            }
        }
    }


    public void printKeeper() {
        System.out.print("│    ├──" + name + ": ");
        if (jobList.isEmpty()) {
            System.out.println("Has no task");
        } else {
            for (int i = 0; i < jobList.size(); i++) {
                if (i == (jobList.size() - 1)) {
                    System.out.println(jobList.get(i).getName());
                } else {
                    System.out.print(jobList.get(i).getName() + ", ");
                }
            }
        }
    }
}
