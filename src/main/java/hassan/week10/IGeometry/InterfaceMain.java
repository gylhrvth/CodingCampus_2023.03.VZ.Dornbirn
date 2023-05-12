package hassan.week10.IGeometry;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {
    public static void main(String[] args) {
        List<IGeometry> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Square(3));
        shapes.add(new Rectangle(2,4));
        shapes.add(new Triangle(3));
        shapes.add(new NikolausHouse(5));
        shapes.add(new Star(3));


        double totalCircumference = 0;
        double totalArea = 0;

        for (IGeometry shape : shapes) {
            totalCircumference += shape.getCircumference();
            totalArea += shape.getArea();
        }

        System.out.println("Total Circumference: " + totalCircumference);
        System.out.println("Total Area         : " + totalArea);
    }
}
