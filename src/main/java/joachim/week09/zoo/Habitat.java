package joachim.week09.zoo;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Habitat {
    private String name;
    private List<Animal> animalList;

    public Habitat(String name) {
        this.name = name;
        this.animalList = new Vector<>();


    }

    public void addAnimal(Animal a) {
        animalList.add(a);
    }

    public String getName() {
        return name;
    }


    public void printLayout() {
        System.out.println("│   ├── Habitat: " + name);
        if (animalList.isEmpty()) {
            System.out.println("│   │   ├── without any animal within");
        } else {
            for (Animal a : animalList) {
                System.out.println("│   │   ├── " + a);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public void collectFoodRequest(HashMap<Food, Integer> foodRequest){
        for (Animal a: animalList){
            a.collectFoodRequest(foodRequest);
        }
    }
}
