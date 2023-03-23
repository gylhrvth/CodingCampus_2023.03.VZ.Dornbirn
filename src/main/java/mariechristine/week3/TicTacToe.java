package mariechristine.week3;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Willkommen beim Spiel Tic Tac Toe!\nWer 3 Zeichen in einer Reihe, Spalte oder Diagonale schafft, gewinnt!\nLos geht's!");
        System.out.println();

        int[][] board = new int[3][3];

        int currentPlayer = 1;


        while (true) {
            printGameBoard(board);
            System.out.println();

            readInput("Gib eine Zahl ein!", 1, 9);


            int userInput = 2;
            int[] position = getPosition(userInput);
            System.out.println("Spieler " + currentPlayer + " klicked on row: " + position[0] + " and col: " + position[1]);

            if (currentPlayer == 1) {
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
        }
    }

    public static void printGameBoard(int[][] board) {
        String[] symbol = new String[]{".", "X", "O"};
        for (int i = 0; i < board.length; i++) {
            if (i > 0) {
                System.out.println("     |     |     ");
                System.out.println("-----|-----|-----");
            }
            System.out.println("     |     |     ");
            for (int j = 0; j < board[i].length; j++) {
                if (j > 0) {
                    System.out.print("|");
                }
                System.out.print("  " + symbol[board[i][j]] + "  ");
            }
            System.out.println();
        }
        System.out.println("     |     |     ");
    }

    public static void readInput(String message, int min, int max) {
        int input = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        while (input < min || input > max) {
            System.out.println(message);
            String line = sc.nextLine();
            try {
                input = Integer.parseInt(line);
                if (input < min || input > max) {
                    System.out.println("Die Zahl darf nicht kleiner als " + min + " oder größer als " + max + " sein.");
                } else {
                    System.out.println("Der Spieler hat auf Position " + input + " gesetzt.");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Deine Eingabe ist ungültig!");
            }
        }

    }

    public static boolean validPosition(int[] position, int currentPlayer) {
        if (position.length == 0) {
            return true;
        } else {
            System.out.println("Position ist bereits belesetzt.");
        }
        return false;
    }









    private static int[] getPosition(int number) {
//        int[][] numberToPosition = new int[][]{null, {0,0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
//
//        return numberToPosition[number];

        if (number == 1) {
            return new int[]{0, 0};
        } else if (number == 2) {
            return new int[]{0, 1};
        }
        if (number == 3) {
            return new int[]{0, 2};
        } else if (number == 4) {
            return new int[]{1, 0};
        }
        if (number == 5) {
            return new int[]{1, 1};
        } else if (number == 6) {
            return new int[]{1, 2};
        }
        if (number == 7) {
            return new int[]{2, 0};
        } else if (number == 8) {
                return new int[]{2, 1};
        }
        if (number == 9) {
            return new int[]{2, 2};
        }

        return null;
    }
}
