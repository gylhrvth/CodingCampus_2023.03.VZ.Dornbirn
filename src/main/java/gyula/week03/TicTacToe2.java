package gyula.week03;

import java.util.Scanner;

public class TicTacToe2 {
    public static void main(String[] args) {
        int[][] field = new int[3][3];
        int currentPlayer = 1;
        int movesLeft = 9;
        boolean win = false;

        printField(field);
        while (movesLeft > 0 && !win) {
            int pos = -1;

            while (!isPositionGueltig(field, pos)) {
                pos = readIntValue("Player " + currentPlayer + ": Geben Sie eine Position: ", 1, 9);
            }
            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;

            field[row][col] = currentPlayer;


            System.out.println("Player " + currentPlayer + " setzt auf [" + row + "][" + col + "]");
            printField(field);
            win = isWinner(field, currentPlayer);

            currentPlayer = 3 - currentPlayer;
            --movesLeft;
        }
        if (win) {
            System.out.println("Congratulation! Gewonnen.");
        } else {
            System.out.println("Unentschieden. Danke für das Spiel!");
        }

    }

    public static boolean isWinnerInRow(int[][] field, int currentPlayer, int iRow){
        for (int iCol = 0; iCol < field[iRow].length; iCol++) {
            if (field[iRow][iCol] != currentPlayer) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinnerInCol(int[][] field, int currentPlayer, int iCol){
        for (int iRow = 0; iRow < field.length; iRow++) {
            if (field[iRow][iCol] != currentPlayer) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinnerInDiag(int[][] field, int currentPlayer){
        for (int iRow = 0; iRow < field.length; iRow++) {
            if (field[iRow][iRow] != currentPlayer) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinnerInDiag2(int[][] field, int currentPlayer){
        for (int iRow = 0; iRow < field.length; iRow++) {
            if (field[iRow][field.length - iRow - 1] != currentPlayer) {
                return false;
            }
        }
        return true;
    }


    public static boolean isWinner(int[][] field, int currentPlayer){
        for (int iRow = 0; iRow < field.length; iRow++) {
            if (isWinnerInRow(field, currentPlayer, iRow)){
                return true;
            }
        }
        for (int iCol = 0; iCol < field[0].length; iCol++) {
            if (isWinnerInCol(field, currentPlayer, iCol)){
                return true;
            }
        }
        if (isWinnerInDiag(field, currentPlayer)){
            return true;
        }
        if (isWinnerInDiag2(field, currentPlayer)){
            return true;
        }

        return false;
    }


    public static boolean isPositionGueltig(int[][] field, int pos){
        if (pos < 1) {
            return false;
        }
        int row = (pos - 1) / 3;
        int col = (pos - 1) % 3;

        if (field[row][col] != 0) {
            System.out.println("Die Position ist schon belegt. Geben Sie noch einmal ein.");
            return false;
        }
        return true;
    }

    public static void printField(int[][] field) {
        String[] symbols = new String[]{".", "X", "O"};
        for (int iRow = 0; iRow < field.length; iRow++) {
            for (int iCol = 0; iCol < field[iRow].length; iCol++) {
                System.out.print(symbols[field[iRow][iCol]]);
            }
            System.out.println();
        }
    }

    public static int readIntValue(String message, int min, int max) {
        int result = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        while (result < min || result > max) {
            System.out.println(message);
            String line = sc.nextLine();
            try {
                result = Integer.parseInt(line);
                if (result < min) {
                    System.out.println("Das darf nicht kleiner als " + min + " sein.");
                } else if (result > max) {
                    System.out.println("Das Wert darf nicht größer als " + max + " sein.");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Eine Zahl ist einzugeben.");
            }
        }
        return result;
    }
}
