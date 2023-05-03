package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Enclouser {
    private String name;

    Vector<Tier> tierList;
    Vector<Pfleger> pflegerList;
    Vector<Pfleger> dailyJob;

    boolean hasBeenCleaned = false;


    public Enclouser(String name) {
        this.name = name;
        this.tierList = new Vector<>();
        this.pflegerList = new Vector<>();
        this.dailyJob = new Vector<>();


    }

    public void printStructure() {
        System.out.println("│   ├── " + Colors.COLORS[3] + "Gehege: " + name + Colors.RESET);
        if (tierList.isEmpty()) {
            System.out.println("│       ├── "+Colors.COLORS[2] + "(leer)" + Colors.RESET);
        } else {
            for (Tier tier : tierList) {
                tier.printTier();
            }

        }
    }




    public void addTier(Tier tier) {
        tierList.add(tier);
    }

    public void addPfleger(Zoo zoo, Pfleger pfleger) {

        zoo.addPfleger(pfleger);
        pflegerList.add(pfleger);
        pfleger.addTask(this);
    }


    public String getName() {
        return name;
    }


    public void resetHasBeenCleaned(){
        hasBeenCleaned = false;
    }

    public void simulateDay(Pfleger p){
        if (!hasBeenCleaned) {
            System.out.println(p.getName() + " füttert die Tiere in " + name);
            hasBeenCleaned = true;
        }
    }
}
