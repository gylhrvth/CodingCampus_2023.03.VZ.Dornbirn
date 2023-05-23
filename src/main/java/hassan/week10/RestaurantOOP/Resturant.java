package hassan.week10.RestaurantOOP;

import java.util.ArrayList;
import java.util.List;

public class Resturant {

    private String name;
    private List<Bill> billList;
    private List<Waiter> waiterList;
    private List<Guest> guestList;
    private List<Room> roomList;


    public Resturant(String name) {
        this.name = name;
        this.billList = new ArrayList<>();
        this.waiterList = new ArrayList<>();
        guestList = new ArrayList<>();
        roomList = new ArrayList<>();
    }

    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    public void removeGuest(Guest guest) {
        guestList.remove(guest);
    }

    public void addWaiter(Waiter waiter) {
        waiterList.add(waiter);
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }


    public void calcMostMoneyBroughtIn() {
        Waiter topWaiter = null;
        double maxRevenue = 0.0;

        for (Waiter waiter : waiterList) {
            double revenue = 0.0;
            for (Bill bill : billList) {
                if (bill.getWaiter().equals(waiter)) {
                    revenue += bill.getTotalPrice();
                }
            }
            if (revenue > maxRevenue) {
                maxRevenue = revenue;
                topWaiter = waiter;
            }
        }

        if (topWaiter != null) {
            System.out.println("Der Kellner mit dem höchsten Umsatz ist " + topWaiter.getName() + " mit einem Umsatz von " + maxRevenue + " Euro.");
        } else {
            System.out.println("Es wurden noch keine Rechnungen erstellt.");
        }
    }

}


