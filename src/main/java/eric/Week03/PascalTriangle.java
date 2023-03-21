package eric.Week03;

import java.security.SecureRandom;
import java.util.Scanner;

public class PascalTriangle {
    static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        int rows = getArrayLength("Wie hoch soll das Pascal Dreieck sein?: ");
        int cols = getArrayLength("Wie breit soll das Pascal Dreieck sein?: ");

        System.out.println();
        int[][] pscTriangle = pascalDreieck(rows, cols);
        System.out.println("----===2D Array===----");
        for (int numRows = 0; numRows < pscTriangle.length; numRows++) {
            for (int numRows2 = 0; numRows2 <= pscTriangle[numRows].length; numRows2++) {
                System.out.printf("%4d ", pscTriangle[numRows][numRows2]);
            }
            System.out.println();
        }
    }

    public static int[][] pascalDreieck(int numRows, int numRows2) {
        int[][] pascalTriangle = new int[numRows][numRows];
        for (int pscRows = 0; pscRows < numRows; pscRows++) {
            pascalTriangle[pscRows][0] = 1;
        }
        for (int pscNumLeft = 1; pscNumLeft < numRows2; pscNumLeft++) {
            for (int pscNumRight = 1; pscNumRight < pscNumLeft; pscNumRight++) {
                pascalTriangle[pscNumLeft][pscNumRight] = pascalTriangle[pscNumLeft - 1][pscNumRight - 1]
                                                        + pascalTriangle[pscNumLeft - 1][pscNumRight];
            }
        }
        return pascalTriangle;
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