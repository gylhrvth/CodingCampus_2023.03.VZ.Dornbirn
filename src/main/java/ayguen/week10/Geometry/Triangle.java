package ayguen.week10.Geometry;

public class Triangle extends Geometry{

    public double lenght;

    public Triangle(double lenght){
        super();
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / (4) * lenght * lenght);
    }

    @Override
    public double getCircumference() {
        return lenght * 3 ;
    }
}
