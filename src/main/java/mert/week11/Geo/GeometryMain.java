package mert.week11.Geo;

import java.util.Vector;

public class GeometryMain {
    public static void main(String[] args) {
        Vector<Geometry> geometryList = new Vector<>();
        geometryList.add(new Rectangle(5,10));
        geometryList.add(new Cirlce(5));
        geometryList.add(new Triangle(5));

        for (Geometry g: geometryList) {
            System.out.println("Circumference of "  + g.getClass().getSimpleName() + " " + g.getCircumference());
        }
        System.out.println();
        for (Geometry g:geometryList) {
            System.out.println("Area of " + g.getClass().getSimpleName() + " " + g.getArea());
        }
    }
}
