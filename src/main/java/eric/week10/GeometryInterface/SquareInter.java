package eric.week10.GeometryInterface;

public class SquareInter extends RectInter {
    private double length;

    public SquareInter(double length) {
        super(length, length);
        this.length = length;
    }

    @Override
    public double getCircumferenceInter() {
        return length * 4;
    }

    @Override
    public double getAreaInter() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square: \nCircumference: " + getCircumferenceInter() + "\nArea: " + getAreaInter();
    }
}
