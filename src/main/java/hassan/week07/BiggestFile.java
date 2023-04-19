package hassan.week07;

import java.io.File;
import java.util.Scanner;

public class BiggestFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = askForPath(scanner);

        File file = new File(path);
        if (file.isFile()) {
            System.out.println("Größte Datei  : " + file.getName() + " (" + file.length() + " bytes)");
            return;
        }

        File largestFile = findLargestFile(file);


        if (largestFile != null) {
            long fileSize = largestFile.length();
            String relativePath = file.toURI().relativize(largestFile.toURI()).getPath();
            System.out.println("Größte Datei  : " + relativePath + " (" + fileSize + " bytes)");
        } else {
            System.out.println("Keine Dateien gefunden in " + path);
        }


//        Scanner scanner = new Scanner(System.in);
//        String path = askForPath(scanner);
//
//        File file = new File(path);
//        if (file.isFile()) {
//            System.out.println("Größte Datei  : " + file.getName() + " (" + file.length() + " bytes)");
//            return;
//        }
//
//        File[] largestFiles = findLargestFiles(file);
//
//        if (largestFiles != null && largestFiles.length > 0) {
//            System.out.println("Größte Dateien:");
//            for (File largestFile : largestFiles) {
//                String relativePath = file.toURI().relativize(largestFile.toURI()).getPath();
//                System.out.println(relativePath + " (" + largestFile.length() + " bytes)");
//            }
//        } else {
//            System.out.println("Keine Dateien gefunden in " + path);
//        }


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

//    public static File[] findLargestFiles(File directory) {
//        File[] files = directory.listFiles();
//        if (files == null) {
//            System.out.println(directory.getAbsolutePath());
//            return null;
//        }
//        File[] largestFiles = new File[files.length];
//        int largestFileSize = 0;
//        int largestFileCount = 0;
//        for (File file : files) {
//            if (file.isDirectory()) {
//                File[] subDirectoryLargestFiles = findLargestFiles(file);
//                for (File subDirectoryLargestFile : subDirectoryLargestFiles) {
//                    if (subDirectoryLargestFile.length() >= largestFileSize) {
//                        if (subDirectoryLargestFile.length() > largestFileSize) {
//                            largestFileSize = (int) subDirectoryLargestFile.length();
//                            largestFileCount = 0;
//                        }
//                        largestFiles[largestFileCount++] = subDirectoryLargestFile;
//                    }
//                }
//            } else {
//                if (file.length() >= largestFileSize) {
//                    if (file.length() > largestFileSize) {
//                        largestFileSize = (int) file.length();
//                        largestFileCount = 0;
//                    }
//                    largestFiles[largestFileCount++] = file;
//                }
//            }
//        }
//        File[] result = new File[largestFileCount];
//        System.arraycopy(largestFiles, 0, result, 0, largestFileCount);
//        return result;
//    }




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
