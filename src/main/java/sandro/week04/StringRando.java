package sandro.week04;

import java.util.Random;
import java.util.Scanner;

public class StringRando {
   public static Random rand = new Random();
    public static void main(String[] args) {



        System.out.println("Willkommen zum Zufallsshuffle Programm!!!111");
        String s = readString("Bitte das gewünschte Wort eingeben");
        String randString = randoMyString(s);

        System.out.println(randString);
    }

    public static String randoMyString(String input) {
        char[] rando = input.toCharArray();

        for (int count = 0; count < 2 * rando.length + 3; count++) {
            int i = rand.nextInt(rando.length);
            int j = rand.nextInt(rando.length);
            char temp = rando[i];
            rando[i] = rando[j];
            rando[j] = temp;
        }

        return new String(rando);
    }
    public static String readString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
