package joachim.week03;

import lukas.week03.day4.Colors;

import java.util.Scanner;

public class VierGewinnt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] field = new int[7][7];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }

        }
        System.out.println("Hello! Who are you?");
        String p1 = scanner.nextLine();
        System.out.println("Hello " + p1 + "\nWho is the second Player?");
        String p2 = scanner.nextLine();
        System.out.println("Hello " + p2 + " Let's begin");

        boolean game = true;
        boolean player = true;
        while (game) {
            if (player) {
                System.out.println(p1 + "'s turn");
                ask(field, scanner, 1);
                if (winConditionReached(field, p1, 1)) {
                    game = false;
                }

            } else {
                System.out.println(p2 + "'s turn");
                ask(field, scanner, 2);
                print(field);
                if (winConditionReached(field, p2, 2)) {
                    game = false;
                }
            }

            player = !player;
        }
    }

    public static int[][] ask(int[][] arr, Scanner scanner, int player) {
        int row;
        int col;
        while (true) {
            try {
                System.out.println("where do you want to place your bet");
                System.out.println("choose a Column (0 - 6)");
                print(arr);
                col = scanner.nextInt();
                row = checkLegal(arr, col);
                if (row >= 0) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException Aiob) {
                System.out.println("a number between (0 - 6)");
            }
        }
        arr[row][col] = player;
        return arr;
    }

    private static int checkLegal(int[][] arr, int col) {
        for (int row = arr.length - 1; row >= 0; row--) {
            if (arr[row][col] == 0) {
                return row;
            }
        }
        return -1;
    }

    public static void print(int[][] arr) {
        System.out.println("  0  |  1  |   2 |  3  |  4  |  5  |  6  |");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int board = arr[i][j];
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
    }


    public static boolean winConditionReached(int[][] field, String p1, int playernumber) {
        //          Rows
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playernumber && field[i + 1][j] == playernumber && field[i + 2][j] == playernumber && (field[i + 3][j] == playernumber)) {
                    System.out.println(Colors.COLORS[1] + p1 + " has won!");
                    return true;
                }
            }
        }
//          Columns
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length - 3; j++) {
                if (field[i][j] == playernumber && field[i][j + 1] == playernumber && field[i][j + 2] == playernumber && (field[i][j + 3] == playernumber)) {
                    System.out.println(Colors.COLORS[1] + p1 + " has won!");
                    return true;
                }
            }
        }
//          Diagonal
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field[i].length - 3; j++) {
                if (field[i][j] == playernumber && field[i + 1][j + 1] == playernumber && field[i + 2][j + 2] == playernumber && (field[i + 3][j + 3] == playernumber)) {
                    System.out.println(Colors.COLORS[1] + p1 + " has won!");
                    return true;
                }
            }
        }
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field[i].length - 3; j++) {
                if (field[i][j] == playernumber && field[i + 1][j - 1] == playernumber && field[i + 2][j - 2] == playernumber && (field[i + 3][j - 3] == playernumber)) {
                    System.out.println(Colors.COLORS[1] + p1 + " has won!");
                    return true;
                }
            }
        }
        return false;
    }
}