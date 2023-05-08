package benjamin.week09.zooSimulation;

public class ZooTest {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2022);

        Enclosure enclosure1 = new Enclosure("Alpenwiese");
        Enclosure enclosure2 = new Enclosure("Ried");
        Enclosure enclosure3 = new Enclosure("Terrarium (warm)");
        Enclosure enclosure4 = new Enclosure("Aquarium");

        Food food1 = new Food("Apple", "kg", 1.2);
        Food food2 = new Food("Rice", "kg", 1.5);
        Food food3 = new Food("Brösel", "kg", 0.5);
        Food food4 = new Food("Fleisch", "kg", 4);

        Animal animal1 = new Animal("Rijska", "Kuh", 100, 100, 40, food1, 20);
        Animal animal2 = new Animal("Garmond", "Storch", 20, 20, 15, food2, 10);
        Animal animal3 = new Animal("Harry", "Storch", 20, 20, 15, food2, 10);
        Animal animal4 = new Animal("Idaxis", "Storch", 20, 20, 15, food2, 10);
        Animal animal5 = new Animal("Goldi", "Fisch", 5, 5, 1, food3, 3);
        Animal animal6 = new Animal("Horst", "Hai",100,100, 100,food4,4);
        Animal animal7 = new Animal("Goldi 2", "Fisch", 5, 5, 1, food3, 3);
        Animal animal8 = new Animal("Goldi 3", "Fisch", 5, 5, 1, food3, 3);
        Animal animal9 = new Animal("Goldi 4", "Fisch", 5, 5, 1, food3, 3);
        Animal animal10 = new Animal("Goldi 5", "Fisch", 5, 5, 1, food3, 3);
        Animal animal11 = new Animal("Goldi 6", "Fisch", 5, 5, 1, food3, 3);

        Keeper keeper1 = new Keeper("Hugo", "Kuh");
        Keeper keeper2 = new Keeper("Manfred", "Fisch");
        Keeper keeper3 = new Keeper("Gustavo", "Storch");
        Keeper keeper4 = new Keeper("Susi", "Fisch");

        Doctor doctor1 = new Doctor("Dr.Oberschlau");
        Doctor doctor2 = new Doctor("Dr.Superschlau");

        zoo.addDoctor(doctor1);
        zoo.addDoctor(doctor2);

        //Keeper1 + Enclosure
        keeper1.addEnclosure(zoo, enclosure1);
        keeper1.addEnclosure(zoo, enclosure2);
        //Keeper2 + Enclosure
        keeper2.addEnclosure(zoo, enclosure1);
        //Keeper3 + Enclosure
        keeper3.addEnclosure(zoo, enclosure4);
        //Keeper4 + Enclosure
        keeper4.addEnclosure(zoo, enclosure2);
        keeper4.addEnclosure(zoo, enclosure4);

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
        //Enclosure 4 + Animals
        zoo.addEnclosure(enclosure4);
        enclosure4.addAnimal(animal5);
        enclosure4.addAnimal(animal6);

        enclosure4.addAnimal(animal7);
        enclosure4.addAnimal(animal8);
        enclosure4.addAnimal(animal9);
        enclosure4.addAnimal(animal10);
        enclosure4.addAnimal(animal11);

        zoo.printZoo();
        zoo.printFoodRequirement();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Day " + i + ":");
            zoo.simulate();
            System.out.println();
        }
    }
}
