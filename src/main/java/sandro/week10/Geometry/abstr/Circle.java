package sandro.week10.Geometry.abstr;

public class Circle extends Geometry {

    private double radius;

    public Circle(double radius){
        super(0);
        this.radius = radius;
    }
    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }



}
