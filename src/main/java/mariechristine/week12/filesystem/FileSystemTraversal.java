package mariechristine.week12.filesystem;

import java.io.File;

public class FileSystemTraversal {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mariechristine");
        File[] inhalt = file.listFiles();
        for (File f : inhalt) {
            if (f.isFile()) {
                System.out.println("* ");
            }
            else {
                System.out.println("  ");
            }
            System.out.println(f.getName());
        }

    }
}
