package sandro.week07;

import java.io.File;
import java.util.Arrays;

public class FileListDirectory {
    public static void main(String[] args) {

        File startVerzeichnis = new File("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\");
        File[] inhalt = startVerzeichnis.listFiles();

        for (File f: inhalt) {
            if (f.isDirectory()){
                System.out.print("Dir * ");
            } else {
                System.out.print("File- ");
            }
            System.out.println(" " + f.getName());
        }

        //System.out.println(Arrays.toString(startVerzeichnis.list()));


    }
//public static String [] listFiles (File list){
//
//
//return ;
//}


}
