package benjamin.week07;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {

        //  C:\Users\Beni\IdeaProjects\CodingCampus_2023.03.VZ.Dornbirn\src\main\java\benjamin

        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Geben sie den Dateipfad an:");
            String directPath = sc.nextLine().trim();
            System.out.println("Geben sie das Suchkriterium an:");
            String searchCriteria = sc.nextLine().trim();

            File startPath = new File(directPath);
            if (startPath.exists() && startPath.isDirectory()) {
                validInput = true;

                searchFileByName(directPath, searchCriteria);

            } else {
                System.out.println("Ungültiges Verzeichnis");
            }
        }
    }

    public static int searchFileByName(String directoryPath, String searchCriteria) {

        File directory = new File(directoryPath);
        int count = 0;

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    count += searchFileByName(file.getPath(), searchCriteria);

                } else if (file.getName().contains(searchCriteria)) {
                    Path startPath = Path.of(directory.getAbsolutePath());
                    Path fPath = Path.of(file.getAbsolutePath());
                    System.out.println(startPath.relativize(fPath));
                    count++;
                }
            }
        }
        return count;
    }

//    public static void printFile(File file, File start, long sizeToSearch) {
//        if (file.isFile() && file.length() == sizeToSearch) {
//            Path startPath = Path.of(start.getAbsolutePath());
//            Path fPath = Path.of(file.getAbsolutePath());
//
//            System.out.println(startPath.relativize(fPath));
//        }
//
//        if (file.isDirectory()) {
//            File[] content = file.listFiles();
//            if (content != null) {
//                for (File fi : content) {
//                    printFile(fi, start, sizeToSearch);
//                }
//            }
//
//        }
//    }

//
//    public static String conInput(){
//
//        Scanner sc = new Scanner(System.in);
//        String directPath = null;
//        String  searchCriteria = null;
//        boolean validInput = false;
//
//        while (!validInput) {
//            System.out.println("Geben sie den Dateipfad an:");
//            directPath = sc.nextLine().trim();
//            System.out.println("Geben sie das Suchkriterium an:");
//            searchCriteria = sc.nextLine().trim();
//
//            File directory = new File(directPath);
//
//            if (directory.exists() && directory.isDirectory()) {
//                validInput = true;
//            } else {
//                System.out.println("Ungültiges Verzeichnis");
//            }
//        }
//        return directPath;
//
//    }

}

