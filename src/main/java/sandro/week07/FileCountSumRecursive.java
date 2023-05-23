package sandro.week07;

import lukas.week03.day4.Colors;

import java.io.File;

public class FileCountSumRecursive {
    public static void main(String[] args) {
        File start = new File("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\sandro\\");
        printRecrusive("    ", start);
    }

    public static void printRecrusive(String space, File f) {
        String fileSizeAsText = String.format("%7d", f.length());
        if (!f.isFile()){
            fileSizeAsText = " ".repeat(fileSizeAsText.length());
        }

        System.out.printf("%s %s%s%s%s\n",
                fileSizeAsText,
                space,
                (f.isFile() ? Colors.COLORS[1] : Colors.COLORS[4]),
                f.getName(),
                Colors.RESET
                );

/*
        System.out.println(space +
                (f.isFile() ? Colors.COLORS[1] : Colors.COLORS[4]) +
                f.getName() + f.length() +
                (f.isFile() ? Colors.RESET : ""));
 */
        if (f.isFile()) {
            return;
        }

        File[] files = f.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File fi : files) {
                printRecrusive(space + "    ", fi);
            }
        }
        int count = countFilesRecursive(f);
        long sum = sumOfFilesRecursive(f);

        System.out.println(Colors.COLORS[5]);
        System.out.println("-D-A-T-A- - -A-N-A-L-Y-S-");
        System.out.println("Found: " + Colors.COLORS[3] + count + Colors.COLORS[5] + " files in the path: " + Colors.COLORS[3] + f.getName());
        System.out.println(Colors.COLORS[5] + "Size of all found files is: " + Colors.COLORS[3] + sum + Colors.COLORS[5] + " bytes.");
        System.out.println(Colors.RESET);
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
    public static long sumOfFilesRecursive(File f) {
        File[] files = f.listFiles();
        long sum = 0;
        if (files != null) {
            for (File fi : files) {
                if (fi.isFile()) {
                    sum += fi.length();
                } else if (fi.isDirectory()) {
                    sum += sumOfFilesRecursive(fi);
                }
            }
        }
        return sum;
    }

    public static int countFilesRecursive(File f) {
        File[] files = f.listFiles();
        int count = 0;
        if (files != null) {
            for (File fi : files) {
                if (fi.isFile()) {
                    count++;
                } else if (fi.isDirectory()) {
                    count += countFilesRecursive(fi);
                }
            }
        }
        return count;
    }
}
