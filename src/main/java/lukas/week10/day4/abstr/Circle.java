package lukas.week10.day4.abstr;

public class Circle extends Geometry {
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
