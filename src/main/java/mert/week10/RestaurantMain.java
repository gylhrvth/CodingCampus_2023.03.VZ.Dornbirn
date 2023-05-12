package mert.week10;

import mert.week10.restaurant.*;

public class RestaurantMain {
    public static void main(String[] args) {
        HauptKellner hauptKellner = new HauptKellner("Eren");
        Restaurant restaurant = new Restaurant("Dolce Vita", hauptKellner);

        Raum raum1 = new Raum("Raum 1");
        Raum raum2 = new Raum("Raum 2");
        Raum raum3 = new Raum("Raum 3");

        Tisch tisch1 = new Tisch("Tisch klein ", 2);
        Tisch tisch2 = new Tisch("Tisch mittel", 5);
        Tisch tisch3 = new Tisch("Tisch groß  ", 8);
        Tisch tisch4 = new Tisch("Tisch klein ", 3);
        Tisch tisch5 = new Tisch("Tisch mittel", 6);
        Tisch tisch6 = new Tisch("Tisch groß  ", 10);
        Tisch tisch7 = new Tisch("Tisch klein ", 4);
        Tisch tisch8 = new Tisch("Tisch mittel", 8);
        Tisch tisch9 = new Tisch("Tisch groß  ", 12);


        Kellner kellner1 = new Kellner("Tunahan");
        Kellner kellner2 = new Kellner("Aygün");
        Kellner kellner3 = new Kellner("Hassan");



        restaurant.addKellner(kellner1);
        restaurant.addKellner(kellner2);
        restaurant.addKellner(kellner3);

        kellner1.addRaum(raum1);
        kellner2.addRaum(raum2);
        kellner3.addRaum(raum3);

        restaurant.addRaum(raum1);
        restaurant.addRaum(raum2);
        restaurant.addRaum(raum3);

        raum1.addTisch(tisch1);
        raum1.addTisch(tisch2);
        raum1.addTisch(tisch3);

        raum2.addTisch(tisch4);
        raum2.addTisch(tisch5);
        raum2.addTisch(tisch6);

        raum3.addTisch(tisch7);
        raum3.addTisch(tisch8);
        raum3.addTisch(tisch9);





        restaurant.printRestaurant();
        System.out.println();
        System.out.println("=== Start Simulation ===");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            restaurant.tickSimulation();

        }
    }
}
