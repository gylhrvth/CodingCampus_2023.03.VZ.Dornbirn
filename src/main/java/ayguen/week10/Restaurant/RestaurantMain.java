package ayguen.week10.Restaurant;

public class RestaurantMain {

    public static void main(String[] args) {
        HauptKellner hauptKellner = new HauptKellner("Aygün");
        Restaurant restaurant = new Restaurant("Dolce Vita", hauptKellner);
        restaurant.printRestaurant();
        Raum raum1 = new Raum("Raum 1");
        Raum raum2 = new Raum("Raum 2");
        Raum raum3 = new Raum("Raum 3");


        Kellner kellner1 = new Kellner("Mert");
        Kellner kellner2 = new Kellner("Tuni");
        Kellner kellner3 = new Kellner("Muhi");


        Tisch tisch = new Tisch("Tisch 1", 3);
        Tisch tisch1 = new Tisch("Tisch 2", 4);
        Tisch tisch2 = new Tisch("Tisch 3", 3);

        Tisch tisch3 = new Tisch("Tisch 4", 6);
        Tisch tisch4 = new Tisch("Tisch 5", 9);
        Tisch tisch5 = new Tisch("Tisch 6", 8);

        Tisch tisch6 = new Tisch("Tisch 7", 14);
        Tisch tisch7 = new Tisch("Tisch 8", 12);
        Tisch tisch8 = new Tisch("Tisch 9", 11);

        restaurant.addRaum(raum1);
        restaurant.addRaum(raum2);
        restaurant.addRaum(raum3);


//raum klein
        raum1.printRaumName(kellner1);
        raum1.addTisch(tisch);
        raum1.addTisch(tisch1);
        raum1.addTisch(tisch2);
//raum mittel
        raum2.printRaumName(kellner2);
        raum2.addTisch(tisch3);
        raum2.addTisch(tisch4);
        raum2.addTisch(tisch5);

//raum groß
        raum3.printRaumName(kellner3);
        raum3.addTisch(tisch6);
        raum3.addTisch(tisch7);
        raum3.addTisch(tisch8);

        System.out.println("----------------------------------------");

        raum1.arbeitetinRaum(kellner1);
        raum2.arbeitetinRaum(kellner2);
        raum3.arbeitetinRaum(kellner3);

        System.out.println("...");


        for (int i = 0; i < 100; i++) {
            restaurant.tickSimulation();

        }
    }
}
