package hassan.week09.Zoo;

import eric.week09.zoo.Zookeeper;
import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.List;

public class ZooMain {
    public static void main(String[] args) {
        ZooData zoo = new ZooData("Tiergarten Dornbirn", 2022);

        ZooKeeper eric = new ZooKeeper("Eric");
        ZooKeeper hassan = new ZooKeeper("Hassan");

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

        Animal lion = new Animal("Lion", meat, 65,100,100);
        Animal elephant = new Animal("Elephant", leaves, 150000,100,40);
        Animal giraffe =  new Animal("Giraffe", leaves, 90000,100,45);
        Animal shark = new Animal("Shark", meat, 30,100,80);
        Animal tuna = new Animal("Blue Fin Tuna", shrimp, 20,100,12);
        Animal iceBear = new Animal("Ice Bear", meat, 40,100,40);
        Animal penguins = new Animal("Penguins", fish, 20,100,10);
        Animal spider = new Animal("Black Widow", insects, 5,100,75);
        Animal snake = new Animal("Mamba", meat, 40,100,99);

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

        zoo.addZookeeper(eric);
        zoo.addZookeeper(hassan);

        eric.addZookeeperToEnclosure(savanna);
        eric.addZookeeperToEnclosure(savannaOutback);
        eric.addZookeeperToEnclosure(saltWaterAquarium);

        hassan.addZookeeperToEnclosure(savannaOutback);
        hassan.addZookeeperToEnclosure(saltWaterAquarium);
        hassan.addZookeeperToEnclosure(northPoleEnclosure);
        hassan.addZookeeperToEnclosure(northPoleAquarium);
        hassan.addZookeeperToEnclosure(terrarium);

        zoo.printZooStructure();
        zoo.printDailyFoodCost();
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(Colors.COLORS[1] + "\n Day (" + i + ")" + Colors.RESET);
            zoo.simulation();
        }


    }




}


