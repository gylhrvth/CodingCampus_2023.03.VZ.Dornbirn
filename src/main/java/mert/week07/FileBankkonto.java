package mert.week07;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileBankkonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:   ");
        String name = sc.nextLine().toLowerCase();
        int kontostand = 100;
        String filename = "assets/bank/" + name + ".txt";
        File file = null;
        try {
            file = new File(filename);
            if (file.exists()) {
                Scanner scf = new Scanner(file);
                kontostand = Integer.parseInt(scf.nextLine());
                scf.close();
            }
            System.out.println("Dein Kontostand ist " + kontostand + "€");
            System.out.println("Zum einzahlen Positiver Betrag. Zum auszahlen Negativer Betrager.");

            int betrag;
            try {
                betrag = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("nur zahlen");
                sc.nextLine();
                betrag = sc.nextInt();
            }
            kontostand += betrag;
            file.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(file);
            ps.println(kontostand);
            ps.close();
            System.out.println("Dein neuer kontostand ist " + kontostand+ "€");
        } catch (FileNotFoundException fnfe) {
            System.out.println(file.getAbsolutePath() + " ist nicht erreichbar");
        }
    sc.close();
    }
}