package eric.week04;

import java.util.Arrays;
import java.util.Scanner;

public class LongestString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Bitte gib ein Satz ein!");
//        String scInput = sc.nextLine();
//
//        System.out.println("Bitte gib einen Zweiten Satz ein!");
//        String scInput2 = sc.nextLine();

        String scInput = "Wie gehts dir Heute?";
        String scInput2 = "Mir gehts heute gut und dir?";

        greatestInputLength(scInput, scInput2);
    }

    public static String greatestInputLength(String scInput, String scInput2) {
        String longestStr;
        if (scInput.length() > scInput2.length())
            longestStr = scInput;
        else longestStr = scInput2;

        String shortestStr;
        if (scInput.length() > scInput2.length())
            shortestStr = scInput;
        else shortestStr = scInput2;

        int maxLength = 0;
        String longScInput = "";

        for (int i = 0; i < longestStr.length(); i++) {
            for (int j = 0; j < longestStr.length(); j++) {
                String subString = longestStr.substring(i, j);
                if (longestStr.contains(subString) && subString.length() > maxLength){
                    maxLength = subString.length();
                    longScInput = subString;
                }
            }
        }
        return longestStr;
    }
}
