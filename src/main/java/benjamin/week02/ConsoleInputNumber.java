package benjamin.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ConsoleInputNumber {

    static Random rand = new Random();

    public static void main(String[] args) {

        // stringEinlesen();
        // zahlEinlesen1();
        // zahlEinlesen2();
        rateSpiel();
    }

    public static void rateSpiel() {
        for (int i = 0; i < 100; i++) {
            int randomValue = rand.nextInt();
            System.out.printf("%2d - %3d\n", i, randomValue);

        }
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


}
