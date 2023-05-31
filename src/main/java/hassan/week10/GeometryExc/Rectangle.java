package hassan.week10.GeometryExc;

public class Rectangle extends Geometry{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getCircumference() {
        return 2 * (width + height);
    }


    public double getArea() {
        return width * height;
    }

}
