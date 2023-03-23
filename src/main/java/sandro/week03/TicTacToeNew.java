package sandro.week03;

import java.util.Scanner;

public class TicTacToeNew {
    public static void main(String[] args) {



        int [][] matrix = new int [3][3];
        for (int iRow = 0; iRow < matrix.length; iRow++) {
            for (int iCol = 0; iCol < matrix[iRow].length; iCol++) {
                matrix [iRow][iCol]= 0;
            }
        }         printBoard(matrix);

    }

//    public static int[][] createArray(){
//        return;
//    }
    public static void printBoard(int[][] matrix) {
        for (int irow = 0; irow < matrix.length; irow++) {
            System.out.println(" -------------");
            for (int icol = 0; icol < matrix[irow].length; icol++) {
                System.out.print(" | " +matrix[irow][icol]);

            }
            System.out.println(" |");

        } System.out.println(" -------------");
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
    public static boolean boardFull(char [][] board) {
        // Check if board is Full (9 pieces or, no 0 values)
//        if
//            return true;
//
//        else {

        return false;
    }
    public static boolean hasWon(char[][] board, char player) {

        // Check if the player has won
//        if
//            return true;
//
//        else {

        return false;
    }
}


