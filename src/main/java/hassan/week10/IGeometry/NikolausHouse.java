package hassan.week10.IGeometry;

public class NikolausHouse implements IGeometry{
    private double side;

    public NikolausHouse(double height) {
        this.side = height;
    }

    @Override
    public double getCircumference() {
        return side * 5;
    }

    @Override
    public double getArea() {
        return side * side * (1 + Math.sqrt(3.0) / 4.0);
    }


}
