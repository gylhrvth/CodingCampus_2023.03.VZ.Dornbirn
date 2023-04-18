package eric.week07.datenStroemeExcersice;

import java.io.File;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AufgabeSearchForGreatestFile {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String directoryPath = null;
        File directory = null;
        boolean validInput = false;


        while (!validInput) {
            System.out.println("Bitte gib ein Verzeichnungspfad an.");
            directoryPath = sc.nextLine();
            directory = new File(directoryPath);


            if (directory.exists() && directory.isDirectory()) {
                validInput = true;
            } else {
                System.out.println("Ungültiger Verzeichnispfad" + directoryPath);
            }
        }


        File largestFile = findLargestFile(directory);
        if (largestFile != null) {
            System.out.println("Größte Datei: " + largestFile.getPath());
            System.out.println("Größe:        " + largestFile.length() + " Bytes");
        } else {
            System.out.println("Keine Dateien gefunden.");
        }
    }

    public static File findLargestFile(File file) {
        File largestFile = null;
        File[] dir = file.listFiles();

        if (dir != null) {
            for (File f : dir) {
                if (f.isDirectory()) {
                    File subDirLargestFile = findLargestFile(f);
                    if (subDirLargestFile != null && (largestFile == null || subDirLargestFile.length() > largestFile.length())) {
                        largestFile = subDirLargestFile;
                    }
                } else if (largestFile == null || f.length() > largestFile.length()) {
                    largestFile = f;
                }
            }
        }
        return largestFile;
    }

//    public static File findLargestFile(File file) {
//        File largestFile = null;
//        File[] dir = file.listFiles();
//        long size = 0;
//
//        if (dir != null) {
//            for (File f : dir) {
//                if (f.isDirectory()) {
//                    File subDirLargestFile = findLargestFile(f);
//                    if (subDirLargestFile != null && subDirLargestFile.length() > size) {
//                        size = subDirLargestFile.length();
//                    }
//                    largestFile = subDirLargestFile;
//                } else if (largestFile == null || f.length() > largestFile.length()) {
//                    largestFile = f;
//                }
//            }
//            File[] temp = new File[dir.length];
//            int count = 0;
//            for (File files : dir) {
//                if (!files.isDirectory() && files.length() == size){
//                    temp[count++] == files;
//                }
//            }
//        }
//        return largestFile;
//    }
}
