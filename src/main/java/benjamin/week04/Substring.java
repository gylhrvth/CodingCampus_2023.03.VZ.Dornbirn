package benjamin.week04;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert String 1: ");
        System.out.println(">>>>");
        String word1 = sc.nextLine();
        System.out.println("Insert String 2: ");
        System.out.println(">>>>");
        String word2 = sc.nextLine();
        printSubstring(word1, word2);
    }

    public static String printSubstring(String word1, String word2){
        String longestString = "";
        for (int i = 0; i < word1.length(); i++) {
            for (int j = i; j < word1.length(); j++) {
                String sub = "";
                for (int k = i; k <= j; k++) {
                    sub += word1.charAt(k);
                }
                if (word2.contains(sub) && longestString.length() < sub.length()) {
                    longestString = sub;
                }
            }
        }
        System.out.println(">>>" + longestString);

        return longestString;
    }

}


