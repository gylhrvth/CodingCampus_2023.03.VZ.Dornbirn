package mariechristine.week2;


import mariechristine.Week1.MethodenSchleifen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console_Input {
    public static void main(String[] args) {
        String text = erstFrage("Welcher Satz?");
        System.out.println("Ok, du willst " + text + " drucken.");
        int size = zweiteFrage("Wie oft möchtest du ihn ausgeben?", 1, 20);


    }
    public static String erstFrage(String text){
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();
    }


    public static int zweiteFrage(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean nubmerIsValid = false;
        while (!nubmerIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
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

