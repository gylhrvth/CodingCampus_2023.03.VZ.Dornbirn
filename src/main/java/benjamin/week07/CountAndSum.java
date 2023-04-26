package benjamin.week07;

import java.io.File;

public class CountAndSum {
    public static void main(String[] args) {

        File directory = new File("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\benjamin\\week07");

        printFileCountAndSum(directory);

    }

    public static void printFileCountAndSum(File directory) {

        File[] fileList = directory.listFiles();

        int numFiles = 0;
        long fileSumLength = 0;

        for (File file : fileList) {
            if (file.isFile()) {
                numFiles++;
                fileSumLength += file.length();
            }
        }
        System.out.println("Anzahl der Dateien im Verzeichnis: " + numFiles);
        System.out.println("Summe der Größe der Dateien: " + fileSumLength + " bytes");
    }

}
