package mariechristine.week12.filesystem;

import java.io.File;

public class FileSystemNew {
    public static void main(String[] args) {
        File startFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mariechristine");

        recursiveNavigation(startFile);

    }
    public static void recursiveNavigation(File startFile) {
        System.out.println(startFile.getName());
    }
}
