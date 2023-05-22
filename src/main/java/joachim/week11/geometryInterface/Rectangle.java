package joachim.week11.geometryInterface;

public class Rectangle implements GeometryInterface {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }


    public double getArea() {
        return width * length;
    }
}
