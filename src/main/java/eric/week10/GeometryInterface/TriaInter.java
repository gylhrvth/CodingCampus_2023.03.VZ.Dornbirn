package eric.week10.GeometryInterface;

public class TriaInter implements GeoInter{
    private double length;

    public TriaInter(double length) {
        this.length = length;
    }

    @Override
    public double getCircumferenceInter() {
        return length * 3;
    }

    @Override
    public double getAreaInter() {
        return (length * length * Math.sqrt(length)) / 4;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
