package mert.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileExercise {
    public static void main(String[] args) {
        File f = new File("assets/tmp/output.txt.");
        f.getParentFile().mkdirs();
        try {

            System.out.println("Geben Sie einen Text ein:   ");
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            Scanner sc = new Scanner(System.in);
            System.out.print(">> ");
            String line = sc.nextLine();


            while (!line.equals("")) {
                ps.println(line);
                System.out.print(">> ");
                line = sc.nextLine();

            }
            ps.close();

            System.out.println("File schreiben war erfolgreich");

        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar");
        }
    }

}

