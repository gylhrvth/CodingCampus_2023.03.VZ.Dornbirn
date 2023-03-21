package sandro.week03;

import java.util.Arrays;
import java.util.Scanner;

public class PascalDreieck {
    public static void main(String[] args) {

        int arraysize = readsize("Wie groß soll das PascalDreieck sein?");
        int[][] pascal = createPascalDreieck(arraysize);
        printPascal(pascal);
//        print2DArray(pascal);
    }

    public static int[][] createPascalDreieck(int arraysize) {
        int[][] values = new int[arraysize][arraysize];

        for (int irow = 0; irow < values.length; irow++) {
            for (int icol = 0; icol < values[irow].length; icol++) {
                if (irow == 0 || icol == 0) {
                    values[irow][icol] = 1;
                } else {
                    values[irow][icol] = values[irow][icol - 1] + values[irow - 1][icol];
                }
            }
        }
        return values;
    }

    public static void printPascal(int[][] matrix) {
        for (int irow = 0; irow < matrix.length; irow++) {
            for (int icol = 0; icol < matrix[irow].length; icol++) {
                System.out.printf("| %5d ", matrix[irow][icol]);

            }
            System.out.println("|");
        }
    }

    public static int readsize(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die Zahl muss Positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("das ist keine gültige Zahl!");
            }
        }
        return value;
    }
//    public static void print2DArray(int[][] values){
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(Arrays.toString(values[i]));
//        }
//    }

}
