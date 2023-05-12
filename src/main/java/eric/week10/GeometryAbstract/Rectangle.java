package eric.week10.GeometryAbstract;

public class Rectangle extends Geometry {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
