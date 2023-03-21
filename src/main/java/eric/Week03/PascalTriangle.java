package eric.Week03;

import java.security.SecureRandom;
import java.util.Scanner;

public class PascalTriangle {
    static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        int rows = getArrayLength("Wie Groß soll das Pascal Dreieck sein?: ");

        System.out.println();

        pascalDreieck(rows);

        }


    public static void pascalDreieck(int numRows) {
        int[][] pscTriangle = new int[numRows][numRows];
        for (int pscRows = 0; pscRows < numRows; pscRows++) {
            pscTriangle[pscRows][1] = 1;
        }
        for (int pscNumLeft = 1; pscNumLeft < pscTriangle.length; pscNumLeft++) {
            for (int pscNumRight = 1; pscNumRight <= pscNumLeft; pscNumRight++) {
                pscTriangle[pscNumLeft][pscNumRight] = pscTriangle[pscNumLeft][pscNumRight - 1]
                        + pscTriangle[pscNumLeft - 1][pscNumRight];
                System.out.printf("| %5d", pscTriangle[pscNumLeft][pscNumRight]);
                System.out.print(" ");
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
