package mert.Week03;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[][] array = crateArray(2, 3);
        int[] sumRows = summeRow(array);
        int[] sumCol = summeCol(array);
        print2dArray(array, sumRows, sumCol);


    }

    public static int[][] crateArray(int rows, int colums) {
        int[][] result = new int[colums][rows];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = rand.nextInt(101);
            }
        }
        return result;
    }

    public static void print2dArray(int[][] values, int[] sumRows, int[] sumCol) {
        if (values.length < 1) {
            System.out.println("Empty");
            return;
        }
        for (int iRow = 0; iRow < values[0].length; iRow++) {
            int iCol;
            for (iCol = 0; iCol < values.length; iCol++) {
                System.out.printf(" %3d", values[iCol][iRow]);
            }
            System.out.printf("  |  %5d", sumRows[iRow]);
            System.out.println();

        }
        System.out.println("================================");
        for (int iCol = 0; iCol < sumCol.length; iCol++) {
            System.out.printf("%3d     ", sumCol[iCol]);
        }


    }

    public static int[] summeRow(int[][] arr) {
        if (arr.length < 1) {
            return new int[]{};
        }
        int[] sum = new int[arr[0].length];
        for (int iRow = 0; iRow < arr[0].length; iRow++) {
            sum[iRow] = 0;
            for (int iCol = 0; iCol < arr.length; iCol++) {
                sum[iRow] += arr[iCol][iRow];
            }
        }
        return sum;
    }

    public static int[] summeCol(int[][] arr) {
        if (arr.length < 1) {
            return new int[]{};
        }

        int[] sums = new int[arr.length];
        for (int iRow = 0; iRow < arr[0].length; iRow++) {
            for (int iCol = 0; iCol < arr.length; iCol++) {
                sums[iCol] += arr[iCol][iRow];
            }
        }
        return sums;

    }
}