package mert.week10.geometry;

public class Circle extends Geometry {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double getGetCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getGetArea() {
        return radius * radius * Math.PI;
    }
}
