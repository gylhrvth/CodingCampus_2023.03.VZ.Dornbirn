package mariechristine.week2;

import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {

        System.out.println("Willkommen bei meinen Aufgaben! Was möchten Sie zeichnen?\n1) Christbaum\n2) Quader\n3) Rhombus\nBitte wählen Sie nun!");
        choiceTask(1, 3);
    }

    public static int choiceTask(int min, int max) {
        Scanner sc = new Scanner(System.in);

        int value = 2;
        while (value < max && value > min) {
            System.out.println("Wie groß soll der Quader sein?");

            try {
                value = sc.nextInt();
                sc.nextLine();
                {
                    if (value > max) {
                        System.out.println("Wie groß soll der Rhombus sein?");}

                    else if (value < min) {
                        System.out.println("Wie groß soll der Christbaum sein?");}
                }
            }
            catch (NumberFormatException nfe) {
                System.out.println("Ihre Eingabe ist ungültig. Wählen Sie 1, 2 oder 3.");}
        }
        return value;
    }
}