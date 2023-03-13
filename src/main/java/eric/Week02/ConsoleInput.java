package eric.Week02;

import eric.Week01.Methoden;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        System.out.println("1 - Quadrat");
        System.out.println("2 - Dreieck");
        System.out.println("3 - Dreieck Links");
        System.out.println("4 - Dreieck Rechts");
        System.out.println("5 - Volles Dreieck");
        System.out.println("6 - Dreieck Oben Links");
        System.out.println("7 - Dreieck Oben Rechts");
        System.out.println("8 - X");
        System.out.println("9 - Kreis");
        System.out.println("10 - Weihnachts Baum");

        int choose = readSquare("Was soll ich Ausdrucken?", 1, 10);

        int size = readSquare("Wie Groß soll das Symbol von 1 - 20 sein", 1, 20);
        String line = readSquareSymbol("Welches Symbol möchtest du Verwenden?");

        if (choose == 1) {
            Methoden.printSquare(line, size);
        } else if (choose == 2) {
            Methoden.printTriangle(line, size);
        } else if (choose == 3){
            Methoden.printTriangleBottomLeft(line, size);
        } else if (choose == 4){
            Methoden.printTriangleBottomRight(line, size);
        } else if (choose == 5){
            Methoden.printFullTriangle(line, size);
        }  else if (choose == 6){
            Methoden.printTriangleTopLeft(line, size);
        } else if (choose == 7){
            Methoden.printTriangleTopRight(line, size);
        } else if (choose == 8){
            Methoden.printX(line, size);
        } else if (choose == 9){
            Methoden.printCircle(line, size);
        } else if (choose == 10){
            Methoden.printChristmasTree(size);
        } else {
            System.out.println("Probier es Nochmal");
        }
    }

    public static int readSquare(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean nubmerIsValid = false;
        while (!nubmerIsValid) {

            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    nubmerIsValid = true;
                } else {
                    System.out.println("Wie oben schon genannt MUSS!! die Zahl zwischen " + minValue + " und " + maxValue + " sein.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist keine Gültige Zahl");
            }
        }
        return value;
    }


    public static String readSquareSymbol(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}