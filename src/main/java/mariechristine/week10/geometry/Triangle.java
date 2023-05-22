package mariechristine.week10.geometry;

public class Triangle extends Geometry {

    private double length;
    private double height;

    public Triangle(double length) {
        this.length = length;
        this.height = Math.sqrt(3.0/4.0) * length;
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
