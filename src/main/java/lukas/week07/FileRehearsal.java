package lukas.week07;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileRehearsal {
    public static void main(String[] args) {
        File root = new File("/tmp/testfolder/");
        System.out.println("Exists: " + root.exists());
        System.out.println("Is directory: " + root.isDirectory());
        System.out.println("Is file: " + root.isFile());

        File[] children = root.listFiles();
        if (children != null) {
            for (File child : children) {
                if (child.isDirectory()) {
                    System.out.print("d ");
                } else {
                    System.out.print("f ");
                }
                System.out.println(child.getName() + " " + child.length());
            }
        }

        System.out.println("---");

        printFolder(0, root);

        File f = new File("/tmp/testfolder/xyz.txt");
        System.out.println("Does " + f.getName() + " exist? " + f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            //noop
        }
        System.out.println("Does " + f.getName() + " exist? " + f.exists());
        f.delete();
        System.out.println("Does " + f.getName() + " exist? " + f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            //noop
        }

        f.renameTo(new File("/tmp/testfolder/abc.txt"));

        String myWorkingDirectory = new File("").getAbsolutePath();
        System.out.println("My current working directory is: " + myWorkingDirectory);

        File newFile = new File(root, "123.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            //noop
        }

        //Copy file the simple way
        try {
            Files.copy(new File(root, "source.txt").toPath(), new File(root, "dest.txt").toPath());
        } catch (IOException e) {
            //noop
        }

        new File(root, "folder3").mkdir();
        System.out.println(new File(root, "folder4/folder44/folder444").mkdirs());

        System.out.println("New line: ");
        for (char c : System.lineSeparator().toCharArray()) {
            System.out.print((int) c + " ");
        }
        System.out.println();
    }

    private static void printFolder(int indention, File file) {
        printIndention(indention);
        System.out.println(file.getName() + " " + file.length());
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                if (child.isDirectory()) {
                    printFolder(indention + 1, child);
                } else {
                    printIndention(indention + 1);
                    System.out.println(child.getName() + " " + child.length());
                }
            }
        }
    }

    private static void printIndention(int indention) {
        for (int i = 0; i < indention; i++) {
            System.out.print("---");
        }
        System.out.print(">");
    }
}
