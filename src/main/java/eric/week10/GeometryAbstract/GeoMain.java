package eric.week10.GeometryAbstract;

import java.util.ArrayList;
import java.util.List;

public class GeoMain {
    public static void main(String[] args) {
        List<Geometry> geometry = new ArrayList<>();

        geometry.add(new Triangle(10));
        geometry.add(new Circle(13));
        geometry.add(new Rectangle(15,18));
        geometry.add(new Square(11));

        double totalCirc = 0;
        double totalArea = 0;

        for (Geometry shape : geometry){
            totalCirc += shape.getCircumference();
            totalArea += shape.getArea();
        }

        System.out.println("Total Circumference: " + totalCirc);
        System.out.println("Total Area         : " + totalArea);
    }
}
