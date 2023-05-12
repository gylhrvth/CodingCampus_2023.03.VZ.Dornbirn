package mariechristine.week10.geometry;

public class Triangle extends Geometry {

    private double length;
    private double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 3 * length;
    }

    @Override
    public double getArea() {
        return 0.5 * length * height;
    }
}
