package hassan.week10.IGeometry;

public class Star implements IGeometry{
    private double height;

    public Star(double height) {
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 8 * height;
    }

    @Override
    public double getArea() {
        return (1 + Math.sqrt(3)) * height * height;
    }
}
