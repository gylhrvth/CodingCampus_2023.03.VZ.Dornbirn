package hassan.week10;

import java.util.ArrayList;
import java.util.List;

public class ChefWaiter {
    private String name;
    private List<Table> tableList;

    private enum bringGuestBillingOrMenu {BILLING, MENU}

    public ChefWaiter(String name) {
        this.name = name;
        tableList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void printGreetGuest() {

    }

    public void bringGuestBilling() {

    }

    public void bringGuestMenu() {

    }
}
