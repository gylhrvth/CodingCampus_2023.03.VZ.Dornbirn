package mariechristine.week10.igeometry;

public class TriangleI implements IGeometry {

    private double length;
    private double height;

    public TriangleI(double length, double height) {
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
