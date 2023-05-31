package lukas.week10.day4.inter;

public class Triangle implements Geometry {
    private double length;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return length * 3;
    }

    @Override
    public double getArea() {
        return (length * length * Math.sqrt(3))/4;
    }
}
