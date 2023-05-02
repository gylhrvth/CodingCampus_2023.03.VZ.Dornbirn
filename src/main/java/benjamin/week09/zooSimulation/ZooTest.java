package benjamin.week09.zooSimulation;

public class ZooTest {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn", "2022");

        Enclosure enclosure1 = new Enclosure("Alpenwiese");
        Enclosure enclosure2 = new Enclosure("Ried");
        Enclosure enclosure3 = new Enclosure("Terrarium (warm)");

        Food food1 = new Food("Apple", 1, 1.0);
        Food food2 = new Food("Rice", 1, 1.5);


        Animal animal1 = new Animal("Rijska", "Kuh", food1, 20);
        Animal animal2 = new Animal("Garmond", "Storch", food2, 10);
        Animal animal3 = new Animal("Hugo", "Storch", food2, 10);
        Animal animal4 = new Animal("Idaxis", "Storch", food2, 10);

        //Enclosure 1 + Animals
        zoo.addEnclosure(enclosure1);
        enclosure1.addAnimal(animal1);
        //Enclosure 2 + Animals
        zoo.addEnclosure(enclosure2);
        enclosure2.addAnimal(animal2);
        enclosure2.addAnimal(animal3);
        enclosure2.addAnimal(animal4);
        //Enclosure 3 + Animals
        zoo.addEnclosure(enclosure3);

        zoo.printZoo();

        zoo.printFoodRequirement();
    }
}
