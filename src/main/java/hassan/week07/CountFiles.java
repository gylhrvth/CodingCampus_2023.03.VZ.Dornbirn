package hassan.week07;

import java.io.File;

public class CountFiles {
    public static void main(String[] args) {
        File directory = new File("/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn");

        long[] result = searchTree(directory);
        long totalFiles = result[0];
        long totalsize = result[1];

        // calculateStats(directory);
        System.out.println("Anzahl Dateien:  " + totalFiles);
        System.out.println("Gesamtgröße:     " + totalsize + " Bytes.");


    }

    public static long[] searchTree(File directory) {
        if (directory.isFile()){
            return new long[] {1, directory.length()};
        }

        long[] result = new long[2];
        File[] files = directory.listFiles();
        for (File f : files) {
            long [] subResult = searchTree(f);
            result[0] += subResult[0];
            result[1] += subResult[1];
        }
        return result;
    }

}
