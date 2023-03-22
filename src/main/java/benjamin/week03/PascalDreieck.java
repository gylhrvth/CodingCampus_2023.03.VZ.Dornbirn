package benjamin.week03;

import java.util.Arrays;
import java.util.Scanner;

public class PascalDreieck {
    public static void main(String[] args) {

        int conIn = consoleInput("Gib die größe an!");

        int[][] pascal = createPascal(conIn);
        print2DArray(pascal);


    }




    public static void print2DArray(int[][] dim) {
        System.out.println("print2d:");
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                System.out.printf("%5d ", dim[i][j]);
            }
            System.out.println();
        }
//        System.out.println("\n");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
    public static int[][] createPascal(int dim) {
        int[][] pas = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if ( i == 0 || j == 0){
                    pas[i][j] = 1;
                } else {
                    pas[i][j] = pas[i - 1][j] + pas[i][j - 1];
                }
//                print2DArray(pas);
            }
        }
        return pas;
    }

    public static int consoleInput(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
                validInput = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist keine gültige Eingabe");
            }

        }
        return value;

    }


}
