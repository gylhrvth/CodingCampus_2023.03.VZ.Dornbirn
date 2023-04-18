package benjamin.week07;

import java.io.File;
import java.util.Arrays;

public class ListFile {
    public static void main(String[] args) {

        File directory = new File("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn");
        File[] fileList = directory.listFiles();

        System.out.println("My File information:");
        for (File file : fileList) {
            if (file.isDirectory()) {
                System.out.println("Direc:   " + "*" + file.getName());
            } else {
                System.out.println("Files:   " + file.getName());
            }
        }
    }
}
