package sandro.week10.Geometry.inter;

public class Triagle implements IGeometry {
    private double length;


    public Triagle(double length) {

        this.length = length;

    }

    @Override
    public double getCircumference() {
        return 3 * length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length / 4.0;
    }


}
