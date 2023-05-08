package benjamin.week09.zooSimulation;

public class Food {
    private String name;
    private String unit;
    private double unitPrice;

    public Food(String name, String unit, double unitPrice){
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
