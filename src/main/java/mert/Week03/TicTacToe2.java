package mert.Week03;

import gyula.week02.ConsoleInputNumber;

import java.util.Scanner;

public class TicTacToe2 {
    public static void main(String[] args) {
        int[][] field = new int[3][3];
        int player = 1;

        boolean win = false;
        printField(field);
        int steps = 0;
        while (!win && steps < 9) {
            playerChoosse(field, player);
            printField(field);
            win = winner(field, 1);
            player = 3 - player;
            ++steps;



        }
        if (win) {
            System.out.println("Gewonnen");
        } else {
            System.out.println("Unentschieden");
        }
    }

    public static void printField(int[][] values) {
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

    public static void playerChoosse(int[][] field, int player) {
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
}



