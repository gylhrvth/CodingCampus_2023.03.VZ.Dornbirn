package mariechristine.week2;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {

        riddleGreeting("Willkommen beim super coolen Zahlenspiel!\nErrate die Zahl zwischen 0 und 100!\nGib die Zahl nun ein:");
    }

    public static String riddleGreeting(String text) {
        Scanner guess = new Scanner(System.in);
        System.out.println(text);
        return guess.nextLine();
    }

}
