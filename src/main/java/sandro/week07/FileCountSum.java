package sandro.week07;

import java.io.File;

public class FileCountSum {
    public static void main(String[] args) {
        File start = new File("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn");
        File[] inhalt = start.listFiles();
        int count = getFilesCount(inhalt);
        long sumSize = getFilesSizeSum(inhalt);
        printList(inhalt, count, sumSize);


    }

    public static void printList(File[] arr, int count, long sumSize) {
        int countFiles = count;
        long sumFileSize = sumSize;

        int nr = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isFile()) {
                System.out.println(nr + ".) " + arr[i].getName() + "  --  " + arr[i].length());
                nr++;

            }
        }
        System.out.println("files count: " + countFiles);
        System.out.println("sum of size: " + sumFileSize);
    }

    public static long getFilesSizeSum(File[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isFile()) {
                sum += arr[i].length();
            }
        }
        return sum;
    }

    public static int getFilesCount(File[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isFile()) {
                count++;
            }
        }
        return count;
    }

}
