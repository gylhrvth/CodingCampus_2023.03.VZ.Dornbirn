package mert.Week02;

import java.util.Scanner;

public class ConsoleInputUebung {
    public static void main(String[] args) {
        System.out.println("String einlesen");
        System.out.println();

        String text = readText("Wie geht es dir?");
        System.out.println("Hallo freut mich das es dir " + text + " geht");

    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();

    }

//    public static int readNumber(String message) {

//        System.out.println("Zahl einlesen");

//        int size = readNumber();

//        Scanner sc = new Scanner(System.in);
//        int value = sc.nextInt();
//        return value;
    }

