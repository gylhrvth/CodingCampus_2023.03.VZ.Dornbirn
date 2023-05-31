package sandro.week12.Traversal;

import lukas.week03.day4.Colors;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\sandro\\";
        File start = existenceOFPath(path);
        printRecrusive("", start, true);


    }

    public static File existenceOFPath(String path) {
        File start = new File(path);

        if (!start.exists()) {
            try {
                throw new FileNotFoundException(path +"<---Path does not Exist!");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return start;
    }

    public static void printRecrusive(String space, File f, boolean last) {
        if (!last) {
            System.out.println(space + "├──" + (f.isFile() ? Colors.COLORS[1] : Colors.COLORS[4])
                    + f.getName() + Colors.RESET);
        } else {
            System.out.println(space + "└──" + (f.isFile() ? Colors.COLORS[1] : Colors.COLORS[4])
                    + f.getName() + Colors.RESET);
        }
        if (f.isFile()) {
            return;
        }
        File[] files = f.listFiles();
        if (files != null) {
            myMagicSort(files);
//            for (File fi : files) {
            for (int i = 0; i < files.length; i++) {
                String newPrefix = space + (last ? "    " : "│   ");
                if (i + 1 < files.length) {
                    printRecrusive(newPrefix, files[i], false);
                } else {
                    printRecrusive(newPrefix, files[i], true);
                }
            }
        }

    }

    public static void myMagicSort(File[] files) {
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < files.length - i - 1; j++) {
                if ((files[j].isFile() && !files[j + 1].isFile()) || ((files[j].isFile() == files[j + 1].isFile()) && files[j].compareTo(files[j + 1]) > 0)) {
                    File temp = files[j];
                    files[j] = files[j + 1];
                    files[j + 1] = temp;
                }
            }
        }
    }
}
