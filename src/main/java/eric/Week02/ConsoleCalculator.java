package eric.Week02;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        boolean repeat = true;


        Scanner scan = new Scanner(System.in);
        float zahl1, zahl2, ergebnis;
        char operator = ' ';
        boolean endergebnis = false;

        while (repeat) {
            while (!endergebnis) {
                System.out.println("Bitte gib die Rechnung an,");
                System.out.print("die du Ausrechnen willst (z.B. 5 * 5): ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Bitte gib eine Zahl an!");
                    scan.nextLine();
                }
                zahl1 = scan.nextFloat();

                operator = scan.next().charAt(0);

                zahl2 = scan.nextFloat();

                if (operator == '+') {
                    ergebnis = zahl1 + zahl2;
                } else if (operator == '-') {
                    ergebnis = zahl1 - zahl2;
                } else if (operator == '*') {
                    ergebnis = zahl1 * zahl2;
                } else if (operator == '/') {
                    ergebnis = zahl1 / zahl2;
                } else if (operator == '^') {
                    ergebnis = 1;
                    for (int i = 0; i < zahl2; i++) {
                        ergebnis *= zahl1;
                    }
                } else {
                    System.out.println("Ungültiger Operator, Bitte Gib einen anderen an!");
                    continue;
                }
                if (!endergebnis) {
                    System.out.println("Ergebnis: " + ergebnis);
                }
                repeat = readJaNein("Nochmal? J/N");
            }
            scan.close();
        }
    }


    public static boolean readJaNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}
