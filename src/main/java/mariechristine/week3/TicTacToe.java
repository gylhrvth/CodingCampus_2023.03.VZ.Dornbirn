package mariechristine.week3;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        System.out.println("Willkommen beim Spiel Tic Tac Toe!\nWer 3 Zeichen in einer Reihe, Spalte oder Diagonale schafft, gewinnt!\nLos geht's!");
        System.out.println();
        int[][] board = new int[3][3];
        int currentPlayer = 1;

        printGameBoard(board);
        System.out.println();
        turnPlayer1("Spieler 1, auf welches Feld machst du dein x?");


        }

    public static void printGameBoard(int[][] board) {
        String[] symbol = new String[]{".", "X", "O"};
        for (int i = 0; i < board.length; i++) {
            if (i > 0){
                System.out.println("     |     |     ");
                System.out.println("-----|-----|-----");
            }
            System.out.println("     |     |     ");
            for (int j = 0; j < board[i].length; j++) {
                if (j > 0){
                    System.out.print("|");
                }
                System.out.print("  " + symbol[board[i][j]] + "  ");
            }
            System.out.println();
        }
        System.out.println("     |     |     ");
    }

    public static String turnPlayer1(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();

    }

    public static int playerAInput(int[] turn) {
        int input1[][] = new int[3][3];
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input1[i].length; j++) {
                input1[i][j] = 'x';
                if (i == 0 || j == 0)
                    System.out.println();
                    }

            }
        return 0;
    }
}
