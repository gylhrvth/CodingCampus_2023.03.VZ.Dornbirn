package sandro.week08.ZooTycoon;

import java.sql.Date;
import java.time.Instant;

public class ZooTycoon {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("WildLife Miami", 2001);

        ZooKeeper keeper1 = new ZooKeeper("Mike");
        ZooKeeper keeper2 = new ZooKeeper("Lila");
        ZooKeeper keeper3 = new ZooKeeper("Sandro");
        ZooKeeper keeper4 = new ZooKeeper("Burt");

        Food food1 = new Food("Weed","Barrel",30);
        Food food2 = new Food("Meat","kg",10);
        Food food3 = new Food("Mouse","Piece",5);

        Enclosure enc1 = new Enclosure("Meadow", "Outdoor", "Outside Temperature");
        Enclosure enc2= new Enclosure("Woods", "Outdoor", "Outside Temperature");
        Enclosure enc3 = new Enclosure("Reptile Terrarium", "Indoor", "Hot");
        Enclosure enc4 = new Enclosure("Fish Tank", "Indoor","Saltwater");

        Animal animal1 = new Animal("Berta", "Cow", food1,2);
        Animal animal2 = new Animal("El Torro", "Bull", food1, 4);
        Animal animal3 = new Animal("Ragna" , "Wolf", food2, 3);
        Animal animal4 = new Animal("Lagerta", "Wolf", food2,3);
        Animal animal5 = new Animal("Basil", "Snake", food3,5);
        Animal animal6 = new Animal("Medusa", "Snake",food3,5);

        keeper1.addTask(zoo, enc1);
        keeper1.addTask(zoo, enc2);
        keeper2.addTask(zoo, enc2);
        keeper2.addTask(zoo, enc3);
        keeper4.addTask(zoo, enc1);
        keeper4.addTask(zoo, enc2);
        keeper4.addTask(zoo, enc3);
        keeper4.addTask(zoo, enc4);

        zoo.addenc(enc1);
        enc1.addAnimal(animal1);
        enc1.addAnimal(animal2);
        zoo.addenc(enc2);
        enc2.addAnimal(animal3);
        enc2.addAnimal(animal4);
        zoo.addenc(enc3);
        enc3.addAnimal(animal5);
        enc3.addAnimal(animal6);
        zoo.addenc(enc4);
        zoo.printZoo();
        zoo.printFoodCost();


        System.out.println("_____________________________________________________________________________");
        System.out.println("02.May Tue 7:00 a Clock");
        System.out.println();
        // keeper1 begins task
        keeper1.taskdesciption();






    }




}
