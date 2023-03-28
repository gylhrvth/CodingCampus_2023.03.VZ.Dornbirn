package sandro.week04;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Willkommen zum ReversProgramm!!!111");
        String s = readString("Bitte das gewünschte Wort eingeben");
        String revString = reverseMyString(s);

        System.out.println(revString);
    }


    public static String reverseMyString(String input) {
        char[] revString = input.toCharArray();
        for (int i = 0; i < revString.length / 2; i++) {
            char temp = revString[i];
            revString[i] = revString[revString.length - 1 - i];
            revString[revString.length - 1 - i] = temp;
        }
        return new String(revString);
    }

    public static String readString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
