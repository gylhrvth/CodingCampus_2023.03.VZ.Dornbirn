package gyula.week03;

import java.util.Arrays;
import java.util.Random;

public class Summe2DArray {
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[][] testMatrix = create2DArray(10, 2);
        int[] summeRows = sumRows(testMatrix);
        int[] summeCols = sumCols(testMatrix);

        printMatrix(testMatrix, summeRows, summeCols);
    }

    public static int[] sumCols(int[][] matrix){
        if (matrix.length < 1) return new int[]{};
        int[] sum = new int[matrix[0].length];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = 0;
        }
        for (int iRow = 0; iRow < matrix.length; iRow++) {
            for (int iCol = 0; iCol < matrix[iRow].length; iCol++) {
                sum[iCol] += matrix[iRow][iCol];
            }
        }
        return sum;
    }

    public static int[] sumRows(int[][] matrix){
        int[] sum = new int[matrix.length];
        for (int iRow = 0; iRow < matrix.length; iRow++) {
            sum[iRow] = 0;
            for (int iCol = 0; iCol < matrix[iRow].length; iCol++) {
                sum[iRow] += matrix[iRow][iCol];
            }
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix, int[] sumRows, int[] sumCols){
        for (int iRow = 0; iRow < matrix.length; iRow++) {
            for (int iCol = 0; iCol < matrix[iRow].length; iCol++) {
                System.out.printf("| %3d ", matrix[iRow][iCol]);
            }
            System.out.printf("|| %5d ", sumRows[iRow]);
            System.out.println("|");
        }
        System.out.println("================================");
        for (int iCol = 0; iCol < sumCols.length; iCol++) {
            System.out.printf("| %3d ", sumCols[iCol]);
        }
        System.out.println("||       |");
    }

    public static int[][] create2DArray(int rows, int columns){
        int[][] result = new int[rows][columns];
        for (int iRow = 0; iRow < result.length; iRow++) {
            for (int iCol = 0; iCol < result[iRow].length; iCol++) {
                result[iRow][iCol] = rand.nextInt(21);
            }
        }
        return result;
    }
}
