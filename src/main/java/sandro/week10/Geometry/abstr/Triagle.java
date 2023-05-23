package sandro.week10.Geometry.abstr;

public class Triagle extends Geometry {
    private double length;

    public Triagle(double length) {
        this(length,0);
    }

    public Triagle(double length, double angle) {
        super(angle);
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
