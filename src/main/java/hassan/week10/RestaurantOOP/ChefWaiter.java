package hassan.week10.RestaurantOOP;

import java.util.ArrayList;
import java.util.List;

public class ChefWaiter {
    private String name;
    private List<Table> tableList;

    public ChefWaiter(String name) {
        this.name = name;
        tableList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void printGreetGuest(Guest guest) {
        System.out.println("Welcome to our restaurant, " + guest.getName() + "!");
    }

    public void printGuestBilling(Guest guest, Table table) {
        System.out.println("Here is your bill, " + guest.getName() + ":");
       // table.printBill();
    }

    public void bringGuestMenu(Guest guest, Menu menu) {
        guest.setMenu(menu);
        System.out.println("Here is the menu, " + guest.getName() + ":");
        menu.printMenu();
    }
}
