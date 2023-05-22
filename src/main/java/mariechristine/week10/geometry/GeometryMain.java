package mariechristine.week10.geometry;

import mariechristine.week10.igeometry.CircleI;
import mariechristine.week10.igeometry.IGeometry;
import mariechristine.week12.geometryenhanced.CompassStar;
import mariechristine.week12.geometryenhanced.HouseOfSantaClaus;

import java.util.ArrayList;

import java.util.List;

public class GeometryMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(8);
        Rectangle r = new Rectangle(12, 7);
        Square s = new Square( 5);

        List<Geometry> geometries = new ArrayList<>();
        geometries.add(c);
        geometries.add(t);
        geometries.add(r);
        geometries.add(s);

        for (Geometry g : geometries) {
            System.out.println(g.getClass().getSimpleName() + " Area: " + g.getArea());
            System.out.println(g.getClass().getSimpleName() + " Circumference " + g.getCircumference());
        }
        System.out.println("\n***************************************************");



        List<IGeometry> geoI = new ArrayList<>();
        geoI.add(new CircleI(5));

        for (IGeometry ig : geoI) {
            System.out.println(ig.getClass().getSimpleName() + " Area: " + ig.getArea());
            System.out.println(ig.getClass().getSimpleName() + " Circumference " + ig.getCircumference());
        }

        System.out.println("\n************** GEOMETRY ENHANCED 'SANTA' *************************************");

        HouseOfSantaClaus hos = new HouseOfSantaClaus(5);
        System.out.println("Area of Santa's House: " + hos.getArea());
        System.out.println("Circumference of Santa's House: " + hos.getCircumference());

        System.out.println("\n************** GEOMETRY ENHANCED 'COMPASS' *************************************");
        CompassStar cs = new CompassStar(7);
        System.out.println("Area of Compass: " + cs.getArea());
        System.out.println("Circumference of Compass: " + cs.getCircumference());
    }
}
