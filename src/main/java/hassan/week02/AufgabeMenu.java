package hassan.week02;
import hassan.week01.Methoden;

import java.util.Scanner;
public class AufgabeMenu {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            System.out.println("Willkommen bei meiner Aufgabe");
            System.out.println();
            System.out.println("1 - Quadrat");
            System.out.println("2 - Dreieck Oben Links");
            System.out.println("3 - Dreieck Unten Links");
            System.out.println("4 - Dreieck Unten Mitte");
            System.out.println("5 - Dreieck Oben Mitte");
            System.out.println("6 - Pyramide");
            System.out.println();
            int choose = readSquare("Was darf ich drucken?", 1, 6);

            String name = readSquareSymbol("Welcher Symbol magst du benutzen?");
            int size = readSquare("Wie Gross soll das Form sein 1 - 10?", 1, 10);

            if (choose == 1) {
                Methoden.printSquare(name, size);
            } else if (choose == 2) {
                Methoden.printTriangle(name, size);
            } else if (choose == 3) {
                Methoden.PrintTriangle2(name, size);
            } else if (choose == 4) {
                Methoden.PrintTriangle3(name, size);
            } else if (choose == 5) {
                Methoden.PrintTriangle4(name, size);
            } else if (choose == 6) {
                Methoden.printtriangle5(name, size);
            } else {
                System.out.println("Nicht gewonnen!");

            }
            repeat = readJaNein("Noch mal was ausdrucken? Ja/Nein");
        }
        System.out.println("Ciao!!");
    }




    public static int readSquare (String message, int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid){
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);

                if ((value >= minValue) && (value <= maxValue)){
                    numberIsValid = true;
                }else {
                    System.out.println("Die Zahl muss zwischen " + minValue + "und " + maxValue +"sein");
                }
            }catch (NumberFormatException nfe ){
                System.out.println("Das ist keine Option mein Lieber!");
            }
        }
        return value;

    }
    public static String readSquareSymbol(String symbol){
        Scanner sc = new Scanner(System.in);
        System.out.println(symbol);
        return sc.nextLine();
    }
    public static boolean readJaNein(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }




}
