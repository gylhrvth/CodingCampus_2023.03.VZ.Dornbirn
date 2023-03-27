package gyula.week04;

import java.util.Random;

public class FourInRow {
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[][] board = createBoard(10, 8);
        printBoard(board);

        System.out.println(checkWin(board));
    }

    public static int checkWin(int[][] board){
        for (int col = 0; col < board.length; col++) {
            for (int row = 0; row < board[col].length; row++) {
                if (checkWinFrom(board, col, row, 4)){
                    System.out.println("Win condition at " + col + ", " + row + ".");
                    return board[col][row];
                }
            }
        }
        return 0;
    }

    public static boolean checkWinFrom(int[][] board, int col, int row, int countStonesToCheck){
        if (col < 0 || row < 0 || col >= board.length || row >= board[0].length){
            return false;
        }

        int currentPlayer = board[col][row];
        if (currentPlayer == 0){
            return false;
        }
        boolean winUp = true;
        for (int i = 1; i < countStonesToCheck; i++) {
            if (row + i >= board[0].length || board[col][row + i] != currentPlayer) {
                winUp = false;
            }
        }
        boolean winUpRight = true;
        for (int i = 1; i < countStonesToCheck; i++) {
            if (    col + i >= board.length ||
                    row + i >= board[0].length ||
                    board[col + i][row + i] != currentPlayer) {
                winUpRight = false;
            }
        }
        boolean winRight = true;
        for (int i = 1; i < countStonesToCheck; i++) {
            if (    col + i >= board.length ||
                    board[col + i][row] != currentPlayer) {
                winRight = false;
            }
        }
        boolean winDownRight = true;
        for (int i = 1; i < countStonesToCheck; i++) {
            if (    col + i >= board.length ||
                    row - i < 0 ||
                    board[col + i][row - i] != currentPlayer) {
                winDownRight = false;
            }
        }

        return winUp || winUpRight || winRight || winDownRight;
    }

    public static void printBoard(int[][] board){
        if (board.length < 1){
            System.out.println("Empty Board");
            return;
        }
        for (int row = 0; row < board[0].length; row++) {
            for (int column = 0; column < board.length; column++) {
                System.out.print(board[column][board[0].length - 1 - row] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createBoard(int width, int height){
        int[][] result = new int[width][height];

        for (int column = 0; column < result.length; column++) {
            int countFilled = rand.nextInt(height + 1);
            for (int row = 0; row < countFilled; row++) {
                result[column][row] = 1 + rand.nextInt(2);
            }
        }

        return result;
    }
}
