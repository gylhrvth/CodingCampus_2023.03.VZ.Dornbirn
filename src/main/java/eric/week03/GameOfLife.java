package eric.Week03;

import lukas.week03.day4.Colors;

public class GameOfLife {

    public static final int[][] LAYOUT = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
    };

    public static void main(String[] args) {
        int[][] printLayOut = LAYOUT;

        while (true) {
            int[][] newField = new int[printLayOut.length][printLayOut[0].length];

            for (int row = 0; row < printLayOut.length; row++) {
                for (int col = 0; col < printLayOut[row].length; col++) {
                    int printRule = rulesToLive(printLayOut, row, col);
                    newField[row][col] = printRule;
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
        //row wird überprüft ob es kleiner als 0 ist, wenn ja wird der wert auf den letzten index des Arrays gestellt
        if (row < 0) {
            row = field.length - 1;
        } else if (row >= field.length) {
            row = 0;
        }

        //col wird überprüft ob es kleiner als 0 ist, wenn ja wird der wert auf den letzten index des Arrays gestellt
        if (col < 0) {
            col = field[0].length - 1;
        } else if (col >= field[0].length) {
            col = 0;
        }
        return field[row][col];
    }

    public static int rulesToLive(int[][] field, int row, int col) {
        int currentField = field[row][col];
        int neighboursAlive = 0;
        int checkField = 0;

        //Aktivierung des Feldes in alle richtungen wo es sich bewegen kann
        neighboursAlive += fieldValue(field, row, col - 1);                  //mitte eins runter
        neighboursAlive += fieldValue(field, row - 1, col);                 //mitte eins nach links
        neighboursAlive += fieldValue(field, row, col + 1);                  //mitte eins nach oben
        neighboursAlive += fieldValue(field, row + 1, col);                 //mitte eins nach rechts

        //Felder Diagonal
        neighboursAlive += fieldValue(field, row - 1, col - 1);         //links unten
        neighboursAlive += fieldValue(field, row + 1, col - 1);         //rechts unten
        neighboursAlive += fieldValue(field, row - 1, col + 1);         //links oben
        neighboursAlive += fieldValue(field, row + 1, col + 1);         //rechts oben

        //Regeln zum überleben/Erstellen/Sterben
        if (currentField == 0) {
            if (neighboursAlive == 3) {
                checkField = 1; //wenn 3 nachbarn Überlebt/Gebärt es in der nächsten Gen
            }
        } else {
            if (neighboursAlive == 2 || neighboursAlive == 4) {
                checkField = 1; //wenn 2 oder 4 nachbarn Überlebt/Gebärt es in der nächsten Gen
            } else if (neighboursAlive == 5) {
                checkField = 1; //wenn 5 nachbarn Überlebt/Gebärt es in der nächsten Gen
            } else {
                checkField = 0; //wenn nix davon eintrifft stirbt es in der nächsten Gen
            }
        }
        return checkField;
    }


    public static void printField(int[][] arr) {
        //2 dimensionales Feld damit es das Layout ausdruckt
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int field = arr[row][col];
                if (field == 0) {
                    //Felder mit einem wert von 0 sind blau
                    System.out.print(Colors.COLORS[4] + field + " " + Colors.RESET);
                } else {
                    //Felder mit einem wert von 1 sind rot
                    System.out.print(Colors.COLORS[1] + field + " " + Colors.RESET);
                }
            }
            System.out.println();
        }
    }
}
