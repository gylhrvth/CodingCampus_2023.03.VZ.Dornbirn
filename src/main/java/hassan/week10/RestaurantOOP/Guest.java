package hassan.week10.RestaurantOOP;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String name;
    private int groupSize;
    private List<Menuitem> orderitems;
    private Menu menu;
    private int state = 0;

    public Guest(String name, int groupSize) {
        this.name = name;
        this.groupSize = groupSize;
        this.orderitems = new ArrayList<>();
        this.state = 0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public double calculateBill() {
        double total = 0.0;
        for (Menuitem item : orderitems) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }


    public String getName() {
        return name;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void addOrderItem(Menuitem menuItem) {
        orderitems.add(menuItem);
    }
    public List<Menuitem> getOrderItems() {
        return orderitems;
    }


}
