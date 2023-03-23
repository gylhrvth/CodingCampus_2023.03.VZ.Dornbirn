package sandro.week03;

import java.util.Scanner;

public class TicTacToe3 {
    public static void main(String[] args) {

    }
    public static boolean hasWon(char[][] board, char player) {

        // Check if the player has won
//        if
//            return true;
//
//        else {

            return false;
        }


    public static boolean boardFull(char [][] board) {

//        if
//            return true;
//
//        else {

            return false;
        }

    public static void displayBoard(int[][] matrix) {
        for (int irow = 0; irow < matrix.length; irow++) {
            System.out.println("---");
            for (int icol = 0; icol < matrix[irow].length; icol++) {
                System.out.print(" | " +matrix[irow][icol]);

            }
            System.out.println(" |");
        }
    }
    public static void displayBoard2(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");

    }
    public static int readinput(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Wähle eine Zahl zwischen " + minValue + " und " + maxValue + " um fort zu fahren");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Deine Zahl ist ungültig!!!");
            }
        }
        return value;
    }
}
