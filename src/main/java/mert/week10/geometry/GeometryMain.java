package mert.week10.geometry;

import java.util.Vector;

public class GeometryMain {
    public static void main(String[] args) {
        Vector<Geometry> geometryVector = new Vector<>();
        geometryVector.add(new Rectangle(100, 100));
        geometryVector.add(new Triangle(100));
        geometryVector.add(new Circle(100));
        geometryVector.add(new Square(100));

        for (Geometry geometry : geometryVector) {
            System.out.println("Circumference of " + geometry.getClass().getSimpleName() + "  " + geometry.getGetCircumference());

        }
        System.out.println();
        for (Geometry geometry : geometryVector) {
            System.out.println("Area of " + geometry.getClass().getSimpleName() + "  " + geometry.getGetArea());
        }
    }
}
