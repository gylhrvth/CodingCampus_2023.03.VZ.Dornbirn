package eric.week07.datenStroemeExcersice;

import java.io.File;
import java.io.IOException;

public class AufgabeVerzeichnisAuflisten {
    public static void main(String[] args) throws IOException {

        String directoryPath = "C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\";
        File pathNames = new File(directoryPath);

        if (pathNames.exists() && pathNames.isDirectory()){
            File[] files = pathNames.listFiles();

            System.out.println("Liste aller Dateien im Path: ");
            for (File f : files){
                if (f.isFile()){
                    System.out.println("Name: " + f.getName() + f.length());
                    System.out.println();
                }
            }
        } else {
            System.out.println("Das angegebene Verzeichnis existiert Nicht.");
        }
    }
}
