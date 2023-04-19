package ayguen.week07;

import java.io.File;

public class FileRead {

    public static void main(String[] args) {
        File startVerzeichnis = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\ayguen\\week07");
        System.out.println(startVerzeichnis.getAbsolutePath());

        System.out.println("Count files: " + countFiles(startVerzeichnis));
        System.out.println("Total size : " + sumFileSizes(startVerzeichnis));

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
/*
        for (int i = 0; i < inhalt.length; i++) {
            File singleFile = inhalt[i];
        }
*/

        for (File singleFile : inhalt) {
            System.out.println(singleFile.length());
            if (!singleFile.isDirectory()) {
                //System.out.printf("%10d %s\n", singleFile.length(), singleFile.getAbsolutePath());
                filesize += singleFile.length();
            }
        }
        return filesize;
    }


}






