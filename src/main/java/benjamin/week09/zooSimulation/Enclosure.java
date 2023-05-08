package benjamin.week09.zooSimulation;

import lukas.week03.day4.Colors;


import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    private static Random rand = new Random();

    private String name;
    private Vector<Animal> animalList;

    private boolean isProcessed;

    public Enclosure(String name) {
        this.name = name;
        this.animalList = new Vector<>();
        this.isProcessed = false;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void removeIsProcessed() {
        isProcessed = false;
        for (Animal a : animalList) {
            a.removeIsFeeded();
        }
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public Vector<Animal> getAnimalList() {
        return animalList;
    }

    public void addFoodRequirement(HashMap<Food, Double> foodReq) {
        for (Animal animal : animalList) {
            animal.addFoodRequirement(foodReq);
        }
    }

    public void observeAnimal(String favoriteSpecies) {
        int index = rand.nextInt(animalList.size());
        Animal watchedAnimal = animalList.get(index);
        System.out.print(watchedAnimal.getName() + " (" + watchedAnimal.getSpecies() + ") is observed.");
        if (watchedAnimal.getSpecies().equals(favoriteSpecies)) {
            System.out.print("... and is admired for his beauty.");
        }
        System.out.println();
    }

    public void simulate() {
        simulateAttack();
    }

    private void simulateAttack() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = getAnimalList().get(i);
            if (!animal.isDead() && Math.random() < 0.4) {
                Animal neighbor = getRandomAnimal();
                if (!neighbor.isDead() && neighbor != animal) {
                    animal.attack(neighbor);
                    if (neighbor.isDead()){
                        animalList.remove(neighbor);
                        System.out.println(Colors.COLORS[1] + neighbor.getName() + " is cremated. " + Colors.RESET);
                    }
                }
            }
        }
    }
    public Animal findLowestHealthAnimal(Animal bestChoice) {
        for (Animal animal : animalList) {
            bestChoice = animal.findLowestHealthAnimal(bestChoice);
        }
        return bestChoice;

        /*
        if(animalList.isEmpty()){
            return null;
        }
       Animal lowestHealthPercent = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getHealthPercent() < lowestHealthPercent.getHealthPercent()) {
               lowestHealthPercent = animal;
            }
        }
        return lowestHealthPercent;
        */
    }

    private Animal getRandomAnimal() {
        int index = rand.nextInt(animalList.size());
        return animalList.get(index);
    }

    public void printEnclosure() {
        System.out.println("│   ├── Enclosure: " + getName());
        if (animalList.isEmpty()) {
            System.out.println("│       ├── (empty)");
        } else {
            for (Animal animal : animalList) {
                animal.printAnimal();
            }
        }
    }
}

