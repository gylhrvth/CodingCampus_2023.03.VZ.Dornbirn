package eric.week07.datenStroemeExcersice;

import java.io.File;

public class AufgabeDateienZaehlenRekursiv {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert";
        File directory = new File(directoryPath);

        long[] result = searchTree(directory);
        long totalFiles = result[0];
        long totalSize = result[1];
        System.out.println("Anzahl der Dateien:      " + totalFiles);
        System.out.println("Gesamtgröße der Dateien: " + totalSize + " Bytes");

    }

    public static long[] searchTree(File directory) {
        if (directory.isFile()){
            return new long[]{1, directory.length()};
        }

        long[] result = new long[2];
        File[] files = directory.listFiles();
        for (File f : files) {
                long[] subResult = searchTree(f);
                result[0] += subResult[0];
                result[1] += subResult[1];
        }
        return result;
    }
}