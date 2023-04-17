package eric.week07.datenStroemeExcersice;

import java.io.File;
import java.util.Scanner;

public class AufgabeSearchForGreatestFile {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Gib einen Verzeichnungspfad an: ");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        File largestFile = findLargestFile(files);

        if (largestFile != null){
            System.out.println("Größte Datei: " + largestFile.getPath());
            System.out.println("Größe:        " + largestFile.length() + " Bytes");
        } else {
            System.out.println("Keine Dateien gefunden.");
        }

    }

    public static File findLargestFile(File[] file){
        File largestFile = null;
        long size = 0;
        for (File f : file) {
            if (f.isFile() && f.length() > size){
                size = f.length();
                largestFile = f;
            } else if (f.isDirectory()) {
                File[] subFiles = f.listFiles();
                File largestSubFile = findLargestFile(subFiles);
                if (largestSubFile != null && largestSubFile.length() > size){
                    size =largestSubFile.length();
                    largestFile = largestSubFile;
                }
            }
        }
        return largestFile;
    }
}
