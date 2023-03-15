package hassan.week02;
import java.util.Scanner;
public class Taschenrechner {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);
        float zahl1, zahl2, ergebniss = 0, zwischenergebniss = 0, memory = ergebniss;
        String operator = "";
        boolean endergebniss = false;
        while (repeat) {
            System.out.println("Memory Funktion: ");
            System.out.println();
            System.out.println("MC - Memory Clear");
            System.out.println("M+ - Memory Add");
            System.out.println("M- - Memory Sub");
            System.out.println("MR - Memory Read");
            if (zwischenergebniss != 0) {
                zahl1 = zwischenergebniss;
            } else {
                System.out.println("Bitte gib die erste zahl ein: ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Das ist keine gültige Zahl. Bitte gib eine Zahl ein:");
                    scan.nextLine();
                }
                zahl1 = scan.nextFloat();
                scan.nextLine();
            }
            operator = "";
            while (
                            !operator.equals("+") &&
                            !operator.equals("-") &&
                            !operator.equals("*") &&
                            !operator.equals("/") &&
                            !operator.equals("^") &&
                            !operator.equals("MC") &&
                            !operator.equals("M+") &&
                            !operator.equals("M-") &&
                            !operator.equals("MR")
            ) {
                System.out.println("Bitte gib einen operator ein: ");
                operator = scan.nextLine();
            }
            if (operator.equals("MC")) {
                memory = zwischenergebniss = 0;
                System.out.println("Memory Wert: 0");
            } else if (operator.equals("M+")) {
                zwischenergebniss += zahl1;
                System.out.println("Ergebnis: " + zwischenergebniss);
            } else if (operator.equals("M-")) {
                zwischenergebniss -= zahl1;
                System.out.println("Ergebnis: " + zwischenergebniss);
            } else if (operator.equals("MR")) {
                ergebniss = memory;
                System.out.println("Memory Wert: " + zwischenergebniss);
            } else {
                System.out.println("Bitte gib die Zweite Zahl an: ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Bitte gib eine Zahl an!");
                    scan.next();
                }

                zahl2 = scan.nextFloat();
                scan.nextLine();
                if (operator.equals("+")) {
                    ergebniss = zahl1 + zahl2;
                } else if (operator.equals("-")) {
                    ergebniss = zahl1 - zahl2;
                } else if (operator.equals("*")) {
                    ergebniss = zahl1 * zahl2;
                } else if (operator.equals("/")) {
                    ergebniss = zahl1 / zahl2;
                } else if (operator.equals("^")) {
                    ergebniss = 1;
                    for (int i = 0; i < zahl2; i++) {
                        ergebniss *= zahl1;
                    }
                } else {
                    System.out.println("Ungültiger operator");
                    continue;
                }
                System.out.println("Ergebniss: " + ergebniss);
                zwischenergebniss = ergebniss;
                repeat = readJaNein("Weiter rechnen? Ja/nein");
            }
        }
        System.out.println("Ciaooooooooooooooo!!");
    }

    public static boolean readJaNein(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}
