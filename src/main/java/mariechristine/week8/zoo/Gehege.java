package mariechristine.week8.zoo;

import java.util.Random;
import java.util.Vector;

public class Gehege {
    private static Random random = new Random();
    private String enclosureName;
    private Vector<Animal> animalList;
    private boolean dirty = true;


    public Gehege(String enclosureName) {
        this.enclosureName = enclosureName;
        this.animalList = new Vector<>();
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public void addAnimal(Animal animal) {
        if (!animalList.contains(animal)) {
            animalList.add(animal);
        }
    }

    public Vector<Animal> getAnimalList() {
        return animalList;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void removeAnimal(Animal animal) {
        animalList.remove(animal);
    }


    public void printStructure() {
        System.out.println("│   ├── Gehege: " + enclosureName);
        if (animalList.isEmpty()) {
            System.out.println("│        ├── (leer)");
        } else {
            for (Animal animal : animalList) {
                animal.printStructure();
            }
        }
    }

    public void simulate() {
        for (Animal animal : animalList) {
            if (Math.random() < 0.4) {
                //System.out.println(animal.getAnimalName() + " sucht sich jemanden zum beißen!");
                int randomTierIndex = random.nextInt(animalList.size());
                Animal otherAnimal = animalList.get(randomTierIndex);
                if (animal.isAlive() && otherAnimal.isAlive()) {
                    if (animal != otherAnimal) {
                        animal.bitesAnimal(otherAnimal);
                        if (!animal.isAlive() || !otherAnimal.isAlive()) {
                            System.out.println(animal.getAnimalName() + " and " + otherAnimal.getAnimalName() + " are buried.");
                        }
                    } else {
                        System.out.println(animal.getAnimalName() + " won't bite itself.");
                    }
                }
            }
        }
    }


    public Animal getWeekestAnimal(Animal bestChoice){
        for (Animal animal: animalList) {
            bestChoice = animal.getWeekestAnimal(bestChoice);
        }
        return bestChoice;
    }

    @Override
    public String toString() {
        return enclosureName + animalList;
    }
}