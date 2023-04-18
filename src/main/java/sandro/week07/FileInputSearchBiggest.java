package sandro.week07;

import lukas.week03.day4.Colors;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputSearchBiggest {
    public static void main(String[] args) {
        String path = inputPath("Please enter a Path...");
        File start = new File(path);

        long bigFile = biggestFileSize(start);
        printFilesAndData("", start);
        printRelativ(start,start,bigFile);
        printAbsolute(start,bigFile);
        printFileName(start,bigFile);


        //        System.out.println("========================");
        //        printPathAndSizeByGyula(start, start, bigFile);
        //        printPath(start,start);
    }

    public static void printFilesAndData(String space, File f) {
        String fileSizeAsText = String.format("%7d", f.length());
        if (!f.isFile()) {
            fileSizeAsText = " ".repeat(fileSizeAsText.length());
        }
        System.out.printf("%s %s%s%s%s\n",
                fileSizeAsText,
                space,
                (f.isFile() ? Colors.COLORS[1] : Colors.COLORS[4]),
                f.getName(),
                Colors.RESET);
        if (f.isFile()) {
            return;
        }
        File[] files = f.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printFilesAndData("   ", a);
            }
        }

        long biggestFileFound = biggestFileSize(f);

        System.out.println(Colors.COLORS[2]);
        System.out.println("-D-A-T-A- - -A-N-A-L-Y-S-");
        System.out.println(Colors.COLORS[2] + "Size of the biggest File is : " + Colors.COLORS[3] + biggestFileFound + Colors.COLORS[2] + " bytes.");
        System.out.print(Colors.RESET);


    }
    public static void printAbsolute(File current, long fileSizeToPrint) {
        if (current.isFile() && current.length() == fileSizeToPrint) {

            System.out.println(Colors.COLORS[2] + "The absolute Path for the biggest Size File is: " + Colors.COLORS[1] + current.getAbsolutePath() + Colors.RESET);
            return;
        }
        File[] files = current.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printAbsolute(a, fileSizeToPrint);
            }
        }
    }
    public static void printRelativ(File start, File current, long fileSizeToPrint) {
        if (current.isFile() && current.length() == fileSizeToPrint) {
            Path startPath = Path.of(start.getAbsolutePath());
            Path currentPath = Path.of(current.getAbsolutePath());
            System.out.println(Colors.COLORS[2] + "The relative Path for the biggest Size File is: " + Colors.COLORS[1] + startPath.relativize(currentPath) + Colors.RESET);
            return;
        }
        File[] files = current.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printRelativ(start, a, fileSizeToPrint);
            }
        }
    }
    public static void printFileName(File current, long fileSizeToPrint) {
        if (current.isFile() && current.length() == fileSizeToPrint) {
            System.out.println(Colors.COLORS[2] + "The FileName for the biggest Size File is: " + Colors.COLORS[1] + current.getName() + Colors.RESET);
            return;
        }
        File[] files = current.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printFileName(a, fileSizeToPrint);
            }
        }
    }

    public static void printRelativPath(File start, File current, long fileSizeToPrint) {
        if (current.isFile() && current.length() == fileSizeToPrint) {
            String fileSizeAsText = String.format("%7d", current.length());
            if (!current.isFile()) {
                fileSizeAsText = " ".repeat(fileSizeAsText.length());
            }

            Path startPath = Path.of(start.getAbsolutePath());
            Path currentPath = Path.of(current.getAbsolutePath());

            System.out.printf("%s %s%s%s\n",
                    fileSizeAsText,
                    (current.isFile() ? Colors.COLORS[1] : Colors.COLORS[4]),
                    startPath.relativize(currentPath),
                    Colors.RESET);

            return;
        }
        File[] files = current.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printRelativPath(start, a, fileSizeToPrint);
            }
        }
    }

    public static void myMagicSort(File[] f) {
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f.length - i - 1; j++) {
                if (
                        (f[j].isFile() && !f[j + 1].isFile())
                                || ((f[j].isFile() == f[j + 1].isFile()) && f[j].compareTo(f[j + 1]) > 0)
                ) {
                    File temp = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = temp;
                }

            }
        }
    }

    public static long biggestFileSize(File f) {
        File[] files = f.listFiles();
        long biggestSize = 0;
        if (files != null) {
            for (File a : files) {
                long tempSize = 0;
                if (a.isFile() && a.length() > biggestSize) {
                    tempSize = a.length();
                } else if (a.isDirectory()) {
                    tempSize = biggestFileSize(a);
                }
                if (tempSize > biggestSize) {
                    biggestSize = tempSize;
                }
            }
        }
        return biggestSize;
    }

    public static long biggestFileSizeByGyula(File f) {
        if (f.isFile()) {
            return f.length();
        }
        File[] files = f.listFiles();
        long biggestSize = 0;
        if (files != null) {
            for (File a : files) {
                long tempSize = biggestFileSizeByGyula(a);
                if (tempSize > biggestSize) {
                    biggestSize = tempSize;
                }
            }
        }
        return biggestSize;
    }


    private static String inputPath(String text) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Path: ");
            String path = sc.nextLine();
            File directory = new File(path);
            if (directory.isDirectory()) {
                return path;
            } else {
                System.out.println(path + " not found");
            }
        }
    }


    public static String biggestFilePath(File start) {
        if (start.isFile()) {
            return start.getName();
        }
        File[] files = start.listFiles();
        long biggestSize = 0;
        String path = "";
        if (files != null) {
            for (File a : files) {
                long tempSize = biggestFileSizeByGyula(a);
                if (tempSize > biggestSize) {
                    biggestSize = tempSize;

                    Path startPath = Path.of(start.getAbsolutePath());
                    Path aPath = Path.of(a.getAbsolutePath());

                    path = startPath.relativize(aPath).toString();
                }
            }
        }
        return path;
    }

    public static void printPath(File start, File current) {
        Path startPath = Path.of(start.getAbsolutePath());
        Path currentPath = Path.of(current.getAbsolutePath());

        if (current.isFile()) {
            return;
        }
        File[] files = start.listFiles();
        long biggestSize = 0;

        if (files != null) {
            for (File a : files) {
                long tempSize = biggestFileSizeByGyula(a);
                if (tempSize > biggestSize) {
                    biggestSize = tempSize;
                    System.out.println(startPath.relativize(currentPath));
                }
            }
        }

    }

    public static void printPathAndSizeByGyula(File start, File current) {
        String fileSizeAsText = String.format("%7d", current.length());
        if (!current.isFile()) {
            fileSizeAsText = " ".repeat(fileSizeAsText.length());
        }

        Path startPath = Path.of(start.getAbsolutePath());
        Path currentPath = Path.of(current.getAbsolutePath());

        System.out.printf("%s %s%s%s\n",
                fileSizeAsText,
                (current.isFile() ? Colors.COLORS[1] : Colors.COLORS[4]),
                startPath.relativize(currentPath),
                Colors.RESET);
        if (current.isFile()) {
            return;
        }
        File[] files = current.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printPathAndSizeByGyula(start, a);
            }
        }
    }

    public static void printPathAndSizeByGyula(File start, File current, long fileSizeToPrint) {
        if (current.isFile() && current.length() == fileSizeToPrint) {
            String fileSizeAsText = String.format("%7d", current.length());
            if (!current.isFile()) {
                fileSizeAsText = " ".repeat(fileSizeAsText.length());
            }

            Path startPath = Path.of(start.getAbsolutePath());
            Path currentPath = Path.of(current.getAbsolutePath());

            System.out.printf("%s %s%s%s\n",
                    fileSizeAsText,
                    (current.isFile() ? Colors.COLORS[1] : Colors.COLORS[4]),
                    startPath.relativize(currentPath),
                    Colors.RESET);

            return;
        }
        File[] files = current.listFiles();
        if (files != null) {
            myMagicSort(files);
            for (File a : files) {
                printPathAndSizeByGyula(start, a, fileSizeToPrint);
            }
        }
    }
}
