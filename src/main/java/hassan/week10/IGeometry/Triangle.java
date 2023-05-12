package hassan.week10.IGeometry;

public class Triangle implements IGeometry{
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double getCircumference() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3.0) / 4.0;
    }
}
