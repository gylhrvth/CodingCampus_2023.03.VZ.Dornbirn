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
        for (int boardDesign = 0; boardDesign < 3; boardDesign++) {
            System.out.print("| ");
            for (int boardDesign2 = 0; boardDesign2 < 3; boardDesign2++) {
                System.out.print(board[boardDesign][boardDesign2] + " | ");

            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void playerTurn() {
        System.out.println("Spieler " + currentplayer + " ist am Zug!");
        int row = -1;
        int col = -1;
        do {
            row = -1;
            col = -1;

            System.out.println("Gib die Reihe an (-|| 0, 1 oder 2 ||-)");
            System.out.println("0 = Oben Links || 1 = Mitte Links || 2 = Unten Links");

            //ROW und COL haben einen Negativen Wert damit jede WHILE { TRY { CATCH { }}} Schleife/Abfrage durchgescannt werden

            while (row < 0 || row > 2) {
                try {
                    row = scan.nextInt();
                    scan.nextLine();
                    if (row < 0) {
                        System.out.println("Bitte eine Nummer größer gleich 0");
                    } else if (row > 2){
                        System.out.println("Bitte eine Nummer kleiner gleich 2");
                    }
                } catch (InputMismatchException nfe) {
                    System.out.println("Gib eine Zahl an wie oben angegeben ist (-|| 0, 1 oder 2 ||-)");
                    scan.nextLine();
                }
            }
            System.out.println("Gib die Spalte an (-|| 0, 1 oder 2 ||-)");
            System.out.println("0 = Oben Links || 1 = Oben Mitte || 2 = Oben Rechts");

            while (col < 0 || col > 2) {
                try {
                    col = scan.nextInt();
                    scan.nextLine();
                    if (col < 0) {
                        System.out.println("Bitte eine Nummer größer gleich 0");
                    } else if (col > 2){
                        System.out.println("Bitte eine Nummer kleiner gleich 2");
                    }
                } catch (InputMismatchException nfe) {
                    System.out.println("Gib eine Zahl an wie oben angegeben ist (-|| 0, 1 oder 2 ||-)");
                    scan.nextLine();
                }
            }
            //Move wird überprüft ob er möglich ist || Wenn JA = Nächster Spieler || Wenn NEIN = validMove = Wähle ein anderes Feld aus
        } while (!validMove(row, col));
        {
            board[row][col] = currentplayer;
            currentplayer = (currentplayer == 'X') ? '0' : 'X';
        }
    }
    public static boolean validMove(int row, int col){
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
