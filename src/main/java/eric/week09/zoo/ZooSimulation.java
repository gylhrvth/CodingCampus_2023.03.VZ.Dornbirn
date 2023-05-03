package eric.week09.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tiergarten XYZ", 2023);

//        Enclosure savannaOutback = new Enclosure("Savanna Outback");
//        Enclosure savanna = new Enclosure("Savanna");
//        Enclosure saltWater = new Enclosure("Salt Water Aquarium");
//        Enclosure northPole = new Enclosure("North Pole Aquarium");
//        Enclosure antarctica = new Enclosure("Antarctica");
//        Enclosure amazonas = new Enclosure("Amazonas");
//        Enclosure nile = new Enclosure("Nile");

        //Food aufrufen
        Food hay = new Food("Hay", "kg", 35);
        Food leaves = new Food("Leaves", "g", 12);
        Food meat = new Food("Meat", "kg", 900);
        Food shrimp = new Food("Shrimp", "kg", 400);
        Food insects = new Food("Insects", "g", 120);

        zoo.findOrCreateAnimal("Lion", meat, "Savanna Outback", 50);
        zoo.findOrCreateAnimal("Elephant", leaves, "Savanna", 150);
        zoo.findOrCreateAnimal("Giraffe", leaves, "Savanna", 70);
        zoo.findOrCreateAnimal("Shark", meat, "Salt Water Aquarium", 50);
        zoo.findOrCreateAnimal("Blue Fin Tuna", shrimp, "Salt Water Aquarium", 200);
        zoo.findOrCreateAnimal("Ice Bear", meat, "North Polar Zone", 60);
        zoo.findOrCreateAnimal("Penguins", meat, "Antarctica", 40);
        zoo.findOrCreateAnimal("Black Widow", insects, "Amazonas", 5);
        zoo.findOrCreateAnimal("Black Mamba", insects,"Nile",50);

//        zoo.findOrCreateEnclosure("Savanna", "Mihawk");
//        zoo.findOrCreateEnclosure("Savanna Outback", "Crocodile");
//        zoo.findOrCreateEnclosure("Salt Water Aquarium", "Doflamingo");
//        zoo.findOrCreateEnclosure("North Polar Zone");
//        zoo.findOrCreateEnclosure("Antarctica");
//        zoo.findOrCreateEnclosure("Amazonas");
//        zoo.findOrCreateEnclosure("Nile");
//
//        zoo.findOrCreateZookeeper("Mihawk", "Savanna");
//        zoo.findOrCreateZookeeper("Crocodile", "Savanna Outback");
//        zoo.findOrCreateZookeeper("Doflamingo", "Salt Water Aquarium");

        zoo.printZooStructure();
        zoo.printDailyFoodCost();
    }
}
