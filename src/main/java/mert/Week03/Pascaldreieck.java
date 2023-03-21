package mert.Week03;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;

public class Pascaldreieck {
    public static void main(String[] args) {

        int rows = ConsoleInputNumber.readNumber_v5("Wie viele Zeilen?", 1, 50);
        int cols = ConsoleInputNumber.readNumber_v5("Wie viele Spalten?", 1, 50);

        int[][] array = createArray(rows, cols);
        print2dArray(array);


    }

    public static int[][] createArray(int rows, int colums) {
        int[][] result = new int[rows][colums];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

            }
        }
        return result;
    }

    public static void print2dArray(int[][] values) {

        for (int i = 0; i < values.length; i++) {

            System.out.println(Arrays.toString(values[i]));

        }
    }
}

