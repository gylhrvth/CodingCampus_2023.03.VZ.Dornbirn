package sandro.week11.casino.blackjack;

import lukas.week03.day4.Colors;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static Random rand = new Random();
    public static int NOCARD = -1;
    public static void main(String[] args) {
        System.out.println("Hello");

        int bet = readInt("place your bet");
        int[] deck = initDeck();
        shuffleDeck(deck);
        int[] handPlayer = initHand();
        int[] handBank = initHand();
        boolean winner = false;





        while (!winner){

            drawCard(handBank,deck);
            printHandStart("Bank",handBank);
            drawCard(handPlayer,deck);
            drawCard(handBank,deck);
            drawCard(handPlayer,deck);
            printHand("Sandro", handPlayer);





            break;
        }



    }
    public static void printHandStart(String owner, int[] hand){
        System.out.print(owner + ": ");
        int index = 0;
            System.out.print(getCardName(hand[index]) + " , Covered Card");
            System.out.println(" (Value: " + getHandValue(hand) + ")");
    }

    public static void printHand(String owner, int[] hand){
        System.out.print(owner + ": ");
        int index = 0;
        while (index < hand.length && hand[index] != NOCARD){
            if (index > 0) {
                System.out.print(", ");
            }
            System.out.print(getCardName(hand[index]));
            ++index;
        }
        System.out.println(" (Value: " + getHandValue(hand) + ")");
    }


    public static int[] initDeck(){
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffleDeck(int []deck){
        for (int i = 0; i < 5*deck.length; i++) {
            int swapL = rand.nextInt(deck.length);
            int swapR = rand.nextInt(deck.length);

            int temp = deck[swapL];
            deck[swapL] = deck[swapR];
            deck[swapR] = temp;
        }
    }

    public static int[] initHand(){
        int[] hand = new int[52];
        for (int i = 0; i < hand.length; i++) {
            hand[i] = NOCARD;
        }
        return hand;
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
    public static void drawCard(int[] hand, int[] deck){
        int indexHand = 0;
        int indexDeck = 0;
        while (indexHand < hand.length && hand[indexHand] != NOCARD){
            ++indexHand;
        }
        while (indexDeck < deck.length && deck[indexDeck] == NOCARD){
            ++indexDeck;
        }
        hand[indexHand] = deck[indexDeck];
        deck[indexDeck] = NOCARD;
    }

    public static String getCardName(int card){
        String[] consoleColor = {Colors.COLORS[5], Colors.COLORS[4],Colors.COLORS[1], Colors.COLORS[0]};
        String[] colors = {"Club", "Diamond", "Heart", "Spade"};
        String[] figure = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        return consoleColor[card / 13] + figure[card % 13] + " of " + colors[card / 13] + Colors.RESET;
    }

    public static int getHandValue(int[] hand){
        int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int countAces = 0;
        int value = 0;

        int index = 0;
        while (index < hand.length && hand[index] != NOCARD){
            value += values[hand[index] % 13];
            if (hand[index] % 13 == 0){
                ++countAces;
            }
            ++index;
        }
        while ((value > 21) && (countAces > 0)){
            value -= 10;
            --countAces;
        }

        return value;
    }
}


