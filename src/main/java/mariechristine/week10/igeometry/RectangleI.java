package mariechristine.week10.igeometry;

public class RectangleI implements IGeometry {

    private double length;
    private double width;

    public RectangleI(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
