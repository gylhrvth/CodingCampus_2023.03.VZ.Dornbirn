package eric.Week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentplayer = 'X';
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("TicTacToe ist Startbereit!");
        printBoardEmptySpace();
        printBoard();
        while(!gameOver()){
            playerTurn();
            printBoard();
        }
        System.out.println("Das Spiel ist Beendet! Aufwiedersehen!");
    }

    public static void printBoardEmptySpace(){
        for (int emptySpaceI = 0; emptySpaceI < 3; emptySpaceI++) {
            for (int emptySpaceJ = 0; emptySpaceJ < 3; emptySpaceJ++) {
                board[emptySpaceI][emptySpaceJ] = ' ';
            }
        }
    }

    public static void printBoard(){
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void playerTurn(){
        System.out.println("Spieler " + currentplayer + " ist am Zug!");
        int row = 0, col = 0;
        do {

            System.out.println("Gib die Reihe an (-|| 0, 1 oder 2 ||-)");
            System.out.println("0 = Oben Links || 1 = Oben Mitte || 2 = Oben Rechts");


            try {
                row = scan.nextInt();
            } catch (InputMismatchException nfe){
                System.out.println("Gib eine Zahl an wie oben angegeben ist (-|| 0, 1 oder 2 ||-)");
                scan.nextLine();
            }

            System.out.println("Gib die Spalte an (-|| 0, 1 oder 2 ||-)");
            System.out.println("0 = Oben Links || 1 = Mitte Links || 2 = Unten Links");

            try {
                col = scan.nextInt();
            }  catch (InputMismatchException nfe){
                System.out.println("Gib eine Zahl an wie oben angegeben ist (-|| 0, 1 oder 2 ||-)");
                scan.nextLine();
            }

        } while (!validMove(row, col));{
            board[row][col] = currentplayer;
            currentplayer = (currentplayer == 'X') ? '0' : 'X';
        }
    }

    public static boolean validMove(int row, int col){
        if(row < 0 || row > 2 || col < 0 || col > 2) {
            try {
                scan.nextInt();
                System.out.println("Die Zahl die du angegeben hast ist nicht nicht akzeptabel");
            } catch (InputMismatchException ime){
                System.out.println("Versuchs Nochmal!!!");
                scan.nextLine();
            }
            return false;
        }
        if (board[row][col] != ' '){
            System.out.println("Dieses Feld wurde bereits ausgefüllt! Wähle ein anderes aus!");
            return false;
        }
        return true;
    }

    public static boolean gameOver(){
        if (boardIsFull()){
            System.out.println("Die Runde endet in einem Unentschieden!");
            return true;
        }
        if (gameWinner('X')){
            System.out.println("Spieler X hat die Runde Gewonnen!");
            return true;
        }
        if (gameWinner('0')){
            System.out.println("Spieler 0 hat die Runde Gewonnen!");
            return true;
        }
        return false;
    }

    public static boolean gameWinner(char player){
        //Gewinn Abfrage Reihe
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //Gewinn Abfrage Zeilen
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        //Gewinn Abfrage Schräg Rechts runter
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        //Gewinn ABfrage Schräg Rechts hoch
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    public static boolean boardIsFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}
