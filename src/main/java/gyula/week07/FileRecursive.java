package gyula.week07;

import lukas.week03.day4.Colors;

import java.io.File;
import java.sql.SQLOutput;

public class FileRecursive {
    public static void main(String[] args) {
        File start = new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula");
        printRecursive("", start);
    }

    public static void printRecursive(String indent, File f) {
        System.out.print(indent);
        if (f.isFile()) {
            System.out.print(Colors.COLORS[3]);
        }
        System.out.print(f.getName());
        if (f.isFile()) {
            System.out.print(Colors.RESET);
        }
        System.out.println();
        if (f.isFile()) {
            return;
        }

        File[] files = f.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File fi : files) {
                printRecursive(indent + "    ", fi);
            }
        }

    }

    public static void myMagicSort(File[] files) {
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < files.length - i - 1; j++) {
                if (

                        (files[j].isFile() && !files[j + 1].isFile())
                                || ((files[j].isFile() == files[j + 1].isFile()) && files[j].compareTo(files[j + 1]) > 0)
                ) {
                    File temp = files[j];
                    files[j] = files[j + 1];
                    files[j + 1] = temp;
                }
            }
        }
    }


    public static int countFilesRecursive(File f) {
        return 0;
    }
}
