package mert.week11.Geo;

import mert.week11.Geo.Geometry;

public class Triangle implements Geometry {
    public double length;

    public Triangle(double length) {
        this.length = length;

    }

    @Override
    public double getCircumference() {
        return length + length + length;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * length * length;
    }
}
