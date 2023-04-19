package sandro.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamWithFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        File f = new File("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\sandro\\week07\\MyMessage.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(text);
            ps.close();
            System.out.println("File schreiben war erfolgreich");
        } catch (FileNotFoundException fnfe){
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar.");
        }
    }
}
