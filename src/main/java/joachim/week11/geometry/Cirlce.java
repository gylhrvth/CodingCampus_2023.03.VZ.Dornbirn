package joachim.week11.geometry;

public class Cirlce extends Geometry {
    double radius;

    public Cirlce(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getarea() {
        return Math.pow(radius, 2) * Math.PI;

    }
}