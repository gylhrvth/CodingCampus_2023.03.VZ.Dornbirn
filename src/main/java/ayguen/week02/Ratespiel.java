package ayguen.week02;


import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Ratespiel {
    static Random randomGenerator = new Random();


    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen beim Ratespiel");
        ratenSpiel(1, 30);

    }

    public static int readUserNumber(int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);

        int value = minValue - 1;
        while (value < minValue || value > maxValue) {
            System.out.println("Errate die Zahl zwischen " + minValue + " und " + maxValue + "!");
            try {
                value = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Du musst eine Zahl eingeben");
                sc.nextLine();
            }
        }
        return value;
    }


    public static void ratenSpiel(int minValue, int maxValue) {
        int value = 0;
        int randomNumber = minValue + randomGenerator.nextInt(1 + maxValue - minValue);
        int counter = 0;


        boolean win = false;
        while (!win && counter < 3) {
            value = readUserNumber(minValue, maxValue);
            if (value < randomNumber) {
                System.out.println("Zahl ist zu klein");
            } else if (value > randomNumber) {
                System.out.println("Zahl ist zu groß");
            } else {
                System.out.println("DU HAST GEWONNEN!!!!");
                win = true;
            }
            ++counter;
        }
        if (win) {
            System.out.println("Auf Wiedersehen!");
        } else {
            System.out.println("AMK SALAGI SIKTIR GIT!");
        }
        System.out.println("Die Zahl war: " + randomNumber);
    }
}















