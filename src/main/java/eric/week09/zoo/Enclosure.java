package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;

public class Enclosure {
    private String name;
    private ArrayList<Animals> animalList;

    public Enclosure (String name){
        this.name = name;
        this.animalList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addAnimal(Animals animals) {
        animalList.add(animals);
    }

    public void removeAnimals(Animals animals) {
        animalList.remove(animals);
    }
    public ArrayList<Animals> getAnimalList(){
        return animalList;
    }


    public void printEnclosure(){
        System.out.println("│  ├── " + Colors.COLORS[2] + "Enclosure: " + getName() + Colors.RESET);
        for (Animals animal : getAnimalList()) {
            animal.printAnimals();
        }
    }
}
