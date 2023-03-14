package benjamin.week02;

import benjamin.week01.MethodenSchleifen;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ConsoleInputNumber {

    static Random rand = new Random();

    public static void main(String[] args) {

        // stringEinlesen();
        // zahlEinlesen1();
        // zahlEinlesen2();
        //rateSpiel();
        menue();

    }


    // String text = ConsoleInputText.readText("Welcher Buchstabe?");
    // int size = readNumber3("Wieviel Zeilen sollen ausgegebn werden", 1, 10);

    //benjamin.week01.MethodenSchleifen.printRhombus(text,size);

    public static void stringEinlesen() {
        String name = ConsoleInputText.readText("Wie ist lautet Name?");
        System.out.println("Hallo " + name + "!");
    }

    public static int readNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = sc.nextInt();

        return value;


    }

    public static void zahlEinlesen1() {

        int number = readNumber("Welche Nummer?");
        System.out.println("Deine Nummer ist " + number + " !");

    }

    public static int readnumber2(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                value = sc.nextInt();
                sc.nextLine();
                numberIsValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("Das ist keine Zahl!");
                sc.nextLine();
            }
        }
        return value;
    }

    public static void zahlEinlesen2() {

        int number = readnumber2("Welche Zahl?");
        System.out.println("Deine Zahl ist " + number + " !");

    }

    public static int readNumber3(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                //sc.nextLine();
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein! ");

                }
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Zahl.");
                sc.nextLine();
            }
        }
        return value;


    }

    public static int rateSpiel() {
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!");
        System.out.println("Errate die Zahl zwischen 0 und 100!");
        int randomValue = rand.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib die Zahl nun ein:");

        while (true) {
            int guess = sc.nextInt();
            if (guess == randomValue) {
                System.out.println("Du hast gewonnen!!!");
            } else if (guess < randomValue) {
                System.out.println("Die Zahl ist zu niedrig!");
            } else if (guess > randomValue) {
                System.out.println("Die Zahl ist zu hoch!");
            }
        }
    }


    public static void menue() {
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
        String line2 = readText("Möchten Sie noch etwas zeichnen? (j/n)");







    }




    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}



