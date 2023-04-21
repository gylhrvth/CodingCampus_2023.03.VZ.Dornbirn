package mert.week07;

import java.io.File;

public class FilesUnterverzeichniss {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert\\");
        printDirectory("", f1);
        System.out.println();
        System.out.println("Anzahl Datei: " + countFiles(f1));
        System.out.println("Bytes: " + sumFileSizes(f1));
    }

    public static void printDirectory(String indent, File start) {
        File[] liste = start.listFiles();
        for (File datei : liste) {
            System.out.println(indent + datei.getName());
            if (datei.isDirectory()) {
                printDirectory(indent + "    ", datei);
            }
        }
    }

    public static int countFiles(File start) {
        int count = 0;
        if (start.isFile()) {
            count++;
        } else if (start.isDirectory()) {
            for (File file : start.listFiles()) {
                count += countFiles(file);
            }
        }
        return count;
    }

    public static long sumFileSizes(File start) {
        long sum = 0;
        if (start.isFile()) {
            sum += start.length();
        } else if (start.isDirectory()) {
            for (File file : start.listFiles()) {
                sum += sumFileSizes(file);
            }
        }
        return sum;
    }
}