package ayguen.week10.Geometry;

public class Circle extends Geometry {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2* radius * Math.PI;
    }
}
