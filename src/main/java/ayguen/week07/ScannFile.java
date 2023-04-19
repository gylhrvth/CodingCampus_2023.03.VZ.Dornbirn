package ayguen.week07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannFile {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\ayguen\\week07\\MyMessage.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        }

    }
}
