package sandro.week02;

import sandro.week01.Funktionen;

import java.security.KeyStore;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Willkommen bei meinen Aufgaben");
        boolean repeat = true;
        while (repeat) {
            System.out.println("Was möchtest du zeichnen?");
            int auswahl = readZahl("1) Christbaum\n2) Quader\n3) Rhombus\n", 1, 3);
            int size = readZahl("Wie groß möchtest du Zeichnen", 1, 30);
            String line = readText("Mit Welchem Zeichen möchtest du zeichnen?");

            // wie kann ich bei der frage, wie groß zeichnen, den objektname dazu geben
            //beispiel, wie groß soll der Quader sein?

            if (auswahl == 1) {
                Funktionen.printChristmastree(size);
            } else if (auswahl == 2) {
                Funktionen.printEmptySpquare1(line, size);
            } else if (auswahl == 3) {
                Funktionen.printRhombus2(line, size);
            } else {

            }
            repeat = readJaNein("Wollen sie noch etwas anders zeichnen? Ja/Nein");

        }
    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static int readZahl(String message, int minValue, int maxValue) {
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
                    System.out.println("Wähle eine Zahl zwischen " + minValue + " und " + maxValue + " um fort zu fahren");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Deine Zahl ist ungültig!!!");
            }
        }
        return value;
    }

    public static boolean readJaNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}
