package ayguen.week07;

import ayguen.week02.MenuGyula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Bankkonto {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein!");
        System.out.print(">> ");
        String name = sc.nextLine();

        File f = new File("assets/tmp/" + name + ".txt");
        f.getParentFile().mkdirs();

        try {
            int kontostand = 100;
            if (f.exists()){
                Scanner fileScanner = new Scanner(f);
                String lineOfFile = fileScanner.nextLine();
                try {
                    kontostand = Integer.valueOf(lineOfFile);
                } catch (NumberFormatException nfe){
                    System.out.println("\"" + lineOfFile + "\" ist ein ungültiger Kontostand.");
                }
            }
            System.out.println("Ihre aktueller kontostand ist " + kontostand + " €.");
            int value = MenuGyula.getNumber("Was möchten Sie tun " + name + "?", -1000, 1000);
            kontostand += value;
            System.out.println("Dein neuer Kontostand ist " + kontostand + " €");

            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(kontostand);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar");
        }
    }
}