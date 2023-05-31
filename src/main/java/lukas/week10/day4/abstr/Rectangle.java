package lukas.week10.day4.abstr;

public class Rectangle extends Geometry {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
