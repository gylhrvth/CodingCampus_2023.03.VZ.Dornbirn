package benjamin.week09.zooSimulation;

import java.util.HashMap;
import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animalList;

    public Enclosure (String name){
        this.name = name;
        this.animalList = new Vector<>();
    }
    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
    public void removeAnimal(Animal animal){
        animalList.remove(animal);
    }

    public Vector<Animal> getAnimalList() {
        return animalList;
    }

    public void addFoodRequirement(HashMap<Food, Double> foodReq){
        for (Animal animal: animalList) {
            animal.addFoodRequirement(foodReq);
        }
    }

    public void printEnclosure(){
        System.out.println("│   ├── Enclosure: " + getName());
        if (animalList.isEmpty()) {
            System.out.println("│       ├── (empty)");
            }else {
        for (Animal animals : animalList) {
            animals.printAnimal();

        }
    }

    }
}

