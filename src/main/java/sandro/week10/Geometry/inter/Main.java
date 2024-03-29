package sandro.week10.Geometry.inter;

import sandro.week10.Geometry.abstr.Circle;
import sandro.week10.Geometry.abstr.Geometry;
import sandro.week10.Geometry.abstr.Rectangle;
import sandro.week10.Geometry.abstr.Square;
import sandro.week10.Geometry.abstr.Triagle;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Geometry> geometryList = new Vector<>();


        geometryList.add(new Circle(20));
        geometryList.add(new Triagle(30, 90));
        geometryList.add(new Rectangle(25, 40));
        geometryList.add(new Square(30));
        geometryList.add(new Haus(10));
        geometryList.add(new Stern(10));


        int sumOfAllAreas = 0;
        int sumOfAllCircumferences = 0;

        for (Geometry g : geometryList) {
            System.out.println("Area of " + g.getClass().getSimpleName() + ": " + g.getArea());
            System.out.println("Circumference of " + g.getClass().getSimpleName() + ": " + g.getCircumference());
            sumOfAllAreas += g.getArea();
            sumOfAllCircumferences += g.getCircumference();
        }
        System.out.println();
        System.out.println("Sum of All");
        System.out.println("All Areas sum: " + sumOfAllAreas);
        System.out.println("All Circumferences sum: " + sumOfAllCircumferences);
        System.out.println();


    }
}
