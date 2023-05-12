package juliafh.zoo;

import java.util.ArrayList;
import java.util.Random;

public class Keeper {
    String name;
    String favoriteAnimal;
    ArrayList<Habitat> habitats;

    public Keeper(String name, ArrayList<Habitat> keptAnimals) {
        this.name = name;
        this.habitats = keptAnimals;
    }

    public void setFavoriteAnimal(String name) {
        this.favoriteAnimal = name;
    }

    public void work() {
        for (var i = 0; i < habitats.size(); i++) {
            Habitat h = habitats.get(i);
            for (var j = 0; j < h.getAnimals().size(); j++) {
                if (!h.getAnimals().get(j).isFed()) {
                    feed(h.getAnimals().get(j));
                    return;
                }
            }
        }

        // Observe random animal
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_ati = rand.nextInt(habitats.size());
        Habitat r = habitats.get(rand_ati);
        int rand_a = rand.nextInt(r.getAnimals().size());
        Animal a = r.getAnimals().get(rand_a);
        if (a.name.equals(favoriteAnimal)) {
            admire(a);
        } else {
            observe(a);
        }
    }

    public void feed(Animal a){
        System.out.println("Keeper " + this.name + " feeds " + a.name);
        a.beFed(true);
    }

    public void admire(Animal a){
        System.out.println("Keeper " + this.name + " admires " + a.name + " <3 <3 <3" );
    }

    public void observe(Animal a){
        System.out.println("Keeper " + this.name + " observe " + a.name);
    }

}
