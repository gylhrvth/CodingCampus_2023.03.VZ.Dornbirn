package eric.Week03;

import java.util.Arrays;

public class ConwayGameOfLife {
    public static void main(String[] args) {

        int[][] printGlider = lukas.week03.day4.ConwaysGameOfLife.SEGLER;
        lukas.week03.day4.ConwaysGameOfLife.clearScreen();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //noop
        }

        for (int row = 0; row < printGlider.length; row++) {
            for (int col = 0; col < printGlider[row].length; col++) {
                int printRulesOfLife = rulesOfLife(printGlider, row, col);
                int printFieldValue = fieldValue(printGlider, row, col);
                System.out.println(printRulesOfLife + printFieldValue);
            }
        }
    }


    public static int fieldValue(int[][] field, int row, int col) {
        if (row < 0) {
            row = field.length - 1;
        } else if (row >= field.length) {
            row = 0;
        }


        if (col < 0) {
            col = field[0].length;
        } else if (col >= field[0].length) {
            col = 0;
        }
        return field.length;
    }

    public static int rulesOfLife(int[][] field, int row, int col) {

        int currentField = field[row][col];

        int livingNeighbours = 0;

        livingNeighbours += fieldValue(field, row, col - 1);
        livingNeighbours += fieldValue(field, row - 1, col);
        livingNeighbours += fieldValue(field, row, col + 1);
        livingNeighbours += fieldValue(field, row + 1, col);
        livingNeighbours += fieldValue(field, row - 1, col - 1);
        livingNeighbours += fieldValue(field, row + 1, col - 1);
        livingNeighbours += fieldValue(field, row - 1, col + 1);
        livingNeighbours += fieldValue(field, row + 1, col + 1);

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
}
