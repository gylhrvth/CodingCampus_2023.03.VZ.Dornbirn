package eric.week10.GeometryAbstract;

public abstract class Geometry {
    private double circumference;
    private double area;

    public Geometry() {
        this.circumference = circumference;
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circumference: " + this.circumference + "\n Area: " + this.area;
    }
}
