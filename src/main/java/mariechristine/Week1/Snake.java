package mariechristine.Week1;

import java.awt.Point;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        //Objekte und Spielfeld erstellen

        Point spielerPosition = new Point(10, 9);
        Point schlangePosition = new Point(30, 2);
        Point goldposition = new Point(6, 6);
        Point tuerPosition = new Point(2, 5);
        boolean weiter = true;
        boolean goldEinsammeln = false;

        //Spielfeld 10x40

        while (weiter) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    Point p = new Point(x, y);
                    if (p.equals(spielerPosition))
                        System.out.print("P");
                    else if (p.equals(schlangePosition))
                        System.out.print("S");
                    else if (p.equals(goldposition))
                        System.out.print("G");
                    else if (p.equals(tuerPosition))
                        System.out.print("T");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }
            if (schlangePosition.equals(spielerPosition)){
                weiter = false;
                System.out.println("ZZZ... erwischt!");
            }
            if (spielerPosition.equals(goldposition)) {
                goldEinsammeln = true;
                goldposition = new Point(-1, -1);
            }
            if (spielerPosition.equals(tuerPosition) && goldEinsammeln){
                weiter = false;
                System.out.println("Gewonnen");
            }
            bewegeSpieler(spielerPosition);
            bewegeSchlange(schlangePosition, spielerPosition);
        }
    }

    private static void bewegeSchlange(Point schlangePosition, Point spielerPosition) {
        if (spielerPosition.x < schlangePosition.x)
            schlangePosition.x--;
        else if (spielerPosition.x > schlangePosition.x)
            schlangePosition.x++;
        if (spielerPosition.y < schlangePosition.y)
            schlangePosition.y--;
        else if (spielerPosition.y > schlangePosition.y)
            schlangePosition.y++;
    }


    private static void bewegeSpieler(Point spielerPosition) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        //w,a,s,d // runter und rauf bewegen
        if (input.equals("w")) {
            if (spielerPosition.y > 0)
                spielerPosition.y--;
        } else if (input.equals("s")) {
            if (spielerPosition.y < 9)
                spielerPosition.y++;
        } else if (input.equals("a")) {
            if (spielerPosition.x > 0)
                spielerPosition.x--;
        } else if (input.equals("d")) {
            if (spielerPosition.x < 39)
                spielerPosition.x++;
        }
    }
}

