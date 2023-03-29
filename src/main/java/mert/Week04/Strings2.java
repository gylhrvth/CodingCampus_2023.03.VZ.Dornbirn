package mert.Week04;

import java.util.Random;
import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Wilkommen zum Reverseprogramm!!!111");
        System.out.println("Gib ein Wort ein");
        String text = sc.nextLine();

        char[] charArray = text.toCharArray();
        reverse(charArray);
        String reverseee = new String(charArray);

        ramdomize(charArray);
        String random = new String(charArray);


        System.out.println("Das Wort umgedreht  =  " + reverseee);
        System.out.println("Das Wort zufällig  =  " + random);
    }

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


    public static void ramdomize(char[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }
}
