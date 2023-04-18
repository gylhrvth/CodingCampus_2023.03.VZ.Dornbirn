package mariechristine.week7;

import java.io.File;
import java.util.Arrays;

public class FilesExercises {
    public static void main(String[] args) {

/*        File[] fileList = {
                new File("/Users/DCV/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/mariechristine/week2/Riddle.java"),
                new File("/Users/DCV/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/mariechristine"),
                new File("/Users/DCV/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/mariechristine/week2/NotExisting.java")
        };

        System.out.println("My file information");
        for (File f : fileList) {
            System.out.println("Name: " + f.getName());
            System.out.println("Path: " + f.getAbsolutePath());
            System.out.println("Exists: " + f.exists());
            System.out.println("Directory: " + f.isDirectory());
            System.out.println("File: " + f.isFile());
            System.out.println("Lenght: " + f.length());
            System.out.println("Hidden: " + f.isHidden());
            System.out.println("\n");

        }
*/

/*        File startVerzeichnis = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\");
        System.out.println("Verzeichnis: " + startVerzeichnis.getAbsolutePath());
        System.out.println("Aufgabe: Verzeichnis auflisten");
        File[] inhalt = startVerzeichnis.listFiles();
        for (File f: inhalt) {
            if (f.isDirectory()){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            System.out.println(f.getName() + " " + f.length());
        }
*/
        System.out.println("\nBonusaufgabe: Verzeichnis auflisten in Reihenfolge");
        File file2 = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\");
        System.out.println("Verzeichnis " + file2.getAbsolutePath());

        File[] inhalt2 = file2.listFiles();
        // TODO: 17.04.2023 sort array

        int[] sortFile = new int[inhalt2.length];
        for (int i = 0; i < sortFile.length; i++) {
            sortFile[i] = sortFile.length - i; {
                System.out.println("Sort file length: " + file2.length());
            }

        }

        for (File f : inhalt2) {
            if (f.isDirectory()){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            System.out.println(f.getName() + ": " + f.length());


        }

    }

}
