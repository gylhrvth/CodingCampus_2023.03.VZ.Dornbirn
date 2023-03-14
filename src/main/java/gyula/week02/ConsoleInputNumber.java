package gyula.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputNumber {
    public static void main(String[] args) {
        String text = ConsoleInputText.readText("Mit welchem Buchstaben?");
        int size = readNumber_v5("Wie viel Mal soll ich ausdrucken?", 1, 10);

        hassan.week01.Methoden.printTriangle(text, size);
    }

    public static int readNumber_v1(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = sc.nextInt();

        return value;
    }

    public static int readNumber_v2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = 0;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist kein gültiger Zahl.");
        }
        return value;
    }

    public static int readNumber_v3(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean nubmerIsValid = false;
        while (!nubmerIsValid) {
            System.out.println(message);
            try {
                value = sc.nextInt();
                sc.nextLine();
                nubmerIsValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("Es ist kein gültiger Zahl.");
                sc.nextLine();
            }
        }
        return value;
    }


    public static int readNumber_v4(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean nubmerIsValid = false;
        while (!nubmerIsValid) {
            System.out.println(message);
            try {
                value = sc.nextInt();
                sc.nextLine();
                if ((value >= minValue) && (value <= maxValue)) {
                    nubmerIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist kein gültiger Zahl.");
                sc.nextLine();
            }
        }
        return value;
    }


    public static int readNumber_v5(String message, int minValue, int maxValue) {
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
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es ist kein gültiger Zahl.");
            }
        }
        return value;
    }


}
