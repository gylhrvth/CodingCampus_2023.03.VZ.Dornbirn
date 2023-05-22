package joachim.week11.geometryInterface;

import java.util.ArrayList;


public class GeometryInterfaceMain {
    public static void main(String[] args) {
        ArrayList<GeometryInterface> form = new ArrayList<>();

        Rectangle rectangle = new Rectangle(15, 25);
        Triangle triangle = new Triangle(15, 25);
        Square square = new Square(15);
        Cirlce cirlce = new Cirlce(15);

        System.out.println("Rectangle");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());
        System.out.println("\nTriangle");
        System.out.println(triangle.getArea());
        System.out.println(triangle.getCircumference());
        System.out.println("\nSquare");
        System.out.println(square.getArea());
        System.out.println(square.getCircumference());
        System.out.println("\nCircle");
        System.out.println(cirlce.getArea());
        System.out.println(cirlce.getCircumference());

        form.add(rectangle);
        form.add(triangle);
        form.add(square);
        form.add(cirlce);
        System.out.println("\nCalc sum");
        System.out.println(calcAllArea(form));
        System.out.println(calcAllCirc(form));
    }

    public static double calcAllCirc(ArrayList<GeometryInterface> list) {
        double all = 0;
        for (GeometryInterface geometry : list) {
            all += geometry.getCircumference();
        }
        return all;
    }
    public static double calcAllArea(ArrayList<GeometryInterface> list){
        double all = 0;
        for (GeometryInterface geometry : list){
            all += geometry.getArea();
        }
        return all;
    }
}
