package joachim.week11.geometryInterface;

public class Cirlce implements GeometryInterface {
    double radius;

    public Cirlce(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;

    }
}