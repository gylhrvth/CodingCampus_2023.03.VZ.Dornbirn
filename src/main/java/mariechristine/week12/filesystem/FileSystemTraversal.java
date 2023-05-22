package mariechristine.week12.filesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSystemTraversal {
    public static void main(String[] args) {
        File startFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mariechristine");

        navigateRecursive("", startFile, false);

    }

    public static void navigateRecursive(String prefix, File startFile, boolean lastFile) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file directory: ");
        sc.nextLine();
        try {
            sc = new Scanner(new FileInputStream(startFile));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }


        System.out.println(prefix + (lastFile ? "└── " : "├── ") + startFile.getName());

        if (startFile.isDirectory()) {
            File[] content = startFile.listFiles();
            for (int i = 0; i < content.length; i++) {
                File f = content[i];
                String newPrefix = (lastFile ? "    " : "│   ");

                if (i != content.length - 1) {
                    navigateRecursive(prefix + newPrefix, f, false);
                } else {
                    navigateRecursive(prefix + newPrefix, f, true);
                }
            }
        }
    }
}

