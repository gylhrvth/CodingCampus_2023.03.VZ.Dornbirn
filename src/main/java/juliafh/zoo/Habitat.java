package juliafh.zoo;

import java.util.ArrayList;

public class Habitat {

    String name;

    private ArrayList<Animal> animals;

    public Habitat(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }


    public void addAnimal(Animal newAnimal) {
        animals.add(newAnimal);
    }

    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }

    public int aliveAnimals(){
        int cnt = 0;
        for (var i = 0; i < animals.size(); i++) {
            if (animals.get(i).currentHealth > 0) {
                cnt++;
            }
        }
        return cnt;
    }

}
