package lukas.week09;

import java.util.List;

public class Prison {
    private List<Animal> animals;
    private boolean isDirty = false;

    public void beforeSimulate() {
        isDirty = true;
        for (Animal animal : animals) {
            //animal.setHungry()
        }
    }

    public void simulate() {
        if (Math.random() >= 0.6 && animals.size() > 1) {
            //Attack happens between two animals
            Animal attacker = getRandomAnimal();

            Animal victim = getRandomAnimal();
            while (victim == attacker) {
                victim = getRandomAnimal();
            }
            attacker.attacks(victim);
        }
    }

    private Animal getRandomAnimal() {
        throw new UnsupportedOperationException();
    }

    //Possible solution for a fight between two animals
    private void fight(Animal fighter1, Animal fighter2) {
        //Randomly one animal attacks the other until surrender
        fighter1.attacks(fighter2);
    }
}
