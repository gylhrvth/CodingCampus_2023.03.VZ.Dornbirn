package mariechristine.week7;

import java.io.File;
import java.util.Arrays;

public class FilesCountSum {
    public static void main(String[] args) {
        File startDirectory = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\");
        System.out.println("Verzeichnis: " + startDirectory.getAbsolutePath() + "\n");

        System.out.println("Count files in directory: " + countFilesInDirectory(startDirectory));
        System.out.println("Sum up size of files: " + sumSizeInDirectory(startDirectory));

        System.out.println("=======================");
        System.out.println("Count files recursive: " + countFilesRecursive(startDirectory));
        System.out.println("Sum up size of files recursive: " + sumSizeRecursive(startDirectory));

    }


    public static int countFilesInDirectory(File startDirectory) {
        File[] directoryContent = startDirectory.listFiles();
        int countFiles = 0;
        for (int i = 0; i < directoryContent.length; i++) {
            if (directoryContent[i].isFile()) {
                ++countFiles;
            }
        }
        return countFiles;
    }


    public static long sumSizeInDirectory(File startDirectory) {
        File[] directoryContent = startDirectory.listFiles();
        long sum = 0;
        for (int i = 0; i < directoryContent.length; i++) {
            if (directoryContent[i].isFile()) {
                sum = sum + directoryContent[i].length();
            }

        }
        return sum;
    }


    public static long countFilesRecursive(File startDirectory) {
        if (startDirectory.isFile()){
            return 1;
        }

        File[] directoryContent = startDirectory.listFiles();

        long countFiles = 0;
        for (int i = 0; i < directoryContent.length; i++) {
            countFiles += countFilesRecursive(directoryContent[i]);
        }
        return countFiles;
    }

    public static long sumSizeRecursive(File startDirectory) {
        if (startDirectory.isFile()){
            return startDirectory.length();
        }

        File[] directoryContent = startDirectory.listFiles();
        long sum = 0;
        for (int i = 0; i < directoryContent.length; i++) {
            sum += sumSizeRecursive(directoryContent[i]);
        }
        return sum;
    }
}

