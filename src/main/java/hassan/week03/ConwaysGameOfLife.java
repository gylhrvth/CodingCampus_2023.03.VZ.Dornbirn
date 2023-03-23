package hassan.week03;

import java.util.Arrays;

public class ConwaysGameOfLife {
    public static void main(String[] args) {



    }


    private static int getFieldValue(int[][] field, int col, int row) {
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

    public static int applyRules(int[][] field, int col, int row) {

        int currentField = field[row][col];

        int livingNeighbours = 0;

        livingNeighbours += getFieldValue(field, col - 1, row);
        livingNeighbours += getFieldValue(field, col + 1, row);
        livingNeighbours += getFieldValue(field, col, row - 1);
        livingNeighbours += getFieldValue(field, col, row + 1);
        livingNeighbours += getFieldValue(field, col - 1, row - 1);
        livingNeighbours += getFieldValue(field, col + 1, row - 1);
        livingNeighbours += getFieldValue(field, col - 1, row + 1);
        livingNeighbours += getFieldValue(field, col + 1, row + 1);

        int nextField = 0;

        if (currentField == 0) {
            if (livingNeighbours == 3) {
                nextField = 1;
            }
        } else {
            if (livingNeighbours < 2) {
                nextField = 0;
            } else if (livingNeighbours == 2 || livingNeighbours == 3) {
                nextField = 1;
            } else if (livingNeighbours > 3) {
                nextField = 0;
            }
        }

        return nextField;
    }

    public static void printfield(int [] [] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%3d ", field[i][j]);
            }
            System.out.println();
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


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}