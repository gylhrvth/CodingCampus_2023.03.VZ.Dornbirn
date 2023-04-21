package hassan.week07;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Namen ein:  ");
        String name = scanner.nextLine().toLowerCase();

        int kontostand = 100;
        String fileName = "assets/bank/" + name + ".txt";

        try {
            File file = new File(fileName);
            if (file.exists()) {
                Scanner filescanner = new Scanner(file);
                kontostand = Integer.parseInt(filescanner.nextLine());
                filescanner.close();
            }

            System.out.println("Ihr aktueller Kontostand beträgt:  " + kontostand + " EUR");

            System.out.println("Geben Sie den Betrag ein, den Sie einzahlen ( positiver Wert ) oder auszahlen ( negativer Wert ) möchten: ");

            int betrag;
            try {
                betrag = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Bitte Gib nur Zahlen an!");
                scanner.nextLine();
                betrag = scanner.nextInt();
            }
            kontostand += betrag;

            file.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(file);
            ps.println(kontostand);
            ps.close();

            System.out.println("Ihr neuer Kontostand beträgt : " + kontostand + " EUR");

        }catch (IOException e){
            System.out.println("Fehler:  " + e.getMessage());
        }
        scanner.close();
    }
}
