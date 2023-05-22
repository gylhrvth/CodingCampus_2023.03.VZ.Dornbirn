package eric.week10.GeometryInterface;

public class Star implements GeoInter {
    private double length;

    public Star(double length) {
        this.length = length;
    }

    @Override
    public double getCircumferenceInter() {
        return 5 * length;
    }

    @Override
    public double getAreaInter() {
        double triangleArea = Math.sqrt(3) * length * length / 4;
        double rectangleArea = length * length;
        return 4 * triangleArea + rectangleArea;
    }

    @Override
    public String toString() {
        return "Star: \nCircumference: " + getCircumferenceInter() + "\nArea: " + getAreaInter();
    }
}
