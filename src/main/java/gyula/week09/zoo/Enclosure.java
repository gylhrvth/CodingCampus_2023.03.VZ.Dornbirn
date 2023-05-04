package gyula.week09.zoo;

import java.util.HashMap;
import java.util.Vector;

public class Enclosure {
    private String description;

    private Vector<Animal> animalList;

    Enclosure(String description){
        this.description = description;
        this.animalList = new Vector<>();
    }

    public Animal findOrCreateAnimal(String name, String genus, Food food, int dailyNeed){
        for (Animal animal: animalList) {
            if (animal.getName().equals(name)){
                return animal;
            }
        }
        Animal newAnimal = new Animal(name, genus, food, dailyNeed);
        animalList.add(newAnimal);
        return newAnimal;
    }

    String getDescription() {
        return description;
    }

    void printStucture(){
        System.out.println("├── Enclosure: " + description);
        for (Animal a: animalList) {
            a.printStucture();
        }
    }

    void calculateDailyNeed(HashMap<Food, Integer> dailyNeed){
        for (Animal a: animalList) {
            a.calculateDailyNeed(dailyNeed);
        }
    }

}
