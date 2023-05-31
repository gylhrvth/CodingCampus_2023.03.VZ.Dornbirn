package mariechristine.week12.filesystem;

import lukas.week03.day4.Colors;

import java.io.*;

public class FileSystemTraversal {
    public static void main(String[] args) {
        File startFile = new File("src/main/java/mariechristineXX");

        try {
            navigateRecursive(startFile);
        } catch (FileNotFoundException e) {
            System.out.println(Colors.COLORS[1] + "NOT FOUND:\n"  + Colors.RESET + e.getMessage());
        }

    }

    public static void navigateRecursive(File startFile) throws FileNotFoundException {
        if (!startFile.exists()) {
            throw new FileNotFoundException(startFile.getAbsolutePath());
        }

        navigateRecursive("", startFile, false);
    }

    private static void navigateRecursive(String prefix, File startFile, boolean lastFile) {
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

