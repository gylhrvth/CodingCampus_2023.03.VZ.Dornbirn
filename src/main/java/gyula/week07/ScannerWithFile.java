package gyula.week07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerWithFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula/week07/MyMessage.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe){
            System.err.println("Datei wurde nicht gefunden.");
        }
    }
}
