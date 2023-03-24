package eric.Week03;

import lukas.week03.day4.Colors;

import java.util.Arrays;

public class ConwayGameOfLife {
    public static void main(String[] args) {
        int[][] printConwaysOfLife = lukas.week03.day4.ConwaysGameOfLife.GLEITER;


        while(true) {
            int[][] newField = new int[printConwaysOfLife.length][printConwaysOfLife[0].length];


            for (int row = 0; row < printConwaysOfLife.length; row++) {
                for (int col = 0; col < printConwaysOfLife[row].length; col++) {
                    int printRulesOfLife = rulesOfLife(printConwaysOfLife, row, col);
                    newField[row][col] = printRulesOfLife;
                }
            }

            printConwaysOfLife = newField;
            printField(printConwaysOfLife);

            try {
                Thread.sleep(250);
            } catch(InterruptedException exc) {
                //noop
            }
            lukas.week03.day4.ConwaysGameOfLife.clearScreen();
        }
    }


    public static int fieldValue(int[][] field, int row, int col) {
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

    public static void printField(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int field = arr[row][col];
                if (field == 0) {
                    System.out.print(Colors.COLORS[1] + field + " " + Colors.RESET);
                } else {
                    System.out.print(Colors.COLORS[2] + field + " " + Colors.RESET);
                }
            }
            System.out.println();
        }
    }
}