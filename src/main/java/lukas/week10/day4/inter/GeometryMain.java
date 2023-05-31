package lukas.week10.day4.inter;

import java.util.List;
import java.util.Vector;

public class GeometryMain {
    public static void main(String[] args) {
        List<Geometry> geometryList = new Vector<>();
        geometryList.add(new Triangle(100));
        geometryList.add(new Rectangle(10, 20));
        geometryList.add(new Circle(10));
        geometryList.add(new Square(30));

        System.out.println("Circumference of all: "+calculateCircumference(geometryList));
        System.out.println("Area of all: "+calculateArea(geometryList));
    }

    private static double calculateCircumference(List<Geometry> geometries) {
        double sum = 0;
        for(Geometry geometry : geometries) {
            sum += geometry.getCircumference();
        }
        return sum;
    }

    private static double calculateArea(List<Geometry> geometries) {
        double sum = 0;
        for(Geometry geometry : geometries) {
            sum += geometry.getArea();
        }
        return sum;
    }
}
