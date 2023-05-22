package mariechristine.week12.geometryenhanced;

import mariechristine.week10.igeometry.IGeometry;

public class HouseOfSantaClaus implements IGeometry {

    public double length;
    public double height;

    public HouseOfSantaClaus(double length) {
        this.length = length;
        this.height = Math.sqrt(3.0/4.0) * length;
    }

    @Override
    public double getCircumference() {
        double circumferenceTri = length * 2;
        double circumferenceSqu = length * 3;
        return circumferenceTri + circumferenceSqu;
    }

    @Override
    public double getArea() {
        double areaTri = 0.5 * length * height;
        double areaSqu = length * length;
        return areaTri + areaSqu;
    }


}
