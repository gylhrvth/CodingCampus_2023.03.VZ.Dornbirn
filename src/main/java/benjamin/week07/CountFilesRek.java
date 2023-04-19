package benjamin.week07;

import java.io.File;

public class CountFilesRek {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn");

        printCountandSum(directory);

    }

    public static void printCountandSum(File directory) {

            int numFiles = 0;
            long fileSumAll = 0;

            numFiles = fileCount(directory);
            fileSumAll = fileSum(directory);

//            numFiles = fileCount(new File("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\benjamin\\week07"));
//            fileSumAll = fileSum(new File("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\benjamin\\week07"));

            System.out.println("Anzahl der Dateien im Verzeichnis: " + numFiles);
            System.out.println("Summe der Größe der Dateien:       " + fileSumAll + " bytes");
    }

    public static int fileCount(File directory) {

        File[] fileList = directory.listFiles();

        int numFiles = 0;
        for (File file : fileList) {
            if (file.isFile()) {
                numFiles++;

            } else if (file.isDirectory()) {
                numFiles += fileCount(file);
            }
        }
        return numFiles;
    }

    public static long fileSum(File directory){

        File[] fileList = directory.listFiles();

        long sumLength = 0;
        for (File file: fileList) {
            if(file.isFile()){
                sumLength += file.length();
            } else if (file.isDirectory()){
                sumLength += fileSum(file);
            }
        }
        return sumLength;
    }
}
