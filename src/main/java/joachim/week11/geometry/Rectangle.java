package joachim.week11.geometry;

public class Rectangle extends Geometry{
double width;
double length;
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getCircumference() {
        return 2*width + 2*length;
    }

    @Override
    double getarea() {
        return width*length;
    }
}
