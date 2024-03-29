package sandro.week03;

import java.util.Scanner;

public class TicTacToeFinal {
    public static void main(String[] args) {
        int[][] field = new int[3][3];
        int currentPlayer = 1;
        boolean winner = false;
        boolean empty = true;

        printField(field);
        while (!winner && empty) {
            boolean valid = false;
            int row = -1;
            int col = -1;
            while (!valid) {
                row = readInt("Welche Zeile? Spieler " + currentPlayer);
                col = readInt("Welche Spalte? Spieler " + currentPlayer);
                valid = (field[row][col] == 0);
                if (!valid) {
                    System.out.println("Die Position ist schon belegt. Bitte wählen Sie ein anderes Feld!");
                }
            }
            field[row][col] = currentPlayer;
            printField(field);

            winner = hasWin(field, currentPlayer);
            empty = hasAnyMoreMoves(field);

            if (currentPlayer == 1) {
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
        }
        if (winner) {
            System.out.println("Gewonnen!");
        } else {
            System.out.println("Unentschieden. Danke für das Mitspielen.");
        }
    }

    public static int readInt(String message) {
        int result = -1;
        Scanner sc = new Scanner(System.in);
        while (result < 0 || result > 2) {
            System.out.println(message);
            String line = sc.nextLine();
            try {
                result = Integer.parseInt(line);
                if (result < 0 || result > 2) {
                    System.out.println("Das Wert muss 0, 1 oder 2 sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es ist kein Zahl!");
            }
        }
        return result;
    }

    // TODO: 22.03.23 Methode für Ermittlung von WIN Condition
    public static boolean hasWin(int[][] field, int currentPlayer) {
        for (int i = 0; i < field.length; i++) {
            if (hasWinInRow(field, currentPlayer, i)
                  ||  (hasWinInCol(field, currentPlayer, i)
                    || (hasWinDiagonal(field,currentPlayer)
                    || (hasWinDiagonal2(field,currentPlayer)))))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean hasWinInRow(int[][] field, int currentPlayer, int row) {
        for (int i = 0; i < field[row].length; i++) {
            if (field[row][i] != currentPlayer) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasWinInCol(int[][] field, int currentPlayer, int col) {
        for (int i = 0; i < field[col].length; i++) {
            if (field[i][col] != currentPlayer) {
                return false;
            }
        }
        return true;
    }

public static boolean hasWinDiagonal(int [][] field, int currentPlayer){
    for (int i = 0; i < field.length; i++) {
        if (field[i][i] != currentPlayer){
            return false;
        }
    }
    return true;
}
public static boolean hasWinDiagonal2(int [][] field, int currentplayer){
    for (int i = 0; i < field.length; i++) {
        if (field[i][field.length -i -1] != currentplayer){
            return false;
        }
    }
    return true;
}
    public static boolean hasAnyMoreMoves(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println(" -------------");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(" | " + field[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println(" -------------");
    }
}
