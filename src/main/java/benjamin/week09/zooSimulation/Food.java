package benjamin.week09.zooSimulation;

public class Food {
    private String name;
    private double unit;
    private double unitPrice;

    public Food(String name, double unit, double unitPrice){
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnit() {
        return unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
