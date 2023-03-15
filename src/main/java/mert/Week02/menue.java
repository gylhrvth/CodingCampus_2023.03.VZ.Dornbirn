package mert.Week02;


import benjamin.week01.MethodenSchleifen;
import gyula.week02.ConsoleInputNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menue {

    public static void main(String[] args) {
        System.out.println("Wilkommen bei meinen Aufgaben!");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        boolean repeat = true;
        while (repeat) {
            System.out.println("1. Baum");
            System.out.println("2. Quader");
            System.out.println("3. Pyramide");
            System.out.println();

            int choose = ConsoleInputNumber.readNumber_v5("Welche zeichnung möchten Sie?", 1, 3);
            String name = readauswahl("Welches Zeichen soll verwendet werden?");
            int size = ConsoleInputNumber.readNumber_v5("Wie groß soll das Symbol sein?", 1, 50);


            if (choose == 1) {
                hassan.week01.Methoden.baum(size);
            } else if (choose == 2) {
                mert.Week01.MethodenSchleifen.printemptysquare(name, size);
            } else if (choose == 3) {
                hassan.week01.Methoden.printtriangle5(name, size);
            } else {
                System.out.println("nix");
            }
            System.out.println();
            repeat = readJaoderNein("Willst du es nochmal machen? / Ja, Nein?");
        }
        System.out.println("Danke");

    }

    public static String readauswahl(String auswahl) {
        Scanner sc = new Scanner(System.in);
        System.out.println(auswahl);
        return sc.nextLine();
    }

    public static boolean readJaoderNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();
        return answer.equals("ja") || answer.equals("Ja");
    }
}



