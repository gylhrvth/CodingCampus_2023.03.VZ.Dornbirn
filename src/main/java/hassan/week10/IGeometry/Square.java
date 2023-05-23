package hassan.week10.IGeometry;

public class Square implements IGeometry{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
