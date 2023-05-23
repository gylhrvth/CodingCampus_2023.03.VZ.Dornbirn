package sandro.week10.Geometry.inter;

import sandro.week10.Geometry.abstr.Geometry;

public class Haus extends Geometry implements IGeometry{
    private double size;

    public Haus(double size){
        this.size = size;
    }

    @Override
    public double getCircumference() {
        return 5 * size;
    }

    @Override
    public double getArea() {
        Triagle t = new Triagle(size);
        Square s = new Square(size);
        return t.getArea() + s.getArea();
    }
}
