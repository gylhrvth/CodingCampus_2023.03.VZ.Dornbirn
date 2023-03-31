package sandro.week04;

import data.Texts;
import lukas.week03.day4.Colors;

import java.util.Arrays;
import java.util.Scanner;

public class StringSubString {
    public static void main(String[] args) {


        String text1 = userInput("gib einen Satz ein");
        String text2 = userInput("gib einen zweiten Satz ein");

        String[] arr1 = text1.replaceAll("[^ \\w]", "").split("\\s");
        String[] arr2 = text2.split("\\s");

        int maxFoundLength = 0;
        String maxFoundString = null;
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                String arrtext1 = arr1[i];

                String arrtext2 = arr2[j];

                if (arrtext1.equals(arrtext2)) {
                    count++;
                    int temp = arrtext1.length();

                    if (temp > maxFoundLength) {

                        maxFoundLength = temp;
                        maxFoundString = arrtext1;
                    }
                }
            }
        }
        System.out.println("es gibt "+Colors.COLORS[3] + count + Colors.RESET + " gemeinsame Wörter und das längste davon ist = "+ Colors.COLORS[1] + maxFoundString +Colors.RESET);


//        String[] arr1 = text1.split("\\s");
//        for (String textarr1 : arr1) {
//            System.out.println(textarr1);
//        }
//
//        System.out.println("---------");
//        String[] arr2 = text2.split("\\s");
//        for (String textarr2 : arr2) {
//            System.out.println(textarr2);
//
//        }


    }

    public static String userInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
