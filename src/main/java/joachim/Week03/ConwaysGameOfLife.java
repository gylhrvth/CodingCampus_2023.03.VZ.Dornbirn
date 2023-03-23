package joachim.Week03;


import java.util.Arrays;

public class ConwaysGameOfLife {

    public static void main(String[] args) {
        int[][] currentField = lukas.week03.day4.ConwaysGameOfLife.SEGLER;
        while (true) {
            int[][] newField = killswitch(currentField);
            printMatrix(newField);
            currentField = newField;
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                //noop
            }
            clearScreen();
        }
    }

    public static final int[][] GLEITER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };


    public static int[][] killswitch(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];
        alive(arr, copy);
        return copy;
    }

    public static void alive(int[][] arr, int[][] copy) {
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
                    if(aliveNeighbours == 2 || aliveNeighbours == 3) {
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

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}