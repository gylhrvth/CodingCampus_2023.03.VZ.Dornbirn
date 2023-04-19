package hassan.week07;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directoryPath;
        String searchCriteria;


        System.out.println("Geben Sie den Verzeichnispfad ein: ");
        directoryPath = scanner.nextLine();
        System.out.println("Geben Sie das Suchkriterium ein: ");
        searchCriteria = scanner.nextLine();


        int count = searchDirectory(directoryPath, searchCriteria);
        if (count > 0) {
            System.out.println(count + " Dateien gefunden, die dem Suchkriterium entsprechen.");
        } else {
            System.out.println("Keine Dateien gefunden, die dem Suchkriterium entsprechen.");
        }
    }

    public static int searchDirectory(String directoryPath, String searchCriteria) {
        File directory = new File(directoryPath);
        int count = 0;

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {

                        count += searchDirectory(file.getPath(), searchCriteria);
                    } else if (file.getName().toLowerCase().contains(searchCriteria.toLowerCase())) {

                        System.out.println(file.getPath());
                        count++;
                    }
                }
            }
        } else {
            System.out.println("Das Verzeichnis existiert nicht oder ist kein Verzeichnis.");
        }

        return count;
    }
}


