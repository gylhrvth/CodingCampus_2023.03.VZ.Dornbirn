package eric.week10.GeometryInterface;

public class House implements GeoInter{
    private double length;

    public House(double width) {
        this.length = width;
    }

    @Override
    public double getCircumferenceInter() {
        double sideLength = (length * length * Math.sqrt(length)) / 4;
        return 2 * (length + sideLength);
    }

    @Override
    public double getAreaInter() {
        double rectangleArea = length * length;
        double triangleArea = 0.5 * length * length / 2;
        return rectangleArea + triangleArea;
    }

    @Override
    public String toString() {
        return "House";
    }
}
