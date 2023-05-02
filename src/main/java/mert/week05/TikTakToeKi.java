package mert.week05;

import gyula.week02.ConsoleInputNumber;

public class TikTakToeKi {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        int player = 1;
        int playerKi = 2;

        boolean win = false;
        printBoard(board);
        int steps = 0;
        while (!win && steps < 9) {
            playerMove(board, 1);
            printBoard(board);
            win = winner(board, player);
            isBoardFull(board);

            kiMove(board, playerKi);
            printBoard(board);
            win = winner(board, playerKi);
            ++steps;
            isBoardFull(board);
        }

        if (winner(board, player)) {
            System.out.println("Gewonnen");

        } else if (winner(board, playerKi)) {
            System.out.println("Verloren");

        } else if (isBoardFull(board)) {
            System.out.println("Unentschieden");
        }

    }


    public static void printBoard(int[][] values) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (values[i][j] == 0) {
                    System.out.print("| |");
                } else if (values[i][j] == 1) {
                    System.out.print("|X|");
                } else if (values[i][j] == 2) {
                    System.out.print("|o|");

                }
            }
            System.out.println();
            System.out.println("---------");
        }

    }

    public static void playerMove(int[][] field, int player) {
        System.out.println("Player " + player + " ist drann");

        int row = -1;
        int col = -1;

        boolean validMove = false;
        while (!validMove) {
            row = ConsoleInputNumber.readNumber_v5("Gib eine Reihe ein 0-2 ", 0, 2);
            col = ConsoleInputNumber.readNumber_v5("Gib eine Spalte ein 0-2 ", 0, 2);

            if (field[row][col] == 0) {
                validMove = true;
            } else {
                System.out.println("Dies ist nicht gültg");
            }
        }

        field[row][col] = player;
    }

    public static boolean winRow(int[][] field, int player) {

        int a = field[0][0];
        int b = field[0][1];
        int c = field[0][2];

        if (a == b && b == c && c == player) {
            return true;
        }

        int d = field[1][0];
        int e = field[1][1];
        int f = field[1][2];

        if (d == e && e == f && f == player) {
            return true;
        }
        int g = field[2][0];
        int h = field[2][1];
        int i = field[2][2];

        if (g == h && h == i && i == player) {
            return true;

        }
        return false;
    }

    public static boolean winCol(int[][] field, int player) {
        int a = field[0][0];
        int b = field[1][0];
        int c = field[2][0];

        if (a == b && b == c && c == player) {
            return true;
        }
        int d = field[0][1];
        int e = field[1][1];
        int f = field[2][1];
        if (d == e && e == f && f == player) {
            return true;
        }
        int g = field[0][2];
        int h = field[1][2];
        int i = field[2][2];

        if (g == h && h == i && i == player) {
            return true;

        }
        return false;
    }

    public static boolean winDia(int[][] field, int player) {
        int a = field[0][0];
        int b = field[1][1];
        int c = field[2][2];
        if (a == b && b == c && c == player) {
            return true;
        }
        return false;
    }

    public static boolean winDia2(int[][] field, int player) {
        int a = field[2][0];
        int b = field[1][1];
        int c = field[0][2];
        if (a == b && b == c && c == player) {
            return true;
        }
        return false;
    }

    public static boolean winner(int[][] field, int player) {
        if (winRow(field, player)) {
            return true;
        }
        if (winCol(field, player)) {
            return true;
        }
        if (winDia(field, player)) {
            return true;
        }
        if (winDia2(field, player)) {
            return true;
        }
        return false;

    }


    public static void kiMove(int[][] board, int playerKi) {
        int bestScore = Integer.MIN_VALUE;
        int bestRow = -1;
        int bestCol = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = playerKi;
                    int score = minimax(board, 0, false, playerKi);
                    board[i][j] = 0;

                    if (score > bestScore) {
                        bestScore = score;
                        bestRow = i;
                        bestCol = j;
                    }
                }
            }
        }

        board[bestRow][bestCol] = playerKi;
    }

    public static int minimax(int[][] board, int depth, boolean isMaximizingPlayer, int playerKi) {
        if (winner(board, 1)) {
            return -1;
        }
        if (winner(board, 2)) {
            return 1;
        }
        if (isBoardFull(board)) {
            return 0;
        }

        if (isMaximizingPlayer) {
            int maxScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = playerKi;
                        int score = minimax(board, depth + 1, false, playerKi);
                        board[i][j] = 0;
                        maxScore = Math.max(maxScore, score);
                    }
                }
            }
            return maxScore;
        } else {
            int minScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = 3 - playerKi;
                        int score = minimax(board, depth + 1, true, playerKi);
                        board[i][j] = 0;
                        minScore = Math.min(minScore, score);
                    }
                }
            }
            return minScore;
        }
    }

    public static boolean isBoardFull(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
