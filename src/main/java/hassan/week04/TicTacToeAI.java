package hassan.week04;

import java.util.Scanner;

public class TicTacToeAI {
    private static final char HUMAN_PLAYER = 'X';
    private static final char COMPUTER_PLAYER = 'O';
    private static final char EMPTY_CELL = ' ';

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}}; // leere Zellen
        int currentPlayer = 1;
        boolean gameOver = false; // Flag, um zu überprüfen, ob das Spiel vorbei ist

        while (!gameOver) {
            printBoard(board);

            if (currentPlayer == 1) {
                int[] move = getHumanMove(board);
                board[move[0]][move[1]] = HUMAN_PLAYER;
            } else {
                System.out.println("Computer ist dran.");
                int[] move = getComputerMove(board);
                board[move[0]][move[1]] = COMPUTER_PLAYER;
            }

            gameOver = checkWin(board);
            if (gameOver) {
                if (currentPlayer == 1) {
                    System.out.println("Du hast gewonnen!");
                } else {
                    System.out.println("Computer hat gewonnen!");
                }
            } else if (isBoardFull(board)) {
                System.out.println("Unentschieden!");
                gameOver = true;
            } else {
                if (currentPlayer == 1) currentPlayer = 2;
                else currentPlayer = 1;
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

    public static int[] getHumanMove(char[][] board) {
        int row = -1;
        int column = -1;
        boolean validMove = false;

        System.out.println("Du bist dran.");

        while (!validMove) {
            row = readNumberFromConsole("Gib die Reihe ein (0-2): ");
            column = readNumberFromConsole("Gib die Spalte ein (0-2): ");

            if (board[row][column] == EMPTY_CELL) {
                validMove = true;
            } else {
                System.out.println("Ungültiger Zug, bitte erneut versuchen.");
            }
        }

        return new int[]{row, column};
    }


    public static int[] minimax(char[][] board, int depth, boolean isMaximizingPlayer) {
        int[] result = new int[3];

        if (checkWin(board)) {
            result[0] = -1;
            result[1] = -1;
            if (isMaximizingPlayer) result[2] = 10 - depth;
            else result[2] = depth - 10;
            return result;
        } else if (isBoardFull(board)) {
            result[0] = -1;
            result[1] = -1;
            result[2] = 0;
            return result;
        }

        if (isMaximizingPlayer) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'O';
                        int[] score = minimax(board, depth + 1, false);
                        if (score[2] > bestScore) {
                            bestScore = score[2];
                            result[0] = i;
                            result[1] = j;
                            result[2] = bestScore;
                        }
                        board[i][j] = ' ';
                    }
                }
            }
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'X';
                        int[] score = minimax(board, depth + 1, true);
                        if (score[2] < bestScore) {
                            bestScore = score[2];
                            result[0] = i;
                            result[1] = j;
                            result[2] = bestScore;
                        }
                        board[i][j] = ' ';
                    }
                }
            }
        }

        return result;
    }

    public static int[] getComputerMove(char[][] board) {
        int[] move = minimax(board, COMPUTER_PLAYER, true);
        return new int[]{move[1], move[2]};
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
    public static boolean checkWin(char[][] board) {
        // check rows for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }
        }

        // check columns for a win
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return true;
            }
        }

        // check diagonals for a win
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
            return true;
        }

        return false;
    }


}