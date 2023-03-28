package mariechristine.week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringExReverseEtc {
    public static void main(String[] args) {

//        String[] words = new String[]{"Hello"};

        System.out.println("Willkommen zum Reverseprogramm!");
        myReadString("Gib ein beliebiges Wort ein: ");
        reverseWordInput("Hello");



    }

    public static void myReadString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        sc.nextLine();

    }

    public static void reverseWordInput(String varWord) {
        varWord.toCharArray();


    }
}

