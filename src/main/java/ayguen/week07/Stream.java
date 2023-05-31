package ayguen.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class Stream {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\ayguen\\week07\\");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);
            ps.println("Hello World!");
            ps.close();
            System.out.println("File schreiben war erfolgreich");
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar.");
        }

    }
}





