package ayguen.week03;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe3 {


    public static void main(String[] args) {

        int field[][] = new int[3][3];
        int currentplayer = 1;
        boolean win = false;
        while (!win) {

            System.out.println();
            int row;
            int col;
            while (true) {
                row = readInput("Wo möchten sie den einsetzen Spieler: " + currentplayer + " (Zeile)?", 0, 2);
                col = readInput("Wo möchten sie den einsetzen Spieler: " + currentplayer + " (Spalte)?", 0, 2);

                if (field[row][col] == 0) {
                    break;
                } else {
                    System.out.println("Feld ist bereits belegt");
                }
            }

            field[row][col] = currentplayer;

            win = playerHasWon(field, currentplayer);
            currentplayer = 3 - currentplayer;
            System.out.println();
            spielField(field);
        }

        System.out.println("Spieler: " + currentplayer + " hat gewonnen!");
    }

    public static boolean playerHasWon(int[][] field, int currentPlayer) {
        if (winRow(field, currentPlayer)) {
            return true;
        }

        if (winCol(field, currentPlayer)) {
            return true;
        }

        if (winDiag(field, currentPlayer)) {
            return true;

        }
        if (winDiag2(field, currentPlayer)) {
            return true;
        }

        return false;
    }

    public static void spielField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        System.out.println();
    }

    public static int readInput(String frage, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(frage);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);

                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein!");
                }
            } catch (NumberFormatException nme) {
                System.out.println("Das geht nicht!");
            }
        }
        return value;
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

        int h = field[2][0];
        int i = field[2][1];
        int j = field[2][2];

        if (h == i && i == j && j == player) {
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

        int h = field[0][2];
        int i = field[1][2];
        int j = field[2][2];

        if (h == i && i == j && j == player) {
            return true;

        }
        return false;

    }

    public static boolean winDiag(int[][] field, int player) {

        int a = field[0][0];
        int b = field[1][1];
        int c = field[2][2];

        if (a == b && b == c && c == player) {
            return true;
        }
        return false;
    }

    public static boolean winDiag2(int[][] field, int player) {

        int a = field[0][2];
        int b = field[1][1];
        int c = field[2][0];

        if (a == b && b == c && c == player) {
            return true;
        }
        return false;

    }

}
