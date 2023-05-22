package eric.week10.GeometryInterface;

public class House implements GeoInter{
    private double length;

    public House(double width) {
        this.length = width;
    }

    @Override
    public double getCircumferenceInter() {
        double triaLength = length * 3;
        double squareLength = length * 4;
        return triaLength + squareLength;
    }

    @Override
    public double getAreaInter() {
        double rectangleArea = length * length;
        double triangleArea = (length * length * Math.sqrt(length)) / 4;
        return rectangleArea + triangleArea;
    }

    @Override
    public String toString() {
        return "House: \nCircumference: " + getCircumferenceInter() + "\nArea: " + getAreaInter();
    }
}
