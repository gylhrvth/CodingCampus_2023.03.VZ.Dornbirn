package eric.week09.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tiergarten XYZ", 2023);

        Zookeeper stero = new Zookeeper("Steroide");
        Zookeeper trenbo = new Zookeeper("Trenbolon");

        Food fish = new Food("Fisch", "kg", 600);
        Food leaves = new Food("Leaves", "g", 12);
        Food meat = new Food("Meat", "kg", 1200);
        Food shrimp = new Food("Shrimp", "kg", 320);
        Food insects = new Food("Insects", "g", 120);

        Enclosure savanna = new Enclosure("Savanna");
        Enclosure savannaOutback = new Enclosure("Savanna Outback");
        Enclosure saltWaterAquarium = new Enclosure("Salt Water Aquarium");
        Enclosure northPoleAquarium = new Enclosure("North Polar Aquarium");
        Enclosure northPoleEnclosure = new Enclosure("North Polar Enclosure");
        Enclosure terrarium = new Enclosure("Terrarium");

        Animal lion = new Animal("Lion", meat, 65);
        Animal elephant = new Animal("Elephant", leaves, 150000);
        Animal giraffe =  new Animal("Giraffe", leaves, 90000);
        Animal shark = new Animal("Shark", meat, 30);
        Animal tuna = new Animal("Blue Fin Tuna", shrimp, 20);
        Animal iceBear = new Animal("Ice Bear", meat, 40);
        Animal penguins = new Animal("Penguins", fish, 20);
        Animal spider = new Animal("Black Widow", insects, 5);
        Animal snake = new Animal("Black Mamba", meat, 40);

        zoo.addEnclosure(savanna);
        zoo.addEnclosure(savannaOutback);
        zoo.addEnclosure(saltWaterAquarium);
        zoo.addEnclosure(northPoleAquarium);
        zoo.addEnclosure(northPoleEnclosure);
        zoo.addEnclosure(terrarium);

        savanna.addAnimalToEnclosure(elephant);
        savanna.addAnimalToEnclosure(giraffe);
        savannaOutback.addAnimalToEnclosure(lion);
        saltWaterAquarium.addAnimalToEnclosure(shark);
        saltWaterAquarium.addAnimalToEnclosure(tuna);
        northPoleAquarium.addAnimalToEnclosure(penguins);
        northPoleEnclosure.addAnimalToEnclosure(iceBear);
        terrarium.addAnimalToEnclosure(spider);
        terrarium.addAnimalToEnclosure(snake);

        zoo.addZookeeper(stero);
        zoo.addZookeeper(trenbo);

        stero.addZookeeperToEnclosure(savanna);
        stero.addZookeeperToEnclosure(savannaOutback);
        stero.addZookeeperToEnclosure(saltWaterAquarium);
        trenbo.addZookeeperToEnclosure(northPoleEnclosure);
        trenbo.addZookeeperToEnclosure(northPoleAquarium);
        trenbo.addZookeeperToEnclosure(terrarium);

        zoo.printZooStructure();
        zoo.printDailyFoodCost();
        zoo.simulation();
    }
}
