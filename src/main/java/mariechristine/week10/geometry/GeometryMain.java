package mariechristine.week10.geometry;

import mariechristine.week10.igeometry.IGeometry;

import java.util.ArrayList;
import java.util.List;

public class GeometryMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(8, 10);
        Rectangle r = new Rectangle(12, 7);
        Square s = new Square(5, 5);

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Circumference " + c.getCircumference());
        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Circumference " + t.getCircumference());
        System.out.println("Rectangle Circumference: " + r.getCircumference());
        System.out.println("Rectangle Area " + r.getArea());
        System.out.println("Rectangle Circumference " + r.getCircumference());
        System.out.println("Square Area: " + s.getArea());
        System.out.println("Square Circumference " + s.getCircumference());

        List<Geometry> geometries = new ArrayList<>();
        geometries.add(c);
        geometries.add(t);
        geometries.add(r);
        geometries.add(s);

        System.out.println("***************************************************");

    }
}
