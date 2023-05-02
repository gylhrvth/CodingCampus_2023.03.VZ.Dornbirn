package joachim.week09.zoo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TheZoo {
    public static void main(String[] args) {
        Food meat = new Food("meat", 4.60F, "kg");
        Food fish = new Food("fish", 10.51F, "kg");
        Food fruit = new Food("Mango", 7.5F, "kg");
        Food nuts = new Food("Nuts and Berries", 18, "dkg");
        Food heu = new Food("Heu", 0.09F, "kg");


        Animal zebra = new Animal("Zeppelin", "Zebra", 2, heu, 9);


        Animal lion = new Animal("Abe", "Lion", 15, meat, 6);
        Animal lionfe = new Animal("Charlie", "Lion", 14, meat, 5);
        Animal killerWhale = new Animal("Habibi", "Orca", 22, fish, 227);
        Animal killerWhaleMale = new Animal("Roger", "Orca", 25, fish, 220);
        Animal orangutan = new Animal("Ape", "Orangutan", 40, fruit, 50);
        Animal chimpanzee = new Animal("Chip", "Chimpanzee", 25, fruit, 30);
        Animal chimp = new Animal("Chap", "Chimpanzee", 26, fruit, 30);
        Animal bird = new Animal("Rudy", "Grey African", 30, nuts, 20);
        Animal birb = new Animal("Trudy", "Grey African", 35, nuts, 20);

        Habitat pool = new Habitat("Pool");
        Habitat lionCage = new Habitat("LionCage");
        Habitat monkeyCage = new Habitat("MonkeyCage");
        Habitat birdHouse = new Habitat("BirdHouse");

        lionCage.addAnimal(lion);
        lionCage.addAnimal(lionfe);
//_________________________________________
        pool.addAnimal(killerWhaleMale);
        pool.addAnimal(killerWhale);
//_________________________________________
        monkeyCage.addAnimal(orangutan);
        monkeyCage.addAnimal(chimpanzee);
        monkeyCage.addAnimal(chimp);
//_________________________________________
        birdHouse.addAnimal(bird);
        birdHouse.addAnimal(birb);
//_________________________________________

        Zoo zoo = new Zoo("Hermann's Garden", 1840);
        zoo.addHabitat(pool);
        zoo.addHabitat(lionCage);
        zoo.addHabitat(monkeyCage);
        zoo.addHabitat(birdHouse);

        zoo.printLayout();
        zoo.printDailyCost();
    }
}