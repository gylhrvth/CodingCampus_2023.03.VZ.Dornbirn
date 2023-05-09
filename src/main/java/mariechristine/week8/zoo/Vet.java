package mariechristine.week8.zoo;


import java.util.Vector;

public class Vet {
    public String name;
    public Vector<Animal> animalList;


    public Vet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void curedAnimal(Animal animalToCure) {
        animalToCure.heal(animalToCure.getMaxHealth());

    }
}


