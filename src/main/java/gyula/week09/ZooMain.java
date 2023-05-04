package gyula.week09;

import gyula.week09.zoo.Animal;
import gyula.week09.zoo.Enclosure;
import gyula.week09.zoo.Food;
import gyula.week09.zoo.Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo tierparkFeldkirch = new Zoo("Tierpark Feldkirch", 1995);

        Food fleisch = tierparkFeldkirch.findOrCreateFood("Fleisch", "kg", 470);
        Food heu = tierparkFeldkirch.findOrCreateFood("Heu", "kg", 35);
        Food tubiflex = tierparkFeldkirch.findOrCreateFood("Tubiflex", "g", 15);



        tierparkFeldkirch.findOrCreateAnimal("Leo", "Löwe", "Savanna", fleisch, 15);
        tierparkFeldkirch.findOrCreateAnimal("Luise", "Löwe", "Savanna", fleisch, 12);
        tierparkFeldkirch.findOrCreateAnimal("Zeppelin", "Zebra", "Savanna II", heu, 20);
        tierparkFeldkirch.findOrCreateAnimal("Zeno", "Zebra", "Savanna II", heu, 18);
        tierparkFeldkirch.findOrCreateAnimal("Gustav", "Goldfisch", "Aquarium", tubiflex, 10);
        tierparkFeldkirch.findOrCreateAnimal("Gedeon", "Goldfisch", "Aquarium", tubiflex, 10);
        tierparkFeldkirch.findOrCreateAnimal("Gerold", "Goldfisch", "Aquarium", tubiflex, 10);

        tierparkFeldkirch.printStucture();
        System.out.println("=======================");
        tierparkFeldkirch.printDailyFoodNeed();
    }
}
