package gyula.week03;

import java.util.Scanner;

public class TicTacToe {
    public static String[] symbol = new String[]{"     ", "  X  ", "  O  "};
    public static void main(String[] args) {
        int[][] field = new int[3][3];
        int currentPlayer = 1;
        int movesLeft = 9;
        boolean win = false;

        printField(field);
        while (movesLeft > 0 && !win){
            int choose = getUserChoose(field, currentPlayer);
            field[(choose - 1) / 3][(choose - 1) % 3] = currentPlayer;
            win = checkWinCondition(field, currentPlayer);
            if (win){
                System.out.println("Gratuliere " + symbol[currentPlayer] + "! Du hast gewonnen!");
            }

            printField(field);
            currentPlayer = 3 - currentPlayer;
            --movesLeft;
        }
        if (!win){
            System.out.println("Es ist unentschieden. Gutes Speil!");
        }
    }


    public static boolean checkRow(int[][] field, int row, int player){
        for (int i = 0; i < field[row].length; i++) {
            if (field[row][i] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol(int[][] field, int col, int player){
        for (int i = 0; i < field.length; i++) {
            if (field[i][col] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiag(int[][] field, int player){
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != player) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkDiag2(int[][] field, int player){
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - i - 1] != player) {
                return false;
            }
        }
        return true;
    }



    public static boolean checkWinCondition(int[][] field, int player){
        for (int i = 0; i < field.length; i++) {
            if (checkRow(field, i, player) ||
                checkCol(field, i, player) ||
                checkDiag(field, player) ||
                checkDiag2(field, player)){
                return true;
            }
        }
        return false;
    }

    public static int getUserChoose(int[][] field, int player){
        int result = -1;
        Scanner sc = new Scanner(System.in);
        while (result < 1 || result > 9) {
            System.out.println("Lieber " + symbol[player] + ", wohin möchtest du dein Stein setzen?");
            String text = sc.nextLine();
            try {
                result = Integer.parseInt(text);
                if (result < 1 || result > 9) {
                    System.out.println("Kein gültiger Feld, bitte wähle etwas anderes.");
                    result = -1;
                } else if (field[(result - 1) / 3][(result - 1) % 3] != 0) {
                    System.out.println("Das Feld ist schon belegt, bitte wähle etwas anderes.");
                    result = -1;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Kein gültiger Feld, bitte wähle etwas anderes.");
            }
        }
        return result;
    }

    public static void printField(int[][] field){
        System.out.println();
        System.out.println("TicTacToe:");
        for (int i = 0; i < field.length; i++) {
            if (i > 0){
                System.out.println("-----|-----|-----");
            }
            System.out.println("     |     |     ");
            for (int j = 0; j < field[i].length; j++) {
                if (j > 0){
                    System.out.print("|");
                }
                if (field[i][j] > 0) {
                    System.out.print(symbol[field[i][j]]);
                } else {
                    System.out.printf("  %1d  ", (3*i + j + 1));
                }
            }
            System.out.println();
            System.out.println("     |     |     ");
        }
    }

}
