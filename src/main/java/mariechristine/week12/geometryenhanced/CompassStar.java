package mariechristine.week12.geometryenhanced;

import mariechristine.week10.igeometry.IGeometry;

public class CompassStar implements IGeometry {
    public double length;
    public double height;

    public CompassStar(double length) {
        this.length = length;
        this.height = Math.sqrt(3.0/4.0) * length;
    }

    @Override
    public double getCircumference() {
        return length * 8;
    }

    @Override
    public double getArea() {
        double areaSqu = length * length;
        double areaTri = 4 * 0.5 * length * height;
        return areaSqu * areaTri;

    }
}
