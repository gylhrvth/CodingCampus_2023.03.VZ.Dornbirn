package eric.Week02;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        boolean repeat = true;
        String operator = "";
        Scanner scan = new Scanner(System.in);
        float zahl1, zahl2, ergebnis, zwischenergebnis = 0, memory = 0;


        while (repeat) {
            System.out.println("Memory Funktion:");
            System.out.println("MC - Memory Clear");
            System.out.println("M+ - Memory Add");
            System.out.println("M- - Memory Sub");
            System.out.println("MR - Memory Read");
            if (zwischenergebnis != 0) {
                zahl1 = zwischenergebnis;
            } else {
                System.out.println("Bitte gib die Erste Zahl an: ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Bitte gib eine Zahl an!");
                    scan.next();
                }
                zahl1 = scan.nextFloat();
                scan.nextLine();

            }
            operator = "";
            while (
                    !operator.equals("+") && !operator.equals("*") && !operator.equals("/") &&
                            !operator.equals("-") && !operator.equals("^") && !operator.equals("MC") &&
                            !operator.equals("M+") && !operator.equals("M-") && !operator.equals("MR")

            ) {
                System.out.println("Bitte gib einen gültigen Operator wie +, -, * ein: ");
                operator = scan.next();

            }

            if (operator.equals("MC")) {
                memory = zwischenergebnis = 0;
                System.out.println("Memory Wert: 0");
                continue;
            } else if (operator.equals("M+")) {
                zwischenergebnis += zahl1;
                System.out.println("Ergebnis: " + zwischenergebnis);
                continue;
            } else if (operator.equals("M-")) {
                zwischenergebnis -= zahl1;
                System.out.println("Ergebnis: " + zwischenergebnis);
                continue;
            } else if (operator.equals("MR")) {
                ergebnis = memory;
                System.out.println("Memory Wert: " + zwischenergebnis);
                continue;
            } else {
                System.out.println("Bitte gib die Zweite Zahl an: ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Bitte gib eine Zahl an!");
                    scan.next();
                }
                zahl2 = scan.nextFloat();
                scan.nextLine();


                if (operator.equals("+")) {
                    ergebnis = zahl1 + zahl2;
                } else if (operator.equals("-")) {
                    ergebnis = zahl1 - zahl2;
                } else if (operator.equals("*")) {
                    ergebnis = zahl1 * zahl2;
                } else if (operator.equals("/")) {
                    ergebnis = zahl1 / zahl2;
                } else if (operator.equals("^")) {
                    ergebnis = 1;
                    for (int i = 0; i < zahl2; i++) {
                        ergebnis *= zahl1;
                    }
                } else {
                    System.out.println("Ungültiger Operator, Bitte Gib einen anderen an!");
                    continue;
                }
                System.out.println("Ergebnis: " + ergebnis);
                zwischenergebnis = ergebnis;
                repeat = readJaNein("Weiter Rechnen? J/N");
            }
        }
    }

    public static boolean readJaNein(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();
        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");

    }
}
