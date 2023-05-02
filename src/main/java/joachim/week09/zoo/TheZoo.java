package joachim.week09.zoo;

import java.util.ArrayList;
import java.util.List;

public class TheZoo {
    public static void main(String[] args){

        Habitat pool = new Habitat("Pool");
        Habitat lionCage = new Habitat("LionCage");
        Habitat monkeyCage = new Habitat("MonkeyCage");
        Habitat birdHouse = new Habitat("BirdHouse");

        Zoo zoo = new Zoo("Hermann's Garten", 1840);
        zoo.addHabitat(pool);
        zoo.addHabitat(lionCage);
        zoo.addHabitat(monkeyCage);
        zoo.addHabitat(birdHouse);

    }
}
