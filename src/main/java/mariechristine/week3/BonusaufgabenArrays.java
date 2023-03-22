package mariechristine.week3;

import java.util.Arrays;
import java.util.Random;

public class BonusaufgabenArrays {
    static Random random = new Random();

    public static void main(String[] args) {
        /*
        int[][] array = new int[6][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
         */


        int[][] array = pascalTriangle(10);
        System.out.println("2D-Array");
        print2DArray(array);

        for (int n = 1; n < 10; n++) {
            System.out.print("(a+b)^" + n + " = ");
            for (int bExp = 0; bExp <= n; bExp++) {
                if (array[n - bExp][bExp] != 1) {
                    System.out.print(array[n - bExp][bExp] + "*");
                }
                if (n - bExp > 0) {
                    System.out.print("a");
                    if (n - bExp > 1) {
                        System.out.print("^" + (n - bExp));
                    }
                    if (bExp > 0) {
                        System.out.print("*");
                    }
                }
                if (bExp > 0) {
                    System.out.print("b");
                    if (bExp > 1) {
                        System.out.print("^" + bExp);
                    }
                }
                if (bExp < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println();
        }

    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" %5d", array[i][j]);
            }
            System.out.println();
            //System.out.println(Arrays.toString(array[i]));
        }

    }

    public static int[][] pascalTriangle(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 || j == 0)
                    matrix[i][j] = 1;

                else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }

            }

        }
        return matrix;
    }

}