package mert.Week03;

import lukas.week03.day4.ConwaysGameOfLife;

import java.util.Arrays;

public class ConwaysGameofLife {
    public static void main(String[] args) {
        int[][] field = ConwaysGameOfLife.GLEITER;


        while (true) {
            int[][] newField = new int[field.length][field[0].length];
            for (int row = 0; row < field.length; row++) {
                for (int col = 0; col < field[row].length; col++) {
                    int newCell = rules(field, row, col);
                    newField[row][col] = newCell;
                    lukas.week03.day4.ConwaysGameOfLife.clearScreen();
                }
            }
            printField(newField);
            field = newField;

            try {
                Thread.sleep(1000);
            }catch (InterruptedException exc){

            }
        }
    }

    public static void printField(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public static int getNeighbours(int[][] field, int row, int col) {
        if (row < 0) {
            row = field.length - 1;
        } else if (row >= field.length) {
            row = 0;

        }

        if (col < 0) {
            col = field[0].length - 1;
        } else if (col >= field[0].length) {
            col = 0;
        }

        return field[row][col];
    }

    public static int rules(int[][] field, int row, int col) {
        int currentCell = field[row][col];

        int aliveNeighbours = 0;
        aliveNeighbours += getNeighbours(field, row, col - 1);
        aliveNeighbours += getNeighbours(field, row - 1, col - 1);
        aliveNeighbours += getNeighbours(field, row - 1, col);
        aliveNeighbours += getNeighbours(field, row, col + 1);
        aliveNeighbours += getNeighbours(field, row - 1, col + 1);
        aliveNeighbours += getNeighbours(field, row + 1, col + 1);
        aliveNeighbours += getNeighbours(field, row + 1, col);
        aliveNeighbours += getNeighbours(field, row + 1, col - 1);


        //Rules anwenden

        if (currentCell == 0) {
            if (aliveNeighbours == 3) {
                return 1;
            }
        } else {
            if (aliveNeighbours < 2) {
                return 0;
            } else if (aliveNeighbours == 2 || aliveNeighbours == 3) {
                return 1;
            } else if (aliveNeighbours > 3) {
                return 0;
            }


        }
        return 0;
    }
}
