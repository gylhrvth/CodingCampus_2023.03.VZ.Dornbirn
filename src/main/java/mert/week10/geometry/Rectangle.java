package mert.week10.geometry;

public class Rectangle extends Geometry {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getGetCircumference() {
        return 2 * (width + height);
    }

    @Override
    public double getGetArea() {
        return width * height;
    }
}
