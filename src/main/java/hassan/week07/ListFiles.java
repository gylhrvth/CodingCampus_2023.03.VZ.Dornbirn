package hassan.week07;

import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public static void main(String[] args) {
        //ERSTE AUFGABE
//        File directory = new File("/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/hassan");
//        String[] files = directory.list();
//        for (String file : files) {
//            System.out.println(file);
//        }


        File directory = new File("/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/hassan");
        listFiles(directory);
    }

    public static void listFiles(File directory) {
        // Liste aller Dateien und Verzeichnisse im aktuellen Verzeichnis
        File[] files = directory.listFiles();

        Arrays.sort(files);

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName() + "/");
                listFiles(file); // Rekursiver Aufruf für Unterverzeichnisse
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
