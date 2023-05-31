package hassan.week10.GeometryExc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Geometry> shapes = new ArrayList<>();

        shapes.add(new Circle(2));
        shapes.add(new Square(3));
        shapes.add(new Rectangle(2,4));
        shapes.add(new Triangle(3));


        double totalCircumference = 0;
        double totalArea = 0;

        for (Geometry shape : shapes) {
            totalCircumference += shape.getCircumference();
            totalArea += shape.getArea();
        }

        System.out.println("Total Circumference: " + totalCircumference);
        System.out.println("Total Area         : " + totalArea);
    }
}
