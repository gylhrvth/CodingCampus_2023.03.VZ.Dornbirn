package benjamin.week02;

import benjamin.week01.MethodenSchleifen;

import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {
       menue();
    }

    public static void menue() {
        boolean repeat = true; // Abfrage am Schluss
        while (repeat) {
            System.out.println("Willkommen bei meinen Aufgaben!");
            System.out.println("Was möchten Sie zeichnen?");
            System.out.println("1) Christbaum");
            System.out.println("2) Square");
            System.out.println("3) Rhombus");

            int number = readNumber3("Bitte wählen Sie nun?", 1, 3);
            String line = readText("Welches Zeichen soll verwendet werden?");
            int size = readNumber3("Wie groß soll es sein?", 1, 20);
            if (number == 1) {
                MethodenSchleifen.printChristmasTree(10);
            } else if (number == 2) {
                MethodenSchleifen.printEmptySquare(line, size);
            } else if (number == 3) {
                MethodenSchleifen.printRhombus(line, size);
            }

            repeat = readJaNein("Möchten Sie noch etwas zeichnen? (j/n)");
        }

        System.out.println("Auf Wiedersehen!");


    }
    public static int readNumber3 (String message,int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein! ");

                }
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Zahl.");
            }
        }
        return value;
    }
    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static boolean readJaNein(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}


