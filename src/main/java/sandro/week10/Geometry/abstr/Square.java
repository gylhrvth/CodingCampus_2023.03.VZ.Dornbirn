package sandro.week10.Geometry.abstr;

public class Square extends Rectangle {

    public Square(double size){
        this(size, 0);
    }

    public Square (double size, double angle){
        super(size,size,angle);
    }

}
