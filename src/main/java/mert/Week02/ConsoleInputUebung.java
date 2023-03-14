package mert.Week02;


import gyula.week02.ConsoleInputNumber;
import gyula.week02.ConsoleInputText;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ConsoleInputUebung {
    static Random rand = new Random();

    public static void main(String[] args) {

//        int size = readNumber3("Gib eine Zahl ein");

        ratespiel("Errate die Zahl zwischen 0 und 100!", 0, 100);

//        System.out.println("String einlesen");
//        System.out.println();

//        String text = readText("Wie geht es dir?");
//        System.out.println("Hallo freut mich das es dir " + text + " geht");

//    }

//    public static String readText(String message) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(message);
//        return sc.nextLine();

//    }


    }

//    public static int readNumber(String message) {
//        System.out.println("Zahl einlesen");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(message);
//        int zahl = sc.nextInt();
//        System.out.println("Die eingegebene Zahl ist: " + zahl);
//
//        return zahl;
//    }
//
//    public static int readNumber2(String message) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(message);
//        int zahl = 0;
//        try {
//            zahl = sc.nextInt();
//        } catch (InputMismatchException ime) {
//            System.out.println("Dies ist keine gültige Zahlt");
//        }
//        return zahl;
//    }
//
//    public static int readNumber3(String message) {
//        Scanner sc = new Scanner(System.in);
//        int zahl = 0;
//        boolean numberIsValid = false;
//        while (!numberIsValid) {
//            System.out.println(message);
//            try {
//                zahl = sc.nextInt();
//                sc.nextLine();
//                numberIsValid = true;
//            } catch (InputMismatchException ime) {
//                System.out.println("Dies ist keine gültige Zahl");
//                sc.nextLine();
//            }
//        }
//        return zahl;
//    }

    public static void ratespiel(String message, int minValue, int maxValue) {
        System.out.println("Wilkommen beim super coolen Zahlen Ratespiel");
        Scanner sc = new Scanner(System.in);
        int zufallzahl = rand.nextInt(101);
        int geratenzahl = -1;


        while (geratenzahl != zufallzahl) {
            geratenzahl = ConsoleInputNumber.readNumber_v5("Gib eine Zahl ein!", 0, 100);


            if (geratenzahl < zufallzahl) {
                System.out.println("klein geraten");
            } else if (geratenzahl > zufallzahl) {
                System.out.println("hoch geraten");


            } else {
                System.out.println("Richtig!!");

            }

        }
    }

}

