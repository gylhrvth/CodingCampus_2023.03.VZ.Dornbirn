package ayguen.week07;

import lukas.week03.day4.Colors;

import java.io.File;


public class Rekuro {

    public static void main(String[] args) {
        File start = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\gyula");
        printRecursive("", start);
        System.out.println("Total size: " + sumFileSizes(start));
    }

    public static void printRecursive(String indent, File f) {
        System.out.print(indent);
        if (f.isFile()) {
            System.out.print(Colors.COLORS[2]);
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
                //System.out.println();
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

    public static long sumFileSizes(File start) {
        if (start.isFile()) {
            //System.out.println("File found: " + start.getAbsolutePath());
            return start.length();
        }

        //System.out.println("Verzeichnis bearbeiten: " + start.getAbsolutePath());
        File[] inhalt = start.listFiles();
        long filesize = 0;
        if (inhalt != null) {
            for (File singleFile : inhalt) {
                filesize += sumFileSizes(singleFile);
            }
        }
        return filesize;
    }


    public static int countFilesRecursive(File f) {
        return 0;
    }
}







