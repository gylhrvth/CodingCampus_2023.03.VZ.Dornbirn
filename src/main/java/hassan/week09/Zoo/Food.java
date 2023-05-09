package hassan.week09.Zoo;

import java.util.List;

public class Food {
    private String name;
    private String unit;
    private int price;
    public Food(String name, String amount, int price){
        this.name = name;
        this.unit = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
