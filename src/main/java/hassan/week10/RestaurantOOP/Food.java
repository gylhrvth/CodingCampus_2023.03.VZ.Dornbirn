package hassan.week10.RestaurantOOP;

public class Food extends Menuitem {
    private double cost;

    public Food(String name,double cost) {
        super(name, cost);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
