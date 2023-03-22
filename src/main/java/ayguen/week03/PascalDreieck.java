package ayguen.week03;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;

public class PascalDreieck {
    public static void main(String[] args) {

        int rows = ConsoleInputNumber.readNumber_v5("Wie viele Zeilen?", 1, 50);
        int cols = ConsoleInputNumber.readNumber_v5("Wie viele Spalten", 1, 50);
        int[][] dim = createPascal(rows, cols);
        print2dArray(dim);


    }


    public static int[][] createPascal(int rows, int cols) {
        int[][] values = new int[rows][cols];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if ((i == 0 || j == 0)) {
                    values[i][j] = 1;
                } else
                    values[i][j]= values [i] [j -1] + values[i - 1] [j];
            }


        }
        return values;

    }

    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(" %5d", arr[i][j]);
            }
            System.out.println();


        }

    }


}