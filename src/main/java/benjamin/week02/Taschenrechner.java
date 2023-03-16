package benjamin.week02;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Taschenrechner {

    public static void main(String[] args) {

        taschenrechner();

    }

    public static void taschenrechner() {
        boolean repeat = true;
        float num1 = 0.0f;
        float num2 = 0.0f;
        float num3;
        float result = 0.0f;
        String operator;
        System.out.println("Was willst du rechnen?");
        boolean validInput = false;
        while (!validInput) {
            while (repeat){

                System.out.println("Gib deine erste Zahl ein.");
                if (!validInput) {
                    num1 = readNumber();
                }

                //Todo hier soll das Ergbnis + die Abfragen beginnen, zuerst mit Operator und dann zweite Zahl
                operator = operator("Gib einen Operator ein (+,-,*,^,/): ");

                System.out.println("Gib deine zweite Zahl ein.");
                if (!validInput) {
                    num2 = readNumber();
                }

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

                if (repeat)
                repeat = readJaNein("Möchtest du nochmal rechnen j/n?");
                else{
                    repeat = readJaNein("Möchtest du weiterrechnen?");
                }


                   //Todo Taschenrechner soll mit result weiterrechnen falls gewünscht ansonsten "Auf Wiedersehen"
                   System.out.println("Auf Wiedersehen!");


            }
        }
    }


    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }


    public static float readNumber() {
        Scanner sc = new Scanner(System.in);
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

        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("^")) {
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



