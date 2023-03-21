package hassan.week03;

import java.util.Scanner;

public class PascalDreieck {
    public static void main(String[] args) {
        int rows = getArrayLength("Gib Größe des Dreiecks an : ");
        printPascalTriangle(rows);

    }


    public static void printPascalTriangle(int rows) {
        int[][] triangle = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i][j-1] + triangle[i-1][j];
                }
                System.out.printf("%4d", triangle[i][j]);
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
                    System.out.println("die zahl muss POSITIV sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Das Ist Keine Gültige Zahl!!!");
            }
        }
        return value;
    }
}
