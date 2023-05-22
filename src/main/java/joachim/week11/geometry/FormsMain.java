package joachim.week11.geometry;

public class FormsMain {
    public static void main(String[] args) {
        int connectionLength = 15;

        Triangle triangle = new Triangle(connectionLength, 25);
        Square square = new Square(connectionLength);


        System.out.println("The Nicolaushouse has a roundabout length of: " + nicolausCirc(triangle,square) + ", also the area has the size of " + nicolausArea(triangle,square) + "\n");

        System.out.println("The star has a roundabout length of: " + starCirc(triangle,4) + ", also the area has the size of " + starArea(triangle,square));
    }
    public static double nicolausCirc(Geometry triangle,Geometry sqaure){
       return triangle.getCircumference()+sqaure.getCircumference() - (sqaure.getLength+triangle.getHypotenuse);
    }
    public static double nicolausArea(Geometry triangle, Geometry square){
        return triangle.getArea()+square.getArea();
    }
    public static double starCirc(Geometry triangle,int amount){
        return triangle.getCircumference()*amount -amount*triangle.getHypotenuse;
    }
    public static double starArea(Geometry triangle, Geometry square){
        return triangle.getArea()*4 + square.getArea();
    }
}
