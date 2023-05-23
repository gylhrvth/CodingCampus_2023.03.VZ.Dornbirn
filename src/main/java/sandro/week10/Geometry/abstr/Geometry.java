package sandro.week10.Geometry.abstr;

public abstract class Geometry {

    protected double angle;

    protected Geometry(double angle){
        this.angle = angle;
    }

    protected Geometry() {
    }

    public abstract double getCircumference();

    public abstract double getArea();


}
