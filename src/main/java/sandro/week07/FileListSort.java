package sandro.week07;

import java.io.File;

public class FileListSort {
    public static void main(String[] args) {
        File start = new File("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn");
        File[] inhalt = start.listFiles();

        myMagicBubbleSortSizeDesc(inhalt);
        printList(inhalt);


    }

    public static void myMagicBubbleSortSizeDesc(File[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1].isDirectory() && !arr[j].isDirectory()
                    || (arr[j + 1].isDirectory() && arr[j].isDirectory() && arr[j].compareTo(arr[j + 1]) > 0)
                    || (!arr[j].isDirectory() && arr[j].length() < arr[j + 1].length())) {
                    File temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printList(File[] arr) {
        System.out.println("---------------");
        for (File f : arr) {
            if (f.isDirectory()) {
                System.out.printf("dir * %-30s size: %7d\n", f.getName(), f.length());
            } else {
                System.out.printf("file- %-30s size: %7d\n", f.getName(), f.length());
            }
        }
    }
}
