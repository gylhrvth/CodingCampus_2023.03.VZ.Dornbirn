package juliafh.zoo;

import sandro.week02.Array;

import java.util.ArrayList;


public class Zoo {
    private String name;
    private int foundation;

    private ArrayList<Habitat> habitats;
    private ArrayList<Keeper> keepers;

    public Zoo(String name, int foundation) {
        this.name = name;
        this.foundation = foundation; // TODO: Validation?
        habitats = new ArrayList<>();
        keepers = new ArrayList<>();
    }

    public ArrayList<Habitat> getHabitats() {return this.habitats;}
    public ArrayList<Keeper> getKeepers() {return this.keepers;}


    public void addAnimalType(Habitat newHabitat) {
        habitats.add(newHabitat);
    }
    public void addKeeper(Keeper newKeeper) { keepers.add(newKeeper); }

    public void printStatus() {
        System.out.println("|-- Zoo: " + name + ", gegrnüdet " + foundation);
        for (int i = 0; i < habitats.size(); i++) {
            Habitat t = habitats.get(i);
            System.out.println("|   |-- Gehege: " + t.name );
            for (int j = 0; j < t.getAnimals().size(); j++) {
                Animal a = t.getAnimals().get(j);
                System.out.println("|       |-- " + a.name + ", " + a.genus);
            }
            if (t.getAnimals().size() == 0) {
                System.out.println("|       |-- (leer)");
            }
        }
        for (int i = 0; i < keepers.size(); i++) {
            Keeper k = keepers.get(i);
            System.out.println("|   |-- Pfleger: " + k.name );
            for (int j = 0; j < k.habitats.size(); j++) {
                Habitat at = k.habitats.get(j);
                System.out.println("|       |-- " + at.name);
            }
        }
    }

    public void printFoodStats() {
        double dailyCost = 0.0;
        System.out.println("Futterbedarf von Zoo Report");
        for (int i = 0; i < habitats.size(); i++) {
            Habitat t = habitats.get(i);
            System.out.println("|   |-- Gehege: " + t.name);
            for (int j = 0; j < t.getAnimals().size(); j++) {
                Animal a = t.getAnimals().get(j);
                dailyCost += a.foodRequirement.unit*a.foodRequirement.price;
                System.out.println("|       |-- " + a.foodRequirement.name + ", " + a.foodRequirement.unit + " unit costing "+ a.foodRequirement.price + "EUR");
            }
        }

        System.out.printf("Daily cost of the zoo: %15.2fEUR%n", dailyCost);
    }
}
