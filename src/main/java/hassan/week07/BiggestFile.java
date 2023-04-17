package hassan.week07;

import java.io.File;
import java.util.Scanner;

public class BiggestFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = askForPath(scanner);

        File directory = new File(path);
        if (!directory.isDirectory()) {
            System.out.println("Fehler : " + path + " ist kein pfad.");
            return;
        }

        File largestFile = findLargestFile(directory);
        if (largestFile != null) {
            long fileSize = largestFile.length();
            String relativePath = directory.toURI().relativize(largestFile.toURI()).getPath();
            System.out.println("Größte Datei  : " + relativePath + " (" + fileSize + " bytes)");
        } else {
            System.out.println("Keine Dateien gefunden in " + path);
        }

    }

    private static String askForPath(Scanner scanner) {
        while (true) {
            System.out.print("Gebe einen Pfad an: ");
            String path = scanner.nextLine().trim();
            File directory = new File(path);
            if (directory.isDirectory()) {
                return path;
            } else {
                System.out.println("Fehler : " + path + " ist kein Pfad.");
            }
        }
    }



    public static File findLargestFile(File directory) {
        //System.out.println("findLargestFile: " + directory.getAbsolutePath());
        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println(directory.getAbsolutePath());
            return null;
        }
        File largestFile = null;
        for (File file : files) {
            if (file.isDirectory()) {
                File subDirectoryLargestFile = findLargestFile(file);
                if (subDirectoryLargestFile != null && (largestFile == null || subDirectoryLargestFile.length() > largestFile.length())) {
                    largestFile = subDirectoryLargestFile;
                }
            } else if (largestFile == null || file.length() > largestFile.length()) {
                largestFile = file;
            }
        }
        return largestFile;
    }


}
