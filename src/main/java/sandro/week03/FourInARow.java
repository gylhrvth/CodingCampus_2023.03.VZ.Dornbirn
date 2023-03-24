package sandro.week03;

import lukas.week03.day4.Colors;

import java.util.Scanner;

public class FourInARow {
//    static {
//        if (Math.random() > 0.5) {
//            throw new RuntimeException("Hi Sandro, was geht ab?");
//        }
//    }

    public static void main(String[] args) {

        int[][] board = new int[6][7];
        int currentplayer = 1;
        boolean winner = false;
        boolean empty = true;

        printBoard(board, 6, 7);
        while (!winner && empty) {
            int col;
            int row;
            while (true) {
                col = readInt("pick a Col Player: " + currentplayer);
                row = emptyColumn(board, col);
                if (row == -1) {
                    System.out.println("try again");
                } else {
                    break;
                }
            }


            board[row][col] = currentplayer;
            printBoard(board, 6, 7);


            winner = hasWin(board, currentplayer);
            empty = hasAnyMoreMoves(board, 6, 7);

            if (currentplayer == 1) {
                currentplayer = 2;
            } else {
                currentplayer = 1;
            }
        }
            if (winner) {
                System.out.println("Winner" + currentplayer);
            } else {
                System.out.println("Game is a Draw");
            }
        }



    private static int emptyColumn(int[][] board, int col) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][col] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean hasWin(int[][] field, int currentplayer) {
        for (int i = 0; i < field.length; i++) {
            if (detectWinRow(field, i, currentplayer)
                    || (detectWinCol(field, i, currentplayer))
            ) {
                return true;
            }
        }
        return false;
    }

    public static boolean detectWinRow(int[][] field, int row, int currentplayer) {
        int count = 0;
        for (int i = 0; i < field[row].length; i++) {
            if (field[row][i] == currentplayer) {
                count++;
            } else {
                count = 0;
            }
            if (count >= 4) {
                return true;
            }
        }
        return false;
    }


    public static boolean detectWinCol(int[][] field, int col, int currentplayer) {
        int count = 0;
        for (int i = 0; i < field[col].length - 1; i++) {  //why field[col].length has to be -1???
            if (field[i][col] == currentplayer) {
                count++;
            } else {
                count = 0;
            }
            if (count >= 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasAnyMoreMoves(int[][] field, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (field[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int readInt(String message) {
        int result = -1;
        Scanner sc = new Scanner(System.in);
        while (result < 0 || result > 6) {
            System.out.println(message);
            String line = sc.nextLine();
            try {
                result = Integer.parseInt(line);
                if (result < 0 || result > 6) {
                    System.out.println("illegal number");
                    System.out.println("pick a Col between 0 and 6");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("illegal input");
            }
        }
        return result;
    }


    public static void printBoard(int[][] field, int row, int col) {
        for (int i = 0; i < 7; i++) {
            System.out.print("Col:" + i + "|");
        }
        System.out.println();
        System.out.println("-----|-----|-----|-----|-----|-----|-----|");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int board = field[i][j];
                if (board == 1) {
                    System.out.print("  " + Colors.COLORS[1] + board + Colors.RESET + "  |");
                } else if (board == 2) {
                    System.out.print("  " + Colors.COLORS[2] + board + Colors.RESET + "  |");
                } else {
                    System.out.print("  " + Colors.COLORS[5] + board + Colors.RESET + "  |");
                }
            }
            System.out.println();
        }


        System.out.println("==========================================");
    }

}

