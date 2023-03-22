package ayguen.week02;

import ayguen.week01.MethodenSchleifen;

import java.util.Scanner;

public class MenuGyula {
    public static void main(String[] args) {
        boolean finish = false;
        while (!finish) {
            System.out.println("""
Menü:
1 - Dreieck 1
2 - Dreieck 2
3 - Dreieck langweilig
4 - Fenster
======================
0 - ENDE""");
            int auswahl = getNumber("Auswahl", 0, 4);

            if (auswahl == 0){
                System.out.println("Auf Wiedersehen sokuk");
                finish = true;
            } else {
                System.out.print("Symbol: ");
                Scanner sc = new Scanner(System.in);
                String text = sc.nextLine();
                int size = getNumber("Size", 1, 160);

                if (auswahl == 1) {
                    MethodenSchleifen.printTriangleBottomLeft(text, size);
                } else if (auswahl == 2) {
                    MethodenSchleifen.printTriangleTopLeft(text, size);
                } else if (auswahl == 3) {
                    MethodenSchleifen.printTriangleTopRight(text, size);
                } else if (auswahl == 4) {
                    mert.Week01.MethodenSchleifen.printemptysquare(text, size);
                } else {
                    System.out.println("Es geht nicht");
                }
            }
        }
    }

    public static int getNumber(String question, int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);
        int value = minValue - 1;

        while (value < minValue || value > maxValue) {
            System.out.print(question + ": ");
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if (value < minValue) {
                    System.out.println("Es muss größer gleich als " + minValue + " sein");
                } else if (value > maxValue){
                    System.out.println("Es muss kleiner gleich als " + maxValue + " sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Kein Zahl");
            }
        }
        return value;
    }

}
