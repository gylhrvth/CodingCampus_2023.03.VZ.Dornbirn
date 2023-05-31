package mert.week11.Filesystem;

import java.io.File;

public class FilesystemTraversal {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert");
            printFile("├── ", file);
            FileSize fileSize = new FileSize();
            fileSizeCalculator(4, file, fileSize);
            long totalSize = fileSize.getTotalSize();
            System.out.println("Größe aller Dateien " + totalSize + " bytes");
        } catch (Exception e) {
            System.out.println("File wurde nicht gefunden");
        }

    }

    public static void fileSizeCalculator(int depth, File file, FileReceiver receiver) {
        receiver.onFileReceived(depth, file);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    fileSizeCalculator(depth , f, receiver);
                }
            }
        }
    }


    public static void printFile(String space, File start) {
        File[] list = start.listFiles();
        for (File file : list) {
            System.out.println(space + file.getName());
            if (file.isDirectory()) {
                printFile(space + "├── ", file);
            }
        }
    }
}
