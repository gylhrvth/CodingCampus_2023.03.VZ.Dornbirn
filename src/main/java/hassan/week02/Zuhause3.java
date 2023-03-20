package hassan.week02;

import java.util.Scanner;

public class Zuhause3 {

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        int currentPlayer = 1;
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);
            int[] move = getMove(currentPlayer);
            board[move[0]][move[1]] = (currentPlayer == 1) ? 'X' : 'O';
            gameOver = checkWin(board, move[0], move[1]);
            if (gameOver) {
                System.out.println("Spieler " + currentPlayer + " GEWINNT!");
            } else if (isBoardFull(board)) {
                System.out.println("UNENTSCHIEDEN!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }

    public static void printBoard(char[][] board) {
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

    public static int[] getMove(int currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + currentPlayer + "'s turn.");
        System.out.print("Gib reihe ein (0-2): ");
        int row = scanner.nextInt();
        System.out.print("Gib Spalte ein (0-2): ");
        int column = scanner.nextInt();
        return new int[] {row, column};
    }

    public static boolean checkWin(char[][] board, int row, int column) {
        // check row
        if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
            return true;
        }
        // check column
        if (board[0][column] == board[1][column] && board[1][column] == board[2][column] && board[0] [column] != ' ') {
            return true;
        }
        // check diagonal
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0] [0] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0] [2] != ' ')) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Returns the winner of the game (either 'X', 'O', or ' ' if

}


