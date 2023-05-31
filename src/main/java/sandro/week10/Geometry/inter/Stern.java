package sandro.week10.Geometry.inter;

import sandro.week10.Geometry.abstr.Geometry;

public class Stern extends Geometry implements IGeometry {
    private double size;

    public Stern(double size) {
        this.size = size;
    }

    @Override
    public double getCircumference() {
        return 8 * size;
    }

    @Override
    public double getArea() {
        Triagle t = new Triagle(size);
        Square s = new Square(size);
        return (t.getArea() * 4) + s.getArea();
    }
}
