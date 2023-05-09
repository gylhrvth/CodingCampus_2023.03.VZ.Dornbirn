package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Random;
import java.util.Vector;

public class Pfleger {
    private String name;
    Vector<Enclouser> enclouserList;
    Vector<Tier> animalList;


    public Pfleger(String name) {

        this.name = name;
        this.enclouserList = new Vector<>();
        this.animalList = new Vector<>();
    }

    public void addTask(Enclouser e) {
        enclouserList.add(e);
    }

    public String getName() {
        return name;
    }

    public void printPfleger() {
        System.out.print("│   > Pfleger " + Colors.COLORS[5] + name + Colors.RESET);
        if (enclouserList.isEmpty()) {
            System.out.print(" hat noch keine Aufgabe zugewiesen bekommen.");
        } else {
            System.out.print(" ist zuständig für ");
            for (Enclouser task : enclouserList) {
                if (!task.equals(enclouserList.firstElement())) {
                    if (!task.equals(enclouserList.lastElement())) {
                        System.out.print(", ");
                    } else {
                        System.out.print(" und ");
                    }
                }
                System.out.print(task.getName());
            }
        }
        System.out.println();
    }


    public void simulateDay() {
        //Reinigen
        for (Enclouser enc : enclouserList) {
            if (!enc.isHasBeenCleaned()) {
                enc.setHasBeenCleaned(true);
                System.out.println("Das Gehege " + enc.getName() + " wurde von " + name + " gereinigt!");
                System.out.println("______________________________");
            }
        }
        //Füttern
        for (Enclouser enc : enclouserList) {
            for (Tier tier : enc.getTierList()) {
                tier.feed(this);
            }
        }
        //Pfleger beobachtet ein Tier
        Random rand = new Random();

        Enclouser enc = enclouserList.get(rand.nextInt(enclouserList.size()));
        Tier tier = enc.getTierList().get(rand.nextInt(enc.getTierList().size()));
        System.out.println(Colors.COLORS[2] + "Das Tier " + tier + " wurde von " + name + " beobachtet!" + Colors.RESET);

        // Pfleger bewundert ein Tier
        Random random = new Random();
        Enclouser e = enclouserList.get(rand.nextInt(enclouserList.size()));
        Tier t = e.getTierList().get(random.nextInt(e.getTierList().size()));
        System.out.println(Colors.COLORS[1] + "Das Tier " + t + " wurde von " + name + " bewundert!" + Colors.RESET);
        //ATTACK
    }
    @Override
    public String toString() {
        return name;
    }

}

