package ayguen.week10.Geometry;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Geometry> rect = new Vector<>();
        rect.add(new Rectangle(9,4));
        Vector<Geometry> trian = new Vector<>();
        trian.add(new Triangle(10));
        Vector<Geometry> circ = new Vector<>();
        circ.add(new Circle(5));
        Vector<Geometry> squa = new Vector<>();
        squa.add(new Square(10));


        for (Geometry g : rect) {
            System.out.println(g.getClass().getSimpleName()+ " hat " + g.getArea() + " Fläche und " + g.getCircumference() + " umfang");
        }
        for (Geometry g : trian){
            System.out.println(g.getClass().getSimpleName() + " hat " + g.getArea() + " Fläche und " + g.getCircumference() + " umfang");
        }
        for (Geometry g : circ){
            System.out.println(g.getClass().getSimpleName() + " hat " + g.getArea() + " Fläche und " + g.getCircumference() + " umfang");
        }
        for (Geometry g : squa){
            System.out.println(g.getClass().getSimpleName() + " hat " + g.getArea() + " Fläche und " + g.getCircumference() + "umfang");
        }
    }
}
