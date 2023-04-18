package mert.week07;

import java.io.File;
import java.util.Scanner;

public class GrößteFile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert\\");
        printDirectory(f1);
        System.out.println();
        String name = readText("Geben Sie einen Dateipfad ein...");


    }

    public static void printDirectory(File start) {
        File[] liste = start.listFiles();
        for (File datei : liste) {
            System.out.println(datei.getName());
            if (datei.isDirectory()) {
                printDirectory(datei);
            }
        }
    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static int countFiles(File start) {
        File[] inhalt = start.listFiles();

        int anzahlDatei = 0;
        for (File f : inhalt) {
            if (!f.isDirectory()) {
                anzahlDatei++;
            }
        }
        return anzahlDatei;
    }

    public static long sumFileSizes(File start) {
        File[] inhalt = start.listFiles();
        long filesize = 0;

        for (File singleFile : inhalt) {
            if (!singleFile.isDirectory()) {
                filesize += singleFile.length();
            }
        }
        return filesize;
    }
}




