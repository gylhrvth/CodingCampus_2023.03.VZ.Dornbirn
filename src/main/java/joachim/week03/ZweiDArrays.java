package joachim.week03;

import java.util.Arrays;
import java.util.Random;

public class ZweiDArrays {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[][] twoDarray = createRandArray(2, 5);
        //   print2DArrayColumn(twoDarray, sumByColumns(twoDarray));
        print2DArrayRow(twoDarray, sumbyRows(twoDarray));

    }

    public static int[] sumbyRows(int[][] arr) {
        if (arr.length < 1) {
            return new int[]{};
        }
        int[] summeR = new int[arr.length];
        for (int i = 0; i < summeR.length; i++) {
            summeR[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                summeR[i] += arr[i][j];
            }
        }
        return summeR;
    }

    public static int[] sumByColumns(int[][] arr) {
        if (arr.length < 1) {
            return new int[]{};
        }
        int[] summe = new int[arr[0].length];
        for (int i = 0; i < summe.length; i++) {
            summe[i] = 0;
        }
        for (int irows = 0; irows < arr.length; irows++) {
            for (int jcol = 0; jcol < arr[irows].length; jcol++) {
                summe[jcol] += arr[irows][jcol];
            }
        }
        return summe;
    }

    public static int[][] createRandArray(int rows, int cols) {
        int[][] values = new int[rows][cols];
        for (int irows = 0; irows < values.length; irows++) {
            for (int jcol = 0; jcol < values[irows].length; jcol++) {
                values[irows][jcol] = rand.nextInt(101);
            }
        }
        return values;
    }

    public static void print2DArrayColumn(int[][] values, int[] sumByColumn) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.printf("[  %4d]", values[i][j]);

            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");
        for (int j = 0; j < sumByColumn.length; j++) {
            System.out.printf("[  %4d]", sumByColumn[j]);
        }
    }

    public static void print2DArrayRow(int[][] values, int[] sumByRows) {
        System.out.println("Sum of the Rows.");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.printf(" |  %4d", values[i][j]);
            }
            System.out.printf(" || %5d", sumByRows[i]);
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

    }
}