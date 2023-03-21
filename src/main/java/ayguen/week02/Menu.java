package ayguen.week02;

import ayguen.week01.MethodenSchleifen;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            System.out.println("Wilkommen bei meinem Aufgaben");
            System.out.println();
            System.out.println("1 - Triangle Bottom Left");
            System.out.println("2 - Triangle Top Left");
            System.out.println("3 - Triangle Top Right");
            System.out.println("======================");
            System.out.println("0 - EXIT");
            int auswahl = readsquare("Was möchten Sie zeichnen?", 0, 3);
            if (auswahl != 0) {
                String name = readSquareSymbol("Welcher symbol willst du benutzen?");
                int size = readsquare("Wie gross soll es sein ", 1, 10);

                if (auswahl == 1) {
                    MethodenSchleifen.printTriangleBottomLeft(name, size);
                } else if (auswahl == 2) {
                    MethodenSchleifen.printTriangleTopLeft(name, size);
                } else if (auswahl == 3) {
                    MethodenSchleifen.printTriangleTopRight(name, size);
                } else {
                    System.out.println("Geht nicht!");
                }
            } else {
                repeat = false;
            }
//            System.out.println();
//            repeat = readJaNein("Willst du noch was ausdrucken || ja / nein");
        }
    }

    public static int readsquare(String Frage, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(Frage);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);

                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein!");
                }
            } catch (NumberFormatException nme) {
                System.out.println("Das geht nicht!");
            }
        }
        return value;
    }

    public static String readSquareSymbol(String symbol) {
        Scanner sc = new Scanner(System.in);
        System.out.println(symbol);
        return sc.nextLine();
    }

    public static boolean readJaNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j");
    }
}
