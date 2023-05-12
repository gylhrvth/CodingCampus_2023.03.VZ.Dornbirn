package mariechristine.week10.igeometry;

public class Circle implements IGeometry {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
