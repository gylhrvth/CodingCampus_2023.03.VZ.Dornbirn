package juliafh.zoo;

import java.util.ArrayList;
import java.lang.Thread;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Dornbirn Zoo", 2013);
        Habitat aw = new Habitat("Alpenwiese");
        Habitat r = new Habitat("Ried");
        Habitat tw = new Habitat("Terrarium (warm)");

        zoo.addAnimalType(aw);
        zoo.addAnimalType(r);
        zoo.addAnimalType(tw);

        Animal riska = new Animal("Rijska", "Kuh", new Food("a", 10, 1.5), 100, 0);
        aw.addAnimal(riska);

        Animal g = new Animal("Garmond", "Storh", new Food("b", 1.5, 4), 100, 43);
        Animal h = new Animal("Hugo", "Storh", new Food("b", 1.3, 4), 100, 2);
        Animal i = new Animal("Idaxis", "Storh", new Food("b", 1.4, 4), 100, 52);
        r.addAnimal(g);
        r.addAnimal(h);
        r.addAnimal(i);


        ArrayList<Habitat> johnsHabitats =new ArrayList<Habitat>();
        johnsHabitats.add(aw);
        johnsHabitats.add(r);
        Keeper john = new Keeper("John", johnsHabitats);
        john.setFavoriteAnimal("Rijska");
        zoo.addKeeper(john);

        ArrayList<Habitat> adamsAnimals = new ArrayList<Habitat>();
        adamsAnimals.add(r);
        Keeper adam = new Keeper("Adam", adamsAnimals);
        zoo.addKeeper(adam);

        int day = 1;
        while (true) {
            // System event
            makeAnimalsHungry(zoo);
            System.out.println("DAY " + day);

            // Actions
            mainLoop(zoo);

            // Report
            zoo.printStatus();
            System.out.println("-----------------------------------");
            zoo.printFoodStats();
            day++;
        }
    }

    public static void mainLoop(Zoo zoo) {
        for (int it = 8; it < 17; it++) {
            System.out.print(it + ":00 - ");
            for (int ik = 0; ik < zoo.getKeepers().size(); ik++) {
                try {
                    zoo.getKeepers().get(ik).work();
                    Thread.sleep(1000);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
            for (int iat = 0; iat < zoo.getHabitats().size(); iat++) {
                Habitat at = zoo.getHabitats().get(iat);

                // Nobody to bite here
                if (at.aliveAnimals() <= 1) {
                    continue;
                }

                for (int ia = 0; ia < at.getAnimals().size(); ia++) {
                    Animal a = at.getAnimals().get(ia);
                    // Dead animals don't bite anymore
                    if (a.currentHealth == 0) {
                        continue;
                    }

                    // 40% chance to bite
                    Random rand = new Random();
                    int chance = rand.nextInt(100);
                    if (chance >= 60) {
                        // TODO nomnom somebody
                    }
                }
            }
        }
    }

    public static void makeAnimalsHungry(Zoo zoo) {
        for (var at = 0; at<zoo.getHabitats().size(); at++) {
            var t = zoo.getHabitats().get(at);
            for (var it=0; it<t.getAnimals().size();it++) {
                var a = t.getAnimals().get(it);
                a.beFed(false);
            }
        }
    }
}
