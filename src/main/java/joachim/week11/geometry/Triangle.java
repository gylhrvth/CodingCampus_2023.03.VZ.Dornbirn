package joachim.week11.geometry;

public class Triangle extends Geometry{
    private double hypotenuse;
    private double side;

    public Triangle(double hypotenuse, double side) {
        this.hypotenuse = hypotenuse;
        this.side = side;
    }

    @Override
    double getCircumference() {
        return hypotenuse + 2*side;
    }

    @Override
    double getArea() {
        return 0.25 * hypotenuse * Math.sqrt(4*Math.pow(side,2) - Math.pow(hypotenuse,2));
    }
}