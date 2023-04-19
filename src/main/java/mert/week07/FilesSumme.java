package mert.week07;

import java.io.File;

public class FilesSumme {
    public static void main(String[] args) {


        File startVerzeichnis = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert\\");
        System.out.println(startVerzeichnis.getAbsolutePath());

        System.out.println("Count files: " + countFiles(startVerzeichnis));
        System.out.println("Bytes : " + sumFileSizes(startVerzeichnis));

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

        for (File f1 : inhalt) {
            if (!f1.isDirectory()) {
                filesize += f1.length();
            }
        }
        return filesize;
    }
}



