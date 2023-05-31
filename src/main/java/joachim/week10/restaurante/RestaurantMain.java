package joachim.week10.restaurante;

import lukas.week03.day4.Colors;

import java.util.Random;

public class RestaurantMain {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Herbert's Grillecke und Stripclub");
        ChefWaiter james = new ChefWaiter("James");
        Menu menu = new Menu();

        Food pizza = new Food("Pizza", 15.00);
        Food toast = new Food("Toast", 15.00);
        Food vegiToast = new Food("Vegi Toast", 15.00);

        menu.addFoodToMenu(pizza);
        menu.addFoodToMenu(toast);
        menu.addFoodToMenu(vegiToast);

        restaurant.addRooms(new Room("Restaurant1"), new Room("Restaurant2"), new Room("Restaurant3"), new Room("Restaurant4"),
                new Room("Club1"), new Room("Club2"), new Room("Club3"));

        for (Room rooms : restaurant.getRooms()) {
            rooms.addTable(new Table("Table1", 2), new Table("Table2", 4), new Table("Table3", 8), new Table("Table4", 16), new Table("Table5", 32));
        }
        for (int i = 1; i < restaurant.getRooms().size() + 1; i++) {
            ;
            Waiter waiter = new Waiter("Waiter" + i);
            restaurant.getRooms().get(i - 1).setWaiter(waiter);
        }

        for (int i = 8; i <= 18; i++) {
            System.out.println(Colors.COLORS[4] + "Time: " + i + ":00" + Colors.RESET);
            restaurant.arrival(james);
        }
    }
}


