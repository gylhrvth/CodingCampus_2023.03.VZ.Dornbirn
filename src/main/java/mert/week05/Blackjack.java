package mert.week05;

import java.util.Arrays;
import java.util.Random;

public class Blackjack {
    static Random rand = new Random();

    public static void main(String[] args) {
        int karten = 52;
        int figure = 13;
        int color = 4;

        String[] FIGURES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};


    }

    public static void mischeDeck(int[] deck) {
        for (int i = 0; i < 52 - 1; i++) {
            int j = rand.nextInt(52 - i) + i;
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        System.out.println(Arrays.toString(deck));
    }

    public static int getColor(int cardValue) {
        return cardValue / 13;
    }

    public static int getFigure(int cardValue) {
        return cardValue % 13;
    }
}
