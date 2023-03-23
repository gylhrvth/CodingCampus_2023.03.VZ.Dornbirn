package joachim.Week03;


public class ConwaysGameOfLifeSaftyCopy {

    public static void main(String[] args) {
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
    }

    public static int[][] alive(int[][] arr, int[][] copy) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i - 1][j] + arr[i][j - 1] + arr[i - 1][j - 1] + arr[i + 1][j - 1] + arr[i - 1][j + 1] == 3) {
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
                if (arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i - 1][j] + arr[i][j - 1] + arr[i - 1][j - 1] + arr[i + 1][j - 1] + arr[i - 1][j + 1] < 2) {
                    arr[i][j] = 0;
                }
                if (arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i - 1][j] + arr[i][j - 1] + arr[i - 1][j - 1] + arr[i + 1][j - 1] + arr[i - 1][j + 1] > 3) {
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

}
