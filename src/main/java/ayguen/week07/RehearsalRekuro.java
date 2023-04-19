package ayguen.week07;

import lukas.week03.day4.Colors;

import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class RehearsalRekuro {
    Scanner sc = new Scanner(System.in);
    String answer = sc.nextLine();


    public static void main(String[] args) {
        File start = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\ayguen");
        printRecursive("", start);
        System.out.println(sumFileSizes(start));



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
            for (File fi : files) {
                printRecursive(indent + "    ", fi);
            }
        }


    }

    public static long sumFileSizes(File start) {

        if (start.isFile()) {
            return start.length();
        }

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