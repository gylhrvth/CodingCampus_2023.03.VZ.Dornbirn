package joachim.week04;

import java.util.Scanner;

public class GemeinsamerSubstring {
    public static void main(String[] args) {
        String text1 = "Eawas! Wie geht Zugfahrer es dir?";
        String text2 = "Eawas! Naja, Zugfahrer geht so.";
        String[] arr1 = split(text1);
        String[] arr2 = split(text2);

        String longestWord = "";

        for (int i = 0; i < arr1.length; i++) {
            String word1 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                String word2 = arr2[j];
                if (word1.equals(word2)) {
                    if (word1.length() > longestWord.length()) {
                        longestWord = word1;
                    }
                }
            }
        }
        System.out.println(longestWord + " is the longest same word");
    }

    public static String[] split(String text) {
        return text.split("[\\s\n,]+");
    }
}
