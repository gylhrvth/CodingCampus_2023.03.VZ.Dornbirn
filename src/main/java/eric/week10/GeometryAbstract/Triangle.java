package eric.week10.GeometryAbstract;

public class Triangle extends Geometry{
    private double length;


    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return length * 3;
    }

    @Override
    public double getArea() {
        return (length * length * Math.sqrt(length)) / 4;
    }
}
