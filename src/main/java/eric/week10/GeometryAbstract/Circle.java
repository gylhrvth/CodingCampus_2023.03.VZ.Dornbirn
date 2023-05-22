package eric.week10.GeometryAbstract;

public class Circle extends Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
