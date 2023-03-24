package eric.week03;

import lukas.week03.day4.Colors;
import lukas.week03.day4.ConwaysGameOfLife;

import java.security.SecureRandom;

public class GameOfLife {

    public static final int[][] LAYOUT = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public static void main(String[] args) {
        int[][] printLayOut = LAYOUT;

        while (true) {
            int[][] newField = new int[printLayOut.length][printLayOut[0].length];

            for (int row = 0; row < printLayOut.length; row++) {
                for (int col = 0; col < printLayOut[row].length; col++) {
                    int printRule34 = rule34(printLayOut, row, col);
                    newField[row][col] = printRule34;
                }
            }
            printLayOut = newField;
            printField(printLayOut);

            try {
                Thread.sleep(300);
            } catch (InterruptedException exc) {
                //noob
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

    public static int rule34(int[][] field, int row, int col) {
        int currentField = field[row][col];
        int neighboursAlive = 0;
        int checkField = 0;

        neighboursAlive += fieldValue(field, row, col - 1);
        neighboursAlive += fieldValue(field, row - 1, col);
        neighboursAlive += fieldValue(field, row, col + 1);
        neighboursAlive += fieldValue(field, row + 1, col);
        neighboursAlive += fieldValue(field, row - 1, col - 1);
        neighboursAlive += fieldValue(field, row + 1, col - 1);
        neighboursAlive += fieldValue(field, row - 1, col + 1);
        neighboursAlive += fieldValue(field, row + 1, col + 1);


        if (currentField == 0) {
            if (neighboursAlive == 3) {
                checkField = 1;
            }
        } else {
            if (neighboursAlive == 2 || neighboursAlive == 4) {
                checkField = 1;
            } else if (neighboursAlive == 5) {
                checkField = 1;
            } else {
                checkField = 0;
            }
        }
        //
//        if (currentField == 1) {
//            if (neighboursAlive == 3) {
//                checkField = 1;
//            }
//        } else {
//            if (neighboursAlive == 2 || neighboursAlive == 3 || neighboursAlive == 4 || neighboursAlive == 5){
//                checkField = 1;
//            } else if (neighboursAlive < 2 || neighboursAlive > 6) {
//                checkField = 0;
//            }
//        }
//        System.out.println("Zelle " + checkField + ", Lebendige Nachbarn: " + neighboursAlive + " -> " + checkField);
        return checkField;
    }


    public static void printField(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int field = arr[row][col];
                if (field == 0) {
                    System.out.print(Colors.COLORS[4] + field + " " + Colors.RESET);
                } else {
                    System.out.print(Colors.COLORS[1] + field + " " + Colors.RESET);
                }
            }
            System.out.println();
        }
    }
}
