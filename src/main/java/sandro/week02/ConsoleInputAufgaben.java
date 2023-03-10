package sandro.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.random.RandomGenerator;

public class ConsoleInputAufgaben {
    static Random rand = new Random();

    public static void main(String[] args) {
        String name = readText("Wie ist dein Name?");
        System.out.println("Willkommen " + name + " beim super coolen Zahlen Ratespiel ");
        System.out.println("Du hast nur 5 versuche!");
        int randomValue = rand.nextInt(101);
      //  System.out.println(randomValue);

        int i = 0;
        int nummer = -1;
        while ((i < 5) && (nummer != randomValue)){
            nummer = spielerZahl("Was ist deine Nummer", 0, 100);
            if (nummer < randomValue) {
                System.out.println("deine Zahl ist zu niedrig");
            } else if (nummer > randomValue) {
                System.out.println("deine Zahl ist zu hoch");
            }
            ++i;
        }
        if (nummer == randomValue){
            System.out.println("du hast gewonnen");
        } else {
            System.out.println("Looooser!\nDie richtige Zahl war: " + randomValue);
        }
        System.out.println("Danke fürs Spielen");
    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static int number(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = sc.nextInt();

        return value;
    }

    public static int number2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = 0;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Es ist keine gültige Zahl !!!");
        }

        return value;
    }

    public static int number3(String message) {
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
                System.out.println("Deine Zahl ist ungültig !!!");
                sc.nextLine();
            }
        }
        return value;
    }

    public static int spielerZahl(String message, int minValue, int maxValue) {
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
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein ");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Deine Zahl ist ungültig!!!");
            }
        }
        return value;
    }

    public static int randomZahl() {
        int randomValue = rand.nextInt(100) + 1;
        //System.out.println(randomValue);
        return randomValue;
    }


}
