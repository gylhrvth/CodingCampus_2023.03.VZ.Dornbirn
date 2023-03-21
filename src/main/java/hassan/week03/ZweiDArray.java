package hassan.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZweiDArray {
    static Random rand = new Random();

    public static void main(String[] args) {

        int rows = getArrayLength("Gib Anzahl der Zeilen ein : ");
        int cols = getArrayLength("Gib Anzahl der Spalten ein: ");


        //2-D Array
        System.out.println();
        int[][] zweid = creatzweiDArray(rows, cols);
        System.out.println("==2D Array==");
        for (int i = 0; i < zweid.length; i++) {
            for (int j = 0; j < zweid[i].length; j++) {
                System.out.printf("%2d ", zweid[i][j]);
            }
            System.out.println();
        }







    }

    public static int[][] creatzweiDArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randomValue = rand.nextInt(100);
                array[i][j] = randomValue;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            }
        }
        return array;
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
