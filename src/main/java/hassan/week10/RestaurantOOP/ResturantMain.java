package hassan.week10.RestaurantOOP;

import java.util.ArrayList;
import java.util.List;

public class ResturantMain {
    public static void main(String[] args) {


        Resturant alZayn = new Resturant("Al Zayn");

        Room room1 = new Room("Room", new Waiter("Hassan"));
        Room room2 = new Room("Room 2", new Waiter("Eric"));
        Room room3 = new Room("Room 3 ", new Waiter("Boso"));

        alZayn.addRoom(room1);
        alZayn.addRoom(room2);
        alZayn.addRoom(room3);


        Food steak = new Food("Steak", 20);
        Food salad = new Food("Salad", 10);
        Drink beer = new Drink("Beer", 5);
        Drink wine = new Drink("Wine", 10);

        ArrayList<Menuitem> menuItems = new ArrayList<>();
        menuItems.add(steak);
        menuItems.add(salad);
        menuItems.add(beer);
        menuItems.add(wine);

        Menu menu = new Menu(menuItems);

        Table table = new Table(1, 4);

        Guest guest1 = new Guest("John", 2);
        Guest guest2 = new Guest("Hassan", 4);

        Waiter waiter = new Waiter("Eric");
        Waiter waiter1 = new Waiter("Boso");


        ChefWaiter chefWaiter = new ChefWaiter("Lukas");
        chefWaiter.printGreetGuest(guest1);



        System.out.println();
        chefWaiter.bringGuestMenu(guest1,menu);
        System.out.println();

        List<Menuitem> order1 = new ArrayList<>();
        order1.add(steak);
        order1.add(wine);

        List<Menuitem> order2 = new ArrayList<>();
        order2.add(salad);
        order2.add(beer);

        chefWaiter.printGuestBilling(guest1,table);


    }
}
