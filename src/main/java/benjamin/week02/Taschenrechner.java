package benjamin.week02;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Taschenrechner {

    public static void main(String[] args) {

        taschenrechner();

    }

    public static void taschenrechner() {
        boolean repeat = true;
        float num1, num2, num3;
        float result = 0.0f;
        String operator;

        num1 = readNumber("Gib deine erste Zahl ein.");

        while (repeat) {

            operator = operator("Gib einen Operator ein (+,-,*,^,/): ");

            num2 = readNumber("Gib deine zweite Zahl ein.");

            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            } else if (operator.equals("^")) {
                num3 = 1;
                for (int i = 0; i < num2; i++) {
                    result = (num3 *= num1);
                }
            }

            System.out.println("Dein Ergebnis = " + result + " ");
            System.out.println();

            repeat = readJaNein("Möchtest du mit deiner Zahl weiterrechnen j/n?");

            num1 = result;

        }
        System.out.println("Auf Wiedersehen!");

    }


    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }


    public static float readNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        float value = 0.0f;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            try {
                String line = sc.nextLine();
                value = Float.valueOf(line);
                numberIsValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Eingabe.");
            }
        }
        return value;
    }

    public static String operator(String message) {
        Scanner sc = new Scanner(System.in);
        String operator = " ";

        while (
                !operator.equals("+") &&
                        !operator.equals("-") &&
                        !operator.equals("*") &&
                        !operator.equals("/") &&
                        !operator.equals("^")) {
            System.out.println(message);
            operator = sc.nextLine();
        }

        return operator;
    }


    public static boolean readJaNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}



