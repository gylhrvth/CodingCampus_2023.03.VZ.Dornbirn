package hassan.week03;

import java.util.Scanner;

public class PascalDreieck {
    public static void main(String[] args) {
        int rows = getArrayLength("Gib Größe des Dreiecks an : ");


        int[][] triangle = printPascalTriangle(rows);
        printTriangle(triangle);

    }


    public static int[][] printPascalTriangle(int rows) {
        int[][] triangle = new int[rows][rows];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0 || i == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i][j - 1] + triangle[i - 1][j];
                }
            }
        }
        return triangle;
    }

    public static void printTriangle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("- %5d ", matrix[i][j]);
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
                    System.out.println("die zahl muss POSITIV sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Das Ist Keine Gültige Zahl!!!");
            }
        }
        return value;
    }
}
