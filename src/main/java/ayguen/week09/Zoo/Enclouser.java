package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Enclouser {
    private String name;

    private Vector<Tier> tierList;
    Vector<Pfleger> pflegerList;

    private boolean hasBeenCleaned = false;


    public Enclouser(String name) {
        this.name = name;
        this.tierList = new Vector<>();
        this.pflegerList = new Vector<>();

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

    public Vector<Tier> getTierList() {
        return tierList;
    }

    public String getName() {
        return name;
    }

    public void setHasBeenCleaned(boolean hasBeenCleaned) {
        this.hasBeenCleaned = hasBeenCleaned;
    }

    public boolean isHasBeenCleaned() {
        return hasBeenCleaned;
    }

    public void resetHasBeenCleaned() {
        hasBeenCleaned = false;
    }

    @Override
    public String toString() {
        return name;
    }


    public void simulateDay(Pfleger aktiveMitarbeiter) {
        System.out.println(aktiveMitarbeiter.getName() + " reinigt " + name);
    }

    public void simulateAnimalAttacks() {
        for (Tier angreifer : tierList) {
            int bissWahrscheinlichkeit = Zoo.random.nextInt(100);
            if (bissWahrscheinlichkeit < 40) {
                Tier opfer = tierList.get(Zoo.random.nextInt(tierList.size()));
                if (angreifer.getGesundheit() > 0 && opfer.getGesundheit() > 0 && angreifer != opfer) {
                    angreifer.attack(opfer);
                }
            }
        }
    }

    public void removeDeadAnimals(){
        // Tote Tiere aus der Gehege entfernen...
        for (int iTier = 0; iTier < tierList.size(); iTier++) {
            Tier opfer = tierList.get(iTier);
            if (opfer.getGesundheit() <= 0){
                tierList.remove(iTier);
                --iTier;
                System.out.println(Colors.COLORS[6] + "Das gestorbene Tier " + opfer.getName() + " wurde aus der Gehege entfernt" + Colors.RESET);
            }
        }
    }

}


