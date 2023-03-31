package mariechristine.week4;

import data.Texts;

import java.util.Arrays;

public class Hesse {
    public static void main(String[] args) {

        String text = Texts.HESSE;
        System.out.println(text);

        String wantedWord = "Hesse";
        System.out.println(text.indexOf(wantedWord));
        int index = text.indexOf(wantedWord, text.indexOf(wantedWord) + 1);
        System.out.println(index);

    }

//        characterNumber(text);


    public static void characterNumber(String text) {
        char[] charArray = text.toCharArray();
        int[] charToCount = new int[7000];

        for (int i = 0; i < text.length(); i++) {
            char index = text.charAt(i);
            ++charToCount[index];

        }
    }

    public static void countStrings(String text, String wantedWord, int index) {
        for (int i = 0; i < text.length(); i++) {


        }
    }
}


