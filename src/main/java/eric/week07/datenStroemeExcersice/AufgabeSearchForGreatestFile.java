package eric.week07.datenStroemeExcersice;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AufgabeSearchForGreatestFile {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String directoryPath = null;
        File directory = null;
        boolean validInput = false;

        while (!validInput){
            System.out.println("Bitte gib ein Verzeichnungspfad an.");
            directoryPath = sc.nextLine();
            directory = new File(directoryPath);

            if (directory.exists() && directory.isDirectory()) {
                validInput = true;
            } else {
                System.out.println("Ungültiger Verzeichnispfad. Bitte versuchen Sie es erneut.");
            }
        }
        File largestFile = findLargestFile(directory.listFiles());
        if (largestFile != null) {
            System.out.println("Größte Datei: " + largestFile.getPath());
            System.out.println("Größe:        " + largestFile.length() + " Bytes");
        } else {
            System.out.println("Keine Dateien gefunden.");
        }
    }



    public static File findLargestFile(File[] file) {
        File largestFile = null;
        long size = 0;
        for (File f : file) {
            System.out.println("findLargestFile" + f.getAbsolutePath());
            if (f.isFile() && f.length() > size) {
                size = f.length();
                largestFile = f;
            } else if (f.isDirectory()) {
                File[] subFiles = f.listFiles();
                File largestSubFile = findLargestFile(subFiles);
                if (largestSubFile != null && largestSubFile.length() > size) {
                    size = largestSubFile.length();
                    largestFile = largestSubFile;
                }
            }
        }
        return largestFile;
    }
}
