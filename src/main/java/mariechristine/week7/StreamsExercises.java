package mariechristine.week7;

import java.io.*;
import java.util.Scanner;

public class StreamsExercises {
    public static void main(String[] args) {
        File f = new File("assets/tmp/output.txt"); //Filepfad/-name erstellen; hier wird die Datei gespeichert
        f.getParentFile().mkdirs();
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream fos = new FileOutputStream(f, true); //Schreibt oder überschreibt (false) eine Datei
            PrintStream ps = new PrintStream(fos); //um in eine Datei zu schreiben, muss ein PrintStream-Objekt erstellt werden

            String userInput = "X";
            while (!userInput.equals("")) {
                System.out.print(">> ");
                userInput = sc.nextLine();
                ps.println(userInput);
            }
            System.out.println("Die Eingaben werden nun in eine Datei gespeichert!");
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht eirreichbar.");
        }


    }
}
