package sandro.week01;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        System.out.println("*****+++++Taschenrechner Premium 3000s+++++*****");
        System.out.println();
        System.out.println("Was willst du rechnen?");
        float zahl = readZahl("");
        String operator = readOperator("+, -, *,^ ,/ ");
        float zahl2 = readZahl("");


        float wert = 0.0f;


        if (operator.equals("+")){
            System.out.println("Plus");

            wert = zahl + zahl2;
        } else if (operator.equals("-")) {
            System.out.println("Minus");
            wert = zahl - zahl2;
        } else if (operator.equals("*")) {
            System.out.println("Mal");
            wert = zahl * zahl2;
        } else if (operator.equals("^")) {
            System.out.println("Hoch");
            wert = 1;
            for (int i = 0; i < zahl2; i++) {
                wert *= zahl;
            }
        } else if (operator.equals("/")) {
            System.out.println("Geteilt");
            wert = zahl / zahl2;


        } else {
            System.out.println("Unknown operator");
        }
        System.out.println("Das Ergebnis ist: " +wert);

    }


    public static String readOperator(String message) {
        Scanner sc = new Scanner(System.in);
        String operator = "";

        while (
            !operator.equals("+") &&
            !operator.equals("-") &&
            !operator.equals("*") &&
            !operator.equals("/") &&
            !operator.equals("^")
        ){
            System.out.println(message);
            operator = sc.nextLine();
        }

        return operator;
    }


    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static float readZahl(String text) {
        Scanner sc = new Scanner(System.in);
        float value = 0.0f;
            try {
                String line = sc.nextLine();
                value = Float.valueOf(line);

            } catch (NumberFormatException nfe) {
                System.out.println("Deine Zahl ist ungültig!!!");
            }

        return value;
    }

    public static boolean readJaNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}

