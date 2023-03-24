package benjamin.week03;

import java.util.Scanner;

public class FourInRow {
    public static void main(String[] args) {

        int[][] fourInRow = createFourInRow();
        print2DArray(fourInRow);

    }

    //Wincondition
    //wann unentschieden


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
                int row = hasEmpty(field, col);
                if (row == - 1){
                } else{
                    field[row][col] = currentPlayer;
                }
                occupied = true;
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


    public static boolean hasWinRow(int[][] field, int currentplayer,int row) {
        int count = 0;
        for (int i = 0; i < field[row].length; i++) {
            if (field[row][i] == currentplayer) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return true;
    }

    public static int hasEmpty(int[][] field, int col) {
        for (int i = 0; i <= field.length - 1; i++) {
            if (field[i][col] == 0) {
                return i;
            }
        }
        return -1;
    }


    public static void print2DArray(int[][] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                System.out.printf("%3d ", dim[i][j]);
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