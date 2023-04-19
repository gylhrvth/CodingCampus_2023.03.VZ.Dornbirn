package eric.week07.datenStroemeExcersice;

import java.util.Scanner;
import java.io.File;

public class ExerciseSearchFileByName {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        searchForPath();
    }


    public static void searchForPath() {
        String dirPath = null;
        String searchForCrit = null;
        File dir = null;
        File searchCrit = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Bitte gib ein Verzeichnungspfad an.");
            dirPath = sc.nextLine();
            dir = new File(dirPath);


            if (dir.exists() && dir.isDirectory()) {
                validInput = true;
            } else {
                System.out.println("Ungültiger Verzeichnispfad " + dirPath);
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.println("Bitte gib ein Suchkriterium ein.");
            searchForCrit = sc.nextLine();
            searchCrit = new File(searchForCrit);

            if (!searchForCrit.isEmpty()) {
                validInput = true;
            } else {
                System.out.println("Das Suchkriteruim darf nicht leer sein.");
            }
        }

        System.out.println("Gefundene Dateien im Relativem Pfad: [ " + searchCrit + " ]");
        searchFiles(dir, searchForCrit);
    }

    private static int searchFiles(File directory, String searchCrit) {
        File[] files = directory.listFiles();
        int count = 0;

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    count += searchFiles(file, searchCrit);
                } else if (file.getName().toLowerCase().contains(searchCrit.toLowerCase())) {
                    System.out.println(file.getPath());
                    count++;
                }
            }
        }
        return count;
    }
}
