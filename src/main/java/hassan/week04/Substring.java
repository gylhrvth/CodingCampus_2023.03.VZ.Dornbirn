package hassan.week04;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib Wort 1 ein : ");
        String word1 = scanner.nextLine();

        System.out.println("Bitte gin Wort 2 ein : ");
        String word2 = scanner.nextLine();

        String longestSubString = findLongestSubstring(word1, word2);

        System.out.println("längster gemeinsamer Substring: ");
        System.out.println(longestSubString);


    }


    public static String findLongestSubstring(String str1, String str2) {
        //längere und kurze Strings finden
        String longerStr;
        if (str1.length() > str2.length()) longerStr = str1;
        else longerStr = str2;

        String shorterStr;
        if (str1.length() > str2.length()) shorterStr = str2;
        else shorterStr = str1;

        //laängsten Substring
        int maxLength = 0;
        String longestSub = "";

        for (int i = 0; i < shorterStr.length(); i++) {
            for (int j = i + 1; j <= shorterStr.length(); j++) {
                String subString = shorterStr.substring(i, j);
                if (longerStr.contains(subString) && subString.length() > maxLength) {
                    maxLength = subString.length();
                    longestSub = subString;
                }
            }
        }
        return longestSub;
    }
}
