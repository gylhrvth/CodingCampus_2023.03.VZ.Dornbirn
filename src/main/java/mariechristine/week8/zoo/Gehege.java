package mariechristine.week8.zoo;

import java.util.Vector;

public class Gehege {
    private String enclosureName;
    private Vector<Animal> animalList;

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

    @Override
    public String toString() {
        return enclosureName + animalList;
    }
}