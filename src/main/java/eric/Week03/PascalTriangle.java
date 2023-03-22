package eric.Week03;

import java.security.SecureRandom;
import java.util.Scanner;

public class PascalTriangle {
    static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {

        int rows = getArrayLength("Wie Groß soll das Pascal Dreieck sein?: ");

        System.out.println();

        int[][] pascal = pascalDreieck(rows);
        printTriangle(pascal);
    }


    public static int[][] pascalDreieck(int numRows) {
        int[][] pscTriangle = new int[numRows][numRows];
        for (int pscNumLeft = 0; pscNumLeft < pscTriangle.length; pscNumLeft++) {
            for (int pscNumRight = 0; pscNumRight < pscTriangle[pscNumLeft].length; pscNumRight++) {
                if (pscNumRight == 0 || pscNumLeft == 0) {
                    pscTriangle[pscNumLeft][pscNumRight] = 1;
                } else {
                    pscTriangle[pscNumLeft][pscNumRight] = pscTriangle[pscNumLeft][pscNumRight - 1] +
                                                           pscTriangle[pscNumLeft - 1][pscNumRight];
                }
            }
        }
        return pscTriangle;
    }

    public static void printTriangle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("|  %7d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int getArrayLength(String message) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = scanner.nextLine();
                value = Integer.parseInt(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die zahl MUSS Positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Wer lesen kann ist KLAR im VORTEIL!!!");
            }
        }
        return value;
    }
}
