package joachim.week03;


import lukas.week03.day4.Colors;

import java.util.Random;

public class ConwaysGameOfLife {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[][] currentField = createRandArray(50, 50);
        while (true) {
            int[][] newField = nextGen(currentField);
            printField(newField);
            currentField = newField;
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                //noop
            }
            clearScreen();
        }
    }

    public static int[][] nextGen(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];
        checkAndUpdateCells(arr, copy);
        return copy;
    }

    public static void checkAndUpdateCells(int[][] arr, int[][] copy) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int aliveNeighbours = getCell(arr, i + 1, j) + getCell(arr, i, j + 1) + getCell(arr, i + 1, j + 1) + getCell(arr, i - 1, j) + getCell(arr, i, j - 1) + getCell(arr, i - 1, j - 1) + getCell(arr, i + 1, j - 1) + getCell(arr, i - 1, j + 1);

                if (arr[i][j] == 0) {
                    if (aliveNeighbours == 3) {
                        copy[i][j] = 1;
                    }
                } else {
                    if (aliveNeighbours < 2) {
                        copy[i][j] = 0;
                    }
                    if (aliveNeighbours > 3) {
                        copy[i][j] = 0;
                    }
                    if (aliveNeighbours == 2 || aliveNeighbours == 3) {
                        copy[i][j] = 1;
                    }
                }
            }
        }
    }

    public static int getCell(int[][] field, int row, int col) {
        if (row < 0) {
            row = field.length - 1;
        } else if (row >= field.length) {
            row = 0;
        }

        if (col < 0) {
            col = field[row].length - 1;
        } else if (col >= field[row].length) {
            col = 0;
        }

        return field[row][col];
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" |  %1d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printField(int[][] arr) {
        System.out.println("Alive cells " + summeArray(arr));
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int field = arr[row][col];
                if (field == 0) {
                    System.out.print(Colors.COLORS[4] + Colors.BACKGROUND_COLORS[4] + " " + Colors.RESET);
                } else {
                    System.out.print(Colors.COLORS[2] + Colors.BACKGROUND_COLORS[2] + " " + Colors.RESET);
                }
            }
            System.out.println();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    public static int[][] createRandArray(int rows, int cols) {
        int[][] values = new int[rows][cols];
        for (int irows = 0; irows < values.length; irows++) {
            for (int jcol = 0; jcol < values[irows].length; jcol++) {
                values[irows][jcol] = rand.nextInt(2);
            }
        }
        return values;
    }

    public static int summeArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j]; // sum = sum + arr[i][j]
            }

        }
        return sum;
    }
}