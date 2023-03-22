package mert.Week03;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;

public class Pascaldreieck {
    public static void main(String[] args) {

        int rows = ConsoleInputNumber.readNumber_v5("Wie viele Zeilen?", 1, 50);
        int cols = ConsoleInputNumber.readNumber_v5("Wie viele Spalten?", 1, 50);

        int[][] array = createArray(rows, cols);
        print2dArray(array);


    }

    public static int[][] createArray(int rows, int colums) {
        int[][] result = new int[rows][colums];
        for (int iRow = 0; iRow < result.length; iRow++) {
            for (int iCol = 0; iCol < result[iRow].length; iCol++) {
                if (iRow == 0 || iCol == 0) {
                    result[iRow][iCol] = 1;
                } else result[iRow][iCol] = result[iRow][iCol - 1] + result[iRow - 1][iCol];
            }
        }
        return result;
    }

    public static void print2dArray(int[][] values) {

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                System.out.printf(" %5d ", values[i][j]);
            }
            System.out.println();

        }
    }
}

