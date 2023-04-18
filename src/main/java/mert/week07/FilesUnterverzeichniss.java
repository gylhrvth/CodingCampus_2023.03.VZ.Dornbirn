package mert.week07;

import java.io.File;

public class FilesUnterverzeichniss {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\duelg\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mert\\");
        printDirectory("", f1);
    }

    public static void printDirectory(String indent, File start){
        File[] liste = start.listFiles();
        for (File datei : liste) {
            System.out.println(indent + datei.getName());
            if (datei.isDirectory()){
                printDirectory(indent + "    ", datei);
            }
        }
    }
}
