package sandro.week04;

import java.util.Arrays;

public class StringCountChars {
    public static void main(String[] args) {
        String text = "Hello World!"; // = data.Texts.getSimpleText();

        System.out.println(text);
        int[] count = countChars(text);

        for (char c = 0; c <= 255; c++) {
            System.out.print(c);
        }
        System.out.println();

    }

    public static int[] countChars(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (char c = 0; c <= 255 ; c++) {
            }
            System.out.println(chars[i] + " " + (int)chars[i]);
        }
        return new int[]{};
    }
}
