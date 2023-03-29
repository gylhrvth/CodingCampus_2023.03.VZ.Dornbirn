package ayguen.week04;

import ayguen.week02.ConsoleInputText;

public class AufgabeReverseRandomize {

    public static void main(String[] args) {
        System.out.println("Willkommen in Reverseprogramm!!!");
        String intput = ConsoleInputText.readText(">>>");
        String reverse = reverseString(intput);
        System.out.println(reverse);
        String randomize = randomizeString(intput);
        System.out.println(randomize);
    }

    public static String reverseString(String input) {
        char[] rev = input.toCharArray();
        for (int i = 0; i < rev.length / 2; i++) {
            char temp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = temp;
        }
        return new String(rev);
    }

    public static String randomizeString(String input) {
        char[] rand = input.toCharArray();
        for (int i = 0; i < rand.length; i++) {
            int randomIndex = (int) (Math.random()* rand.length);
            char temp = rand[i];
            rand[i] = rand[randomIndex];
            rand[randomIndex] = temp;

        }

        return new String (rand);
    }


}
