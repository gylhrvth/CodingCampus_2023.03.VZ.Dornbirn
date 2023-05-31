package hassan.week10.IGeometry;

public class Rectangle implements IGeometry{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

}
