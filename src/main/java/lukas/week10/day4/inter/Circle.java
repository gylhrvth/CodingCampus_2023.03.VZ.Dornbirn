package lukas.week10.day4.inter;

public class Circle implements Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
