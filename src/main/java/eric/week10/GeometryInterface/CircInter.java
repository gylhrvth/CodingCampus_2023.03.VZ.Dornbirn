package eric.week10.GeometryInterface;

public class CircInter implements GeoInter {
    private double radius;

    public CircInter(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumferenceInter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double getAreaInter() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: \nCircumference: " + getCircumferenceInter() + "\nArea: " + getAreaInter();
    }
}
