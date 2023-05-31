package eric.week10.GeometryAbstract;

public class Square extends Rectangle {
    private double length;

    public Square(double length) {
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
