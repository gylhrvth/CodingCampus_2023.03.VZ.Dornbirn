package mert.week07;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert\\");
        long filesize = 0;
        int anzahlDatei = 0;

        File[] liste = f1.listFiles();
        for (File datei : liste) {
            System.out.println(datei.getName());
            anzahlDatei++;
            filesize += f1.length();
        }
        System.out.println();
        System.out.println("Summe der Größe:  " + filesize);
        System.out.println("Anzahl der Dateien: " + anzahlDatei);
    }

}
