package sandro.week11.casino.blackjack;

import lukas.week03.day4.Colors;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class try2 {
    static Random rand = new Random();

    public static void main(String[] args) {

        int[] deck = new int[52];
        initateDeck(deck);
        System.out.println(Arrays.toString(deck));


//        int card = 45;
//
//        getColor(card);
//        getFigure(card);
//        getValue(card);
//        getValue(card);
//
//
//        System.out.println(getColor(card)+ " " + getFigure(card) + Colors.RESET + " / the Card Value is = " + getValue(card));

        int currentplayer = 1;
        int counter = 0;
        boolean winner = false;
        boolean push = false;
        int[] newDeck = shuffleDeck(deck);
        System.out.println(Arrays.toString(deck));
        System.out.println(Arrays.toString(newDeck));

//        while (!winner && !push){
        int[] playerhand = {newDeck[0], newDeck[1]};
        getValueHand(playerhand);
        System.out.println(getColor(newDeck[0]) +" "+ getFigure(newDeck[0]) + " and " + getColor(newDeck[1])
                +" "+ getFigure(newDeck[1]) + " the Value of the Players Hand is = " + getValueHand(playerhand));

        int[] dealerhand = {newDeck[2], newDeck[3]};
        getValueHand(dealerhand);
        System.out.println(getColor(newDeck[2]) +" "+ getFigure(newDeck[2]) + " and " + getColor(newDeck[3])
                +" "+ getFigure(newDeck[3]) + " the Value of the Dealers Hand is = " + getValueHand(dealerhand));


//        }


    }

    public static int readInt(String message) {
        int result = -1;
        Scanner sc = new Scanner(System.in);
        while (result < 0 || result > 100) {
            System.out.println(message);
            String line = sc.nextLine();
            try {
                result = Integer.parseInt(line);
                if (result < 0 || result > 100) {
                    System.out.println("max bet $100");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("no legal input, please place a new bet");
            }
        }
        return result;
    }

    public static int getValueHand(int[] arr) {
        int valuehand = 0;
        for (int i = 0; i < arr.length; i++) {
            valuehand += getValue(arr[i], 0);
        }

        return valuehand;
    }

    public static void initateDeck(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

    }

    public static int[] shuffleDeck(int[] arrayToCopy) {
        for (int j = 0; j < arrayToCopy.length; j++) {
            int randomIndexToSwap = rand.nextInt(arrayToCopy.length);
            int temp = arrayToCopy[randomIndexToSwap];
            arrayToCopy[randomIndexToSwap] = arrayToCopy[j];
            arrayToCopy[j] = temp;
        }
        return arrayToCopy;
    }


    public static String getColor(int input) {
        String color = "";
        int card = input;
        if (card / 13 == 0) {
            color = Colors.COLORS[4] + "Diamond";
        }
        if (card / 13 == 1) {
            color = Colors.COLORS[0] + "Spade";
        }
        if (card / 13 == 2) {
            color = Colors.COLORS[1] + "Heart";
        }
        if (card / 13 == 3) {
            color = Colors.COLORS[5] + "Club";
        }

        return color;
    }

    public static String getFigure(int input) {
        String figure = "";
        int card = input;
        if (card % 13 == 0) {
            figure = "Ace" + Colors.RESET;
        }
        if (card % 13 == 1) {
            figure = "Two" + Colors.RESET;
        }
        if (card % 13 == 2) {
            figure = "Three" + Colors.RESET;
        }
        if (card % 13 == 3) {
            figure = "Four" + Colors.RESET;
        }
        if (card % 13 == 4) {
            figure = "Five" + Colors.RESET;
        }
        if (card % 13 == 5) {
            figure = "Six" + Colors.RESET;
        }
        if (card % 13 == 6) {
            figure = "Seven" + Colors.RESET;
        }
        if (card % 13 == 7) {
            figure = "Eight" + Colors.RESET;
        }
        if (card % 13 == 8) {
            figure = "Nine" + Colors.RESET;
        }
        if (card % 13 == 9) {
            figure = "Ten" + Colors.RESET;
        }
        if (card % 13 == 10) {
            figure = "Jack" + Colors.RESET;
        }
        if (card % 13 == 11) {
            figure = "Queen" + Colors.RESET;
        }
        if (card % 13 == 12) {
            figure = "King" + Colors.RESET;
        }
        return figure;
    }

    public static int getValue(int input, int valuehand) {
        int value = 0;
        int hand = 0;
        int card = input;
        if (card == 0 || card == 13 || card == 26 || card == 39) {
            if (hand < 21) {
                value = 11;
            } else {
                value = 1;
            }
        }
        if (card == 1 || card == 14 || card == 27 || card == 40) {
            value = 2;
        }
        if (card == 2 || card == 15 || card == 28 || card == 41) {
            value = 3;
        }
        if (card == 3 || card == 16 || card == 29 || card == 42) {
            value = 4;
        }
        if (card == 4 || card == 17 || card == 30 || card == 43) {
            value = 5;
        }
        if (card == 5 || card == 18 || card == 31 || card == 44) {
            value = 6;
        }
        if (card == 6 || card == 19 || card == 32 || card == 45) {
            value = 7;
        }
        if (card == 7 || card == 20 || card == 33 || card == 46) {
            value = 8;
        }
        if (card == 8 || card == 21 || card == 34 || card == 47) {
            value = 9;
        }
        if (card == 9 || card == 22 || card == 35 || card == 48) {
            value = 10;
        }
        if (card == 10 || card == 23 || card == 36 || card == 49) {
            value = 10;
        }
        if (card == 11 || card == 24 || card == 37 || card == 50) {
            value = 10;
        }
        if (card == 12 || card == 25 || card == 38 || card == 51) {
            value = 10;
        }
        return value;
    }

}
