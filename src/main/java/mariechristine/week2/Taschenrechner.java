package mariechristine.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        boolean repeat = true;
        float num1, num2, num3;
        float result = 0.0f;

        while (repeat) {

            num1 = calculator("Gib deine erste Zahl ein.");
            String berechnung = operator("Gib den Operator ein!");
            num2 = calculator("Gib deine zweite Zahl ein.");
            result = 0.0f;

            if (berechnung.equals("+")) {
                result = num1 + num2;
            } else if (berechnung.equals("-")) {
                result = num1 - num2;
            } else if (berechnung.equals("*")) {
                result = num1 * num2;
            } else if (berechnung.equals("/")) {
                result = num1 / num2;
            } else if (berechnung.equals("^")) {
                num3 = 1;
                for (int i = 0; i < num2; i++) {
                    result = (num3 *= num1);
                }
            }

            System.out.println("Das Ergebnis lautet: " + result);
            System.out.println();

            repeat = repeatYesNo("Möchtest du noch weiter rechnen? (j/n)");

        }
        System.out.println("Auf Wiedersehen!");
    }

    public static float calculator(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        float userInput = 0.0f;
        boolean validInput = false;
        while (!validInput) {
            try {
                userInput = sc.nextFloat();
                validInput = true;
            } catch (InputMismatchException ime) {
                System.out.println("Deine Eingabe ist ungültig!");
                sc.nextLine();
        }
        }

        return userInput;
    }

    public static String operator(String sign) {
        Scanner sc = new Scanner(System.in);

        String userInputSign = " ";
        while (!userInputSign.equals("+") && !userInputSign.equals("-") && //Warum hier wird hier ein Rufzeichen benutzt?
                !userInputSign.equals("*") && !userInputSign.equals("/") &&
                !userInputSign.equals("^")) {
            System.out.println(sign);
            userInputSign = sc.nextLine();
        }

        return userInputSign;
    }

    public static boolean repeatYesNo(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("j") || answer.equals("J") || answer.equals("ja") || answer.equals("Ja");
    }
}
