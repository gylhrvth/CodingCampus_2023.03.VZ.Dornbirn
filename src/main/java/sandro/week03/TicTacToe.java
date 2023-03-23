package sandro.week03;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] field = createArray();
        print2DArray(field);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;

            }
        }


    }


    public static boolean winner() {
        return true;
    }

    public static int[][] createArray() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static void print2DArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(Arrays.toString(values[i]));
        }
    }

    public static int readinput(String message) {
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
                    System.out.println("die Zahl muss positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("das ist keine gültige Zahl");
            }
        }
        return value;
    }

    public static int readPosition(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Wähle eine Zahl zwischen " + minValue + " und " + maxValue + " um fort zu fahren");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Deine Zahl ist ungültig!!!");
            }
        }
        return value;
    }


}
