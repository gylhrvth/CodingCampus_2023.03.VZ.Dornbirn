package hassan.week02;
import java.util.Scanner;
public class Taschenrechner {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);
        float zahl1, zahl2, ergebniss;
        String operator = "";
        boolean endergebniss = false;
        while (repeat) {
                System.out.println("Bitte gib die erste zahl ein: ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Das ist keine gültige Zahl. Bitte gib eine Zahl ein:");
                    scan.nextLine();
                }
                zahl1 = scan.nextFloat();
                scan.nextLine();

                operator = "";
                while (
                        !operator.equals("+") &&
                        !operator.equals("-") &&
                        !operator.equals("*") &&
                        !operator.equals("/") &&
                        !operator.equals("^")
                ) {
                    System.out.println("Bitte gib einen operator ein: ");
                    operator = scan.nextLine();
                }

                System.out.println("Bitte gib die zweite zahl ein: ");
                while (!scan.hasNextFloat()) {
                    System.out.println("Das ist keine glültige Zahl. Bitte gib eine Zahl ein:");
                    scan.nextLine();
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
                }else {
                    System.out.println("Ungültiger operator");
                    continue;
                }
                System.out.println("Ergebniss: " + ergebniss);
                repeat = readJaNein("Nochmal? Ja/nein");
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