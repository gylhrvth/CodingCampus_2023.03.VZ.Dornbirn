package mariechristine.week8.zoo;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Zookeeper {
    private String name;
    private Vector<Gehege> enclosureList;

    public Zookeeper(String name) {
        this.name = name;
        this.enclosureList = new Vector<>();
    }

    public void addEnclosureToKeeper(Gehege gehege) {
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

//    public void simulate() {
//        //Wurde gehege schon gereinigt? Wenn nein reinigen, ansonsten weiter zum nächsten
//        for (Gehege gehege : enclosureList) {
//            if (gehege.isDirty()) {
//                gehege.setDirty(false);
//                System.out.println(name + " cleaned up: " + gehege.getEnclosureName());
////                System.out.println(name + " hat " + gehege.getAnimalList() + " gefüttert.");
//                for (Animal animal: gehege.getAnimalList()) {
//                    if(!animal.isFed()) {
//
//                        System.out.println(animal.getAnimalName() + " ist hungrig.");
//                    }
//                }
//            } else {
//                System.out.println("Already cleaned.");
//            }
//        }
//
//        Random random = new Random();
//
//        Gehege gehege = enclosureList.get(random.nextInt(enclosureList.size()));
//        List<Animal> animalList = gehege.getAnimalList();
//        if (animalList.size() > 0) {
//            Animal tier = animalList.get(random.nextInt(animalList.size()));
//            System.out.println(name + " beobachtet " + tier.getAnimalName());
//        }
//    }

    public void simulate() {
        //Füttern
        for (Gehege gehege : enclosureList) {
            System.out.println(name + " arrived at " + gehege.getEnclosureName() + ".");
            if (!gehege.getAnimalList().isEmpty()) {
                for (Animal animal : gehege.getAnimalList()) {
                    if (!animal.wasFed()) {
                        System.out.println(name + " has fed " + animal.getAnimalName() + ".");
                        animal.setFed(true);
                    }
                }
            }
        }

        //Zufälliges Tier anschauen
        Random random = new Random();

        //Pfleger sucht sich ein zufälliges Gehege aus
        int randomEnclosureIndex = random.nextInt(enclosureList.size());
        Gehege gehege = enclosureList.get(randomEnclosureIndex);

        //Pfleger sucht sich ein zufälliges Tier aus und beobachtet es
        if (!gehege.getAnimalList().isEmpty()) {
            int randomTierIndex = random.nextInt(gehege.getAnimalList().size());

            Animal tier = gehege.getAnimalList().get(randomTierIndex);
            System.out.println(name + " arrived at " + gehege.getEnclosureName() + " and watches " + tier.getAnimalName());
        }
    }
}
