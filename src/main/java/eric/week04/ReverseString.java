package eric.week04;

import java.util.Scanner;

public class ReverseString {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println("Bitte gib ein Wort ein!");
        String text = sc.nextLine();

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        char[] charArray = text.toCharArray();
        reverse(charArray);
        String reversed = new String(charArray);

        System.out.println("Das Wort umgedreht:" + reversed);

        System.out.println();
        System.out.println("-------------------");
        System.out.println();


        char[] randomizeChar = text.toCharArray();
        randomize(randomizeChar);
        String randomizer = new String(randomizeChar);

        System.out.println("Das Wort Zufällig ausgegeben: " + randomizer);

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

    }


    public static void randomize(char[] charArray) {
        int i = 0;
        int j = charArray.length / 2;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }
    }


//    public static void randomize(char[] charArray) {
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = charArray.length - 1; j - 1 > i; j--) {
//                if (j > i) {
//                    char temp = charArray[i];
//                    charArray[i] = charArray[j];
//                    charArray[j] = temp;
//                }
//            }
//        }
//    }

    public static void reverse(char[] charArray) {
        int i = 0;
        int j = charArray.length - 1;
        while (j > i) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }
    }


}