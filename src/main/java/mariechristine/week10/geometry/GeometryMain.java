package mariechristine.week10.geometry;

import mariechristine.week10.igeometry.CircleI;
import mariechristine.week10.igeometry.IGeometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeometryMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(8, 10);
        Rectangle r = new Rectangle(12, 7);
        Square s = new Square(5, 5);

        List<Geometry> geometries = new ArrayList<>();
        geometries.add(c);
        geometries.add(t);
        geometries.add(r);
        geometries.add(s);

        for (Geometry g : geometries) {
            System.out.println(g.getClass().getSimpleName() + " Area: " + g.getArea());
            System.out.println(g.getClass().getSimpleName() + " Circumference " + g.getCircumference());
        }
        System.out.println("***************************************************");



        List<IGeometry> geoI = new ArrayList<>();
        geoI.add(new CircleI(5));

        for (IGeometry ig : geoI) {
            System.out.println(ig.getClass().getSimpleName() + " Area: " + ig.getArea());
            System.out.println(ig.getClass().getSimpleName() + " Circumference " + ig.getCircumference());
        }
    }
}
