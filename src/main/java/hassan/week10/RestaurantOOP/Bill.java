package hassan.week10.RestaurantOOP;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Menuitem> orders;
    private Waiter waiter;
    private Table table;


    public Bill(Table table, Waiter waiter) {
        this.orders = new ArrayList<>();
        this.table = table;
        this.waiter = waiter;
    }

    public Waiter getWaiter() {
        return waiter;
    }
    public Table getTable() {
        return table;
    }

    public void addItem(Menuitem item) {
        orders.add(item);
    }
    public void removeItem(Menuitem item) {
        orders.remove(item);
    }
    public List<Menuitem> getItems() {
        return orders;
    }
    public double getTotalPrice() {
        double total = 0;
        for (Menuitem item : orders) {
            total += item.getPrice();
        }
        return total;
    }


}
