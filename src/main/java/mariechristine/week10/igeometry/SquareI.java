package mariechristine.week10.igeometry;

public class SquareI extends RectangleI {

    private double length;

    public SquareI(double length) {
        super(length, length);
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
