package joachim.Week03;


import java.util.Arrays;

public class ConwaysGameOfLife {

    public static void main(String[] args) {
        killswitch(GLEITER);
        clearScreen();
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


    public static void killswitch(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    alive(arr, copy);
                } else {
                    dead(arr, copy);
                }
            }
        }
        printMatrix(arr);
    }

    public static int[][] alive(int[][] arr, int[][] copy) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (getCell(arr, i + 1, j) + getCell(arr, i, j + 1) + getCell(arr, i + 1, j + 1) + getCell(arr, i - 1, j) + getCell(arr, i, j - 1) + getCell(arr, i - 1, j - 1) + getCell(arr, i + 1, j - 1) + getCell(arr, i - 1, j + 1) == 3) {
                    arr[i][j] = 1;
                } else {
                    break;
                }
                arr = copy;
            }
        }
        return copy;
    }

    public static int[][] dead(int[][] arr, int[][] copy) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (getCell(arr, i + 1, j) + getCell(arr, i, j + 1) + getCell(arr, i + 1, j + 1) + getCell(arr, i - 1, j) + getCell(arr, i, j - 1) + getCell(arr, i - 1, j - 1) + getCell(arr, i + 1, j - 1) + getCell(arr, i - 1, j + 1) < 2) {
                    arr[i][j] = 0;
                }
                if (getCell(arr, i + 1, j) + getCell(arr, i, j + 1) + getCell(arr, i + 1, j + 1) + getCell(arr, i - 1, j) + getCell(arr, i, j - 1) + getCell(arr, i - 1, j - 1) + getCell(arr, i + 1, j - 1) + getCell(arr, i - 1, j + 1) > 3) {
                    arr[i][j] = 0;
                }
                arr = copy;
            }
        }
        return copy;
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
    public static void printMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(Arrays.toString(array));
            }
            System.out.println();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}