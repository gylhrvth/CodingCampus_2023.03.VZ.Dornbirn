package hassan.week10.GeometryExc;

public class Circle extends Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

}
