package eric.week10.GeometryInterface;

import java.util.ArrayList;
import java.util.List;

public class InterMain {
    public static void main(String[] args) {
        List<GeoInter> geometry = new ArrayList<>();

        geometry.add(new TriaInter(20));
        geometry.add(new CircInter(100));
        geometry.add(new SquareInter(50));
        geometry.add(new RectInter(75,60));
        geometry.add(new House(10));
        geometry.add(new Star(20));

        double totalCirc = 0;
        double totalArea = 0;

        for (GeoInter geo : geometry){
            totalCirc += geo.getCircumferenceInter();
            totalArea += geo.getAreaInter();
            System.out.println(geo);
            System.out.println();
        }

        System.out.println("Total Circumference: " + totalCirc);
        System.out.println("Total Area         : " + totalArea);

    }

}
