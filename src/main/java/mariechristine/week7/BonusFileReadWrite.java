package mariechristine.week7;

import mariechristine.week2.Menue;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BonusFileReadWrite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Namen des Bankkunden ein: ");
        String name = sc.nextLine();
        File f = new File("assets/tmp/" + name + ".txt");

        int account = 100;
        if (f.exists()){
            try {
                Scanner fileScanner = new Scanner(f);
                account = fileScanner.nextInt();
            } catch (FileNotFoundException fnfe){
                // Do nothing
            } catch (InputMismatchException ime){
                ime.printStackTrace();
            }
        }
        System.out.println("Ihr Guthaben beträgt: " + account +" €");

        int transaktion = Menue.readChoice("Was darf ich für dich tun?", -1000, 1000);
        account += transaktion;
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(account);
            ps.close();
            System.out.println("Ihr neue Guthaben beträgt: " + account +" €");

        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht eirreichbar.");
        }

    }
}