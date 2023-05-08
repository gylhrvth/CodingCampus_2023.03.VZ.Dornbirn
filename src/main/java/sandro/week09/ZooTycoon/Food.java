package sandro.week09.ZooTycoon;

import lukas.week03.day4.Colors;

public class Food {
    private String name;
    private String unit;
    private double unitprice;


    public Food(String name, String unit, double unitprice) {
        this.name = Colors.COLORS[7]+ name +Colors.RESET;
        this.unit = unit;
        this.unitprice = unitprice;
    }

    public String getName() {
        return name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public String getUnit() {
        return unit;
    }
}