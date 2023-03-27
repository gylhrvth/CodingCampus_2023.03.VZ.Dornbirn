package benjamin.week03;

import lukas.week03.day4.Colors;

import java.util.Scanner;

public class FourInRow {
    public static void main(String[] args) {

        int[][] fourInRow = createFourInRow();
        print2DArray(fourInRow);

    }

    public static int[][] createFourInRow() {
        int[][] field = new int[6][7];
        int currentPlayer = 1;
        boolean gameEnd = false;
        while (!gameEnd) {
            print2DArray(field);
            boolean occupied = false;
            while (!occupied) {
                System.out.println("Spieler " + currentPlayer + " du bist dran");
                int col = consoleInput("Gib die Spalte ein (0-6)", 0, 6);
                for (int row = field.length - 1; row >= 0; row--) {
                    if (field[row][col] == 0) {
                        field[row][col] = currentPlayer;
                        occupied = true;
                        break;
                    }
                }
                if (!occupied) {
                    System.out.println("Spalte ist schon besetzt");

                }
                if (checkWin(field, currentPlayer)) {
                    System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                    gameEnd = true;
//                    break;
                }
            }
            if (!gameEnd)
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
        }
        return field;
    }


    public static boolean checkWin(int[][] field, int currentPlayer) {
        return (checkRow(field, currentPlayer)) || (checkCol(field, currentPlayer) || (checkDiagonal(field, currentPlayer)));
    }

    public static boolean checkRow(int[][] field, int currentplayer) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == currentplayer) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCol(int[][] field, int currentplayer) {
        for (int j = 0; j < field[0].length; j++) {
            int count = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][j] == currentplayer) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDiagonal(int[][] field, int currentPlayer) {

        for (int i = 3; i < field.length; i++) {
            for (int j = 0; j < field[0].length - 3; j++) {

                if (field[i][j] == currentPlayer &&
                        field[i - 1][j + 1] == currentPlayer &&
                        field[i - 2][j + 2] == currentPlayer &&
                        field[i - 3][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }

        for (int i = 3; i < field.length; i++) {
            for (int j = 3; j < field[0].length; j++) {
                if (field[i][j] == currentPlayer &&
                        field[i - 1][j - 1] == currentPlayer &&
                        field[i - 2][j - 2] == currentPlayer &&
                        field[i - 3][j - 3] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void print2DArray(int[][] dim) {
        for (int i = 0; i < 7; i++) {
            System.out.print("  " + i + "  |");
        }
        System.out.println();
        System.out.println("-----|-----|-----|-----|-----|-----|-----|");

        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {

                if (dim[i][j] == 1) {
                    System.out.print("  " + Colors.COLORS[1] + dim[i][j]  + Colors.RESET + "  |");
                } else if (dim[i][j] == 2) {
                    System.out.print("  " + Colors.COLORS[2] + dim[i][j]  + Colors.RESET+ "  |");
                } else {
                    System.out.print("  " + dim[i][j] + "  |");
                }
            }
            System.out.println();
        }
    }

    public static int consoleInput(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen" + minValue + "und" + maxValue + "sein!");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("keine gültige Eingabe");
            }
        }
        return value;
    }
}