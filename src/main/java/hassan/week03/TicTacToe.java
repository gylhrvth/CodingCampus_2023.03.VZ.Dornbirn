package hassan.week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};  //leerzeichen fur die verfügbare plätze
        int currentPlayer = 1;


        boolean gameOver = false;   //dieser boolean ist da zum schauen ob spiel vorbei ist

        while (!gameOver) {             //in diese schleife printet man den brett solange das spiel nicht vorbei ist


            printBoard(board);
            int[] move = getMove(currentPlayer, board);

            if (currentPlayer == 1) board[move[0]][move[1]] = 'X';        //welcher spieler dran ist,
            else board[move[0]][move[1]] = 'O';


            gameOver = checkWin(board, move[0], move[1]);
            //prüft ob das spiel vorbei ist.
            if (gameOver) {
                System.out.println("Spieler " + currentPlayer + " GEWINNT!");
            } else if (isBoardFull(board)) {                //wenn brett voll ist und niemand gewonnen hat = unentschieden
                System.out.println("UNENTSCHIEDEN!");
                gameOver = true;
            } else {
                if (currentPlayer == 1) currentPlayer = 2;
                else currentPlayer = 1;
            }
        }

    }

    public static void printBoard(char[][] board) {
        //das brett ausdrucken.
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

    public static int[] getMove(int currentPlayer, char[][] board) {
        //abfrage wer dran ist und scanner fur das lesen des feldes
        System.out.println("Spieler " + currentPlayer + "ist dran.");

        int row = -1;
        int column = -1;
        boolean validMove = false;


        while (!validMove) {
            //schauen ob der zug gültig ist oder nicht
            row = readNumberFromConsole("Gib reihe ein (0-2): ");
            column = readNumberFromConsole("Gib Spalte ein (0-2): ");

            //schauen ob der feld schon besetzt ist oder nicht
            if (board[row][column] == ' ') {
                validMove = true;
            } else {
                System.out.println("Ungültiger Zug, bitte erneut versuchen.");
            }
        }
        return new int[]{row, column};
    }

    public static int readNumberFromConsole(String message) {
        int result = -1;
        Scanner scanner = new Scanner(System.in);
        while (result < 0 || result > 2) {
            System.out.print(message);
            try {
                String line = scanner.nextLine();
                result = Integer.parseInt(line);
            } catch (NumberFormatException nfe) {             //das man keine andere ungültige eingaben eingeben kann
                System.out.println("Ungültige eingabe");
            }
        }
        return result;
    }

    public static boolean checkWin(char[][] board, int row, int column) {
        // check reihe nach gewinn
        if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
            return true;
        }

        // check spalte nach gewinn
        if (board[0][column] == board[1][column] && board[1][column] == board[2][column] && board[0][column] != ' ') {
            return true;
        }

        // check diagonal nach gewinn
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
            return true;                                        // unentschieden oben eingebaut
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        //check ob brett voll ist und ob das spiel unentschieden ausgegangen ist
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


}
