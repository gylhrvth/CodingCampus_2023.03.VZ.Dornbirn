package eric.osterFerien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String inputString = "";
        int inputNumber = 0;

        while (inputString.isEmpty() || inputNumber == 0) {
            System.out.print("Gib einen Satz ein: ");
            try {
                inputString = sc.nextLine();
            } catch (InputMismatchException ism){
                System.out.println("Ungültiger Satz gib einen neuen Satz an!");
            }
            System.out.print("Gib eine Zahl ein: ");
            try {
                inputNumber = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Ungültige Zahl. Versuche es erneut.");
            }
        }
        for (int i = 0; i < inputNumber; i++) {
            System.out.println(inputString);
        }
    }
}
