package gyula.week07;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File[] fileList = {
            new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula/week07/FileExample.java"),
            new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula"),
            new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula/week07/notexisting.java")
        };

        System.out.println("Meine File System Information");
        for (File f: fileList) {
            System.out.println("Name:      " + f.getName());
            System.out.println("Path:      " + f.getAbsolutePath());
            System.out.println("Exists:    " + f.exists());
            System.out.println("Directory: " + f.isDirectory());
            System.out.println("Length:    " + f.length());
            System.out.println("\n");
        }
    }
}
