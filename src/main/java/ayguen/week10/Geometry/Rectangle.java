package ayguen.week10.Geometry;

public class Rectangle extends Geometry {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 2* (width * height);
    }
}
