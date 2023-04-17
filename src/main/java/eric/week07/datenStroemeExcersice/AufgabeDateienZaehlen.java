package eric.week07.datenStroemeExcersice;

import java.io.File;

public class AufgabeDateienZaehlen {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\eric\\";
        File directory = new File(directoryPath);

        int[] result = searchTree(directory);
        int totalFiles = result[0];
        long totalSize = result[1];
        System.out.println("Anzahl der Dateien:      " + totalFiles);
        System.out.println("Gesamtgröße der Dateien: " + totalSize + " Bytes");
    }

    public static int[] searchTree(File directory) {
        int[] result = new int[2];
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File f : files) {
                if (f.isFile()) {
                    result[0]++;                    //totalFiles
                    result[1] += f.length();        //totalSize
                }
            }
        }
        return result;
    }
}
