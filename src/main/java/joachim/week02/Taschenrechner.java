package joachim.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taschenrechner {


    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);


        int number1 = readAnswer(9999);
        int number2 = readAnswer(9999);
        String operator = scanner.nextLine();

        int answer = operation(operator, number1, number2);
        System.out.println(answer);
    }

    public static int readAnswer(int minmaxvalue) {
        Scanner scanner = new Scanner(System.in);
        int minValue = minmaxvalue * (-1);
        int maxValue = minmaxvalue;
        int guess = minValue - 1;
        while ((guess < minValue) || (guess > maxValue)) {
            try {
                System.out.println("Geben Sie eine Zahl ein");
                guess = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException ignore) {
                System.out.println("Eine Nummerische Zahl bitte!");
                scanner.nextLine();
            }
        }
        return guess;
    }

    public static int operation(String operator, int param1, int param2) {
        int result = 0;
        int save = 0;

        if (operator.equals("+")) {
            result = param1 + param2;
        } else if (operator.equals("-")) {
            result = param1 - param2;
        } else if (operator.equals("*")) {
            result = param1 * param2;
        } else if (operator.equals("/")) {
            result = param1 / param2;
        } else if (operator.equals("^")) {
            result = 1;
            for (int i = 0; i < param2; i++) {
                result *= param1;
            }
        } else if (operator.equals("safe")) {
            result = save;
            System.out.println("Gespeichert");
        } else if (operator.equals("recall")) {
            save = param1;
            System.out.println("Wiederhergestellt");
        } else {
            System.out.println("Gültige Operatoren bitte.");
        }
        return result;
    }
}



