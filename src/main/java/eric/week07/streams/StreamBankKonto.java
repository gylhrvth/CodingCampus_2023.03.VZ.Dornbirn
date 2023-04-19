package eric.week07.streams;

import lukas.week03.day4.Colors;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StreamBankKonto {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bitte gib deinen Namen ein: ");
        String name = sc.nextLine().toLowerCase();

        File file = new File("C:\\Users\\syn7e\\OneDrive\\Desktop\\BankKonto_BonusAufgabe\\" + name + ".txt");
        file.getParentFile().mkdirs();

        int kontoStand = 100;

        if (!file.exists()){
            System.out.println("Ihr aktueller Kontostand beträgt EUR " + Colors.COLORS[2] +  kontoStand + Colors.RESET + ",-");
        }
        if (file.exists()){
            try {
                Scanner fileScanner = new Scanner(file);
                kontoStand = fileScanner.nextInt();
                System.out.println("Ihr aktueller Kontostand beträgt EUR " + Colors.COLORS[2] +  kontoStand + Colors.RESET + ",-");
            } catch (FileNotFoundException e){
                System.out.println("Fehler beim einlesen des Kontostand.");
            }
        }

        System.out.println("Gib den Betrag an den du Überweisen willst. (Positiv = auf dein Konto, Negativ = vom Konto weg)");

        int betrag;
        try {
            betrag = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Bitte gib einen Betrag in Zahlen an!");
            sc.nextLine();
            betrag = sc.nextInt();
        }
        kontoStand += betrag;

        System.out.println("Ihr Neuer Kontostand ist EUR " + Colors.COLORS[2] +  kontoStand + Colors.RESET + ",-");

        try {
            FileOutputStream fos = new FileOutputStream(file, false);
            PrintStream ps = new PrintStream(fos);
            ps.printf("%2d %n", kontoStand);
            ps.close();
        } catch (FileNotFoundException e){
            System.out.println("Fehler beim einlesen des Kontostand.");
        }
    }
}
