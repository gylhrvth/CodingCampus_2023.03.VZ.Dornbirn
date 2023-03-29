package sandro.week04;

import java.util.Arrays;

public class StringCountChars {
    public static void main(String[] args) {
        String text = data.Texts.getMobyDick();

        System.out.println("Len: " + text.length());
//        countChars3(text);

        int[] count = countByGyula(text);
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0){
                System.out.println((char)i + " (" + i + ") = " + count[i]);
            }
        }

/*
//        System.out.println(text);
        int[] count = countChars(text);

        for (char c = 0; c <= 255; c++) {
            System.out.print(c);
        }
        System.out.println();
*/
    }

    public static int[] countByGyula(String input){
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            ++count[input.charAt(i)];
        }
        return count;
    }

    public static int[] countChars(String input) {
        char[] chars = input.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            char c = input.charAt(i);
            System.out.println(c);
        }

        return new int[]{};
    }

    public static int[] countChars3(String input) {
        for (char c = 0; c < Character.MAX_VALUE; c++) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (c == input.charAt(i)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(c + " = " + count);
            }
        }
        return new int[]{};
    }

    public static int[] countChars2(String input) {
        int count = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (char c = 0; c <= 255; c++) {
                if (c == chars[i]) {
                    count++;
                }


//                System.out.println(chars[i] + " " + (int) chars[i]);
            }
            System.out.println(count);
        }
        return new int[]{};
    }



//    String text = "Hello World!"; // = data.Texts.getSimpleText();
//
//        System.out.println(text);
//    int[] count = countChars(text);
//
//    int[] count2 = new int[256];
//        for (char c = 0; c < count2.length; c++) {
//        count2[c] = rand.nextInt();
//    }
//        for (char c = 0; c < count2.length; c++) {
//        System.out.println(c + " " + (int)c + " " + count2[c]);
//    }
//        System.out.println();
}
