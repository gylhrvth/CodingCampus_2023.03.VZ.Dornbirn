package mert.week07;

import java.io.File;
import java.util.Scanner;
import java.nio.file.Path;

public class GrößteFile {
    public static void main(String[] args) {


        File startPath = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert\\week07");


        long bigestFileSize = getBigestFile(startPath);
        System.out.println("big: " + bigestFileSize);
        printFile(startPath, startPath, bigestFileSize);
    }





    public static void printFile(File f, File start, long sizeToSearch) {
        if (f.isFile() && f.length() == sizeToSearch) {
            Path startPath = Path.of(start.getAbsolutePath());
            Path fPath = Path.of(f.getAbsolutePath());
            System.out.println(startPath.relativize(fPath));
        }
        if (f.isDirectory()) {
            File[] content = f.listFiles();
            if (content != null) {
                for (File fi : content) {
                    printFile(fi, start, sizeToSearch);

                }
            }
        }
    }


    public static String readText(String message) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(message);
            String path = sc.nextLine();
            File datei = new File(path);
            if (datei.isDirectory()) {
                return path;
            }
        }
    }

    public static long getBigestFile(File file) {
        if (file.isAbsolute()) {
            return file.length();
        }
        File[] content = file.listFiles();
        if (content == null) {
            return 0;
        }
        long max = 0;
        for (File fi : content) {
            long tempSize = getBigestFile(fi);
            if (tempSize > max) {
                max = tempSize;
            }
        }


        return max;
    }
}