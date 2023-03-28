package hassan.week04;

import java.util.Scanner;

public class StringsPartTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Willkommen zum Superprogramm!!!!!");
        System.out.println("Gib ein Wort ein");
        String input = scanner.nextLine();


        String reversed = reverseString(input);
        String shuffled = shuffleString(input);


        System.out.println("Das umgedrehte Wort lautet:  " + reversed);
        System.out.println("---------------------------------");
        System.out.println("Das zufällig vertrauschte Wort lautet: " + shuffled);


    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return new String(charArray);
    }


    public static String shuffleString(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int randomIndex = (int) (Math.random() * charArray.length);
            char temp = charArray[i];
            charArray[i] = charArray[randomIndex];
            charArray[randomIndex] = temp;
        }
        return new String(charArray);
    }


}
