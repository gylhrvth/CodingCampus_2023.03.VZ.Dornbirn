package hassan.week10;

import java.util.ArrayList;
import java.util.List;

public class Resturant {

    private String name;
    private List<Bill> billList;
    private List<Waiter> waiterList;
    private List<Guest> guestList;


    public Resturant(String name) {
        this.name = name;
        this.billList = new ArrayList<>();
        this.waiterList = new ArrayList<>();
        guestList = new ArrayList<>();
    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }

    public void removeGuest(Guest guest){
        guestList.remove(guest);
    }

    public void addWaiter(Waiter waiter){
        waiterList.add(waiter);
    }
}
