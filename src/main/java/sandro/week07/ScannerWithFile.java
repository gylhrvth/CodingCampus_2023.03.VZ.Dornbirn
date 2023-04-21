package sandro.week07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerWithFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("assets/temp/MyMessage.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe){
            System.out.println("Datei wurde nicht gefunden.");
        }
    }
}
