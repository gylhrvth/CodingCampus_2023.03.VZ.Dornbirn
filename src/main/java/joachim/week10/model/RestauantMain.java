package joachim.week10.model;

import java.util.Random;

public class RestauantMain {
    public static void main(String[] args) {
        Random rand = new Random();

        Menu menu = new Menu();
        Food pizza = new Food("Pizza", 13.50);
        Food bolognese = new Food("bolognese", 14.00);
        Food steak = new Food("Steak", 48.60);

        menu.addFood(pizza);
        menu.addFood(bolognese);
        menu.addFood(steak);

        Server james = new Server("James");
        Restaurant restaurant = new Restaurant("Götzes Pizzapalast", james, menu);


        Table balcony1 = new Table(restaurant, "balcony1", 2);
        Table balcony2 = new Table(restaurant, "balcony2", 4);
        Table balcony3 = new Table(restaurant, "balcony3", 2);
        Table balcony4 = new Table(restaurant, "balcony3", 4);


        Table inside1 = new Table(restaurant, "inside1", 8);
        Table inside2 = new Table(restaurant, "inside2", 14);
        Table inside3 = new Table(restaurant, "inside3", 6);
        Table inside4 = new Table(restaurant, "inside4", 5);
        Table inside5 = new Table(restaurant, "inside5", 7);

        Table arena1 = new Table(restaurant, "arena1", 25);
        Table arena2 = new Table(restaurant, "arena2", 35);
        Table arena3 = new Table(restaurant, "arena3", 16);
        Table arena4 = new Table(restaurant, "arena4", 22);
        Table arena5 = new Table(restaurant, "arena5", 28);
        Table arena6 = new Table(restaurant, "arena6", 16);

        Server harald = new Server("Harald");
        Server gerlinde = new Server("Gerinde");
        Server flora = new Server("Flora");

        Room balcony = new Room("Balcony",harald);
        Room inside = new Room("Inside",gerlinde);
        Room arena = new Room("Arena",flora);


        balcony.addTable(balcony1);
        balcony.addTable(balcony2);
        balcony.addTable(balcony3);
        balcony.addTable(balcony4);

        inside.addTable(inside1);
        inside.addTable(inside2);
        inside.addTable(inside3);
        inside.addTable(inside4);
        inside.addTable(inside5);

        arena.addTable(arena1);
        arena.addTable(arena2);
        arena.addTable(arena3);
        arena.addTable(arena4);
        arena.addTable(arena5);
        arena.addTable(arena6);

        restaurant.addRoom(balcony);
        restaurant.addRoom(inside);
        restaurant.addRoom(arena);






//        adding and leaving Visitors
        for (int i = 8; i <= 17; i++) {
            boolean open = i != 17;
            System.out.println("Time: " + i + ":00");
            for (int iGast = 1; iGast < rand.nextInt(1, 4); iGast++) {
                VisitorGroup vg = new VisitorGroup("Group" + iGast, rand.nextInt(1, 20));
                if (open) {
                    restaurant.arrive(vg);
                }
            }
            restaurant.leave(open);
            if (i == 17) {
                System.out.println("The restaurant closes");
            }
        }
    }
}