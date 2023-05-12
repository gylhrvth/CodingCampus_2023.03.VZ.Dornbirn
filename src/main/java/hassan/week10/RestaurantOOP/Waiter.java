package hassan.week10.RestaurantOOP;

import hassan.week10.RestaurantOOP.Guest;
import hassan.week10.RestaurantOOP.Room;
import hassan.week10.RestaurantOOP.Table;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private String name;

    private List<Room> roomList;

    public Waiter(String name) {
        this.name = name;
        this.roomList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void doTick() {
        for (Room room : roomList) {
            for (Table table : room.getTableList()) {
                //gäste am tisch
                if (table.getSeatedGuest() != null) {
                    Guest guest = table.getSeatedGuest();
                    if (guest.getState() == 0) {
                        guest.setState(1);
                        System.out.println("Kellner " + name + " nimmt Bestellug vom Gast " + guest.getName() + " am Tisch " + table.getNumber() + " auf");

                    }
                } else if (table.getState() == 2) {

                }
            }


        }


    }


}

