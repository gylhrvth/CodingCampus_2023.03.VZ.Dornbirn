package mert.week11.Geo;

public class Cirlce implements Geometry {
    public double radius;

    public Cirlce(double radius){
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
