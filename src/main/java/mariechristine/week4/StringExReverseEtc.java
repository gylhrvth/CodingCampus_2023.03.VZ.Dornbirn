package mariechristine.week4;

import java.util.Random;
import java.util.Scanner;

public class StringExReverseEtc {

    static Random ranWord = new Random();

    public static void main(String[] args) {

        System.out.println("Willkommen zum Reverseprogramm!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib ein beliebiges Wort ein: ");
        String inputText = sc.nextLine();

        String text = reverseString(inputText);
        System.out.println("Das umgedrehte Word lautet: " + text);

        System.out.println("\n========================================================\n");


        System.out.println("Willkommen zum Zufallsshuffle-Programm!");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Gib ein beliebiges Wort ein: ");
        String inputText1 = sc1.nextLine();

//        String inputText1 = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        String text1 = randomize(inputText1);
        System.out.println("Das Shuffle-Wort lautet nun: " + text1);

    }

    public static String reverseString(String text) {
        char[] charArray = text.toCharArray(); //Zerlegt einen String und gibt ihn als einzelne Buchstaben Arrays zurück
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return new String(charArray);
    }


    public static String randomize(String text1) {
        char[] charArray = text1.toCharArray();

        for (int round = 0; round < 3 * text1.length() + 10; round++) {

            int i = ranWord.nextInt(charArray.length);
            int j = ranWord.nextInt(charArray.length);

            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

        }

        return new String(charArray);

    }



}




