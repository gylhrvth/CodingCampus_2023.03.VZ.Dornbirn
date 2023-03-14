package sandro.week02;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Willkommen bei meinen Aufgaben");
        System.out.println("Was möchtest du zeichnen?");
        int auswahl = auswahlObjekt("1) Christbaum\n2) Quader\n3) Rhombus",1,3);




    }
    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    public static int auswahlObjekt(String message, int minValue, int maxValue) {
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
}
