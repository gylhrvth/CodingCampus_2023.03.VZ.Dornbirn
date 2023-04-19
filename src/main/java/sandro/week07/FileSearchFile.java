package sandro.week07;

import java.io.File;
import java.util.Scanner;

public class FileSearchFile {
    public static void main(String[] args) {
        // String path = inputPath();
        File start = new File("C:\\");
        // String search = inputSearch();
        String search = "sanDro";

        printFile(start,search);

    }

    public static void printFile(File f, String search) {
        if (f.isFile() && f.getAbsolutePath().toLowerCase().contains(search.toLowerCase())) {
            System.out.println("FileName: " + f.getName() + " Path to File: " + f.getAbsolutePath());
        }
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null){
                for (File fi:files) {
                    printFile(fi,search);
                }
            }
        }
    }

    public static String inputPath() {
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

    public static String inputSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word to search: ");
        return sc.nextLine();
    }
}
