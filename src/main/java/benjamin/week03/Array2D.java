package benjamin.week03;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2D {

    static Random rand = new Random();

    public static void main(String[] args) {

        int rows = consoleInput("Gib die größe der Zeile ein!");
        int cols = consoleInput("Gib die größe der Spalte ein!");

        int[][] rand = randomNumbers(rows, cols);
        printRandomNumber(rand);

        int[] srows = sumRows(rand);
        int[] scols = sumCols(rand);
        System.out.println(Arrays.toString(srows));
        System.out.println(Arrays.toString(scols));

    }

    public static int[][] randomNumbers(int rows, int cols) {
        int[][] randarr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randomVal = rand.nextInt(100);
                randarr[i][j] = randomVal;
            }
        }

        return randarr;
    }

    public static void printRandomNumber(int[][] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                System.out.printf("%2d ", dim[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] sumRows(int[][] rows) {
        int[] sum = new int[rows.length];
        for (int i = 0; i < rows.length; i++) {
            sum[i] = 0;
            for (int j = 0; j < rows[i].length; j++) {
                sum[i] += rows[i][j];
            }
        }

        return sum;
    }

    public static int[] sumCols(int[][] cols) {
        if (cols.length < 1) return new int[]{};
        int[] sum = new int[cols[0].length];
        sum[0] = 0;
        for (int i = 0; i < cols.length; i++) {
            for (int j = 0; j < cols[i].length; j++) {
                sum[j] += cols[i][j];
            }
        }
        return sum;
    }

    public static int consoleInput(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean inputValidNumber = false;
        while (!inputValidNumber) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
                inputValidNumber = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist keine Zahel");
            }
        }
        return value;
    }
}