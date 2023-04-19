package benjamin.week07;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class SearchBiggestFile {
    public static void main(String[] args) {

        //    C:\Users\Beni\IdeaProjects\CodingCampus_2023.03.VZ.Dornbirn\src\main\java\benjamin

        printFile(consoleInput());

    }

    public static File findLargestFile(File[] directory) {
        File largestFile = null;
        long biggestFileSize = 0;


        for (File file : directory) {
            if (file.length() > biggestFileSize) {
                largestFile = file;
                biggestFileSize = file.length();

            } else if (file.isDirectory()) {
                File subLargestFile = findLargestFile(file.listFiles());

                if (subLargestFile != null && subLargestFile.length() > biggestFileSize) {
                    largestFile = subLargestFile;
                    biggestFileSize = subLargestFile.length();
                }
            }
        }
        return largestFile;
    }

    public static void printFile(String directpath) {

        File directory = new File(directpath);

        File largestAll = findLargestFile(directory.listFiles());

        if (largestAll != null) {

            System.out.println("Größtes Verzeichnis: " + largestAll.getName());
            System.out.println("Größte Datei: " + largestAll.length() + " bytes");

            Path startPath = Path.of(directory.getAbsolutePath());
            Path fPath = Path.of(largestAll.getAbsolutePath());

            System.out.println("Relativer Pfad: " + startPath.relativize(fPath));

        } else {
            System.out.println("Keine Datei vorhanden");
        }
    }

    public static String consoleInput() {
        Scanner sc = new Scanner(System.in);
        String directPath = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Geben sie den Dateipfad an:");
            directPath = sc.nextLine().trim();
            File startPath = new File(directPath);
            if (startPath.exists() && startPath.isDirectory()) {
                validInput = true;
            } else {
                System.out.println("Ungültiges Verzeichnis");
            }
        }

        return directPath;

    }

}
