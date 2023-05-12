package mert.week10.geometry;

public class Triangle extends Geometry {
    public double length;


    public Triangle(double length) {
        this.length = length;


    }

    @Override
    public double getGetCircumference() {
        return length + length + length;
    }

    @Override
    public double getGetArea() {
        return (Math.sqrt(3) / 4) * length * length;
    }
}

