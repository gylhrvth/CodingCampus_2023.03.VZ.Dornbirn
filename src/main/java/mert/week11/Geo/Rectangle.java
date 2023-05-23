package mert.week11.Geo;

import mert.week11.Geo.Geometry;

public class Rectangle implements Geometry {
    public double width;
    public double height;

    public Rectangle(double width, double height){
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
