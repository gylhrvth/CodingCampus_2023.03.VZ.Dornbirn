package eric.week10.GeometryInterface;

public class RectTria implements GeoInter {
    private double width;
    private double height;

    public RectTria(double length, double height) {
        this.width = length;
        this.height = height;
    }

    @Override
    public double getCircumferenceInter() {
        return width * 2 + height * 2;
    }

    @Override
    public double getAreaInter() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
