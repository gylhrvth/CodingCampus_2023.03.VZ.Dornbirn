package hassan.week10.RestaurantOOP;

public class Menuitem {
    private double price;
    private String name;
    private int quantity;
    private Menuitem menuitem;

    public Menuitem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Menuitem getMenuItem() {
        return menuitem;
    }

    public double getPrice() {
        return price;
    }
}
