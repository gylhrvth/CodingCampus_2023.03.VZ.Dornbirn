package benjamin.week03;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        System.out.println("Willkomen bei TicTacToe!");
        int[][] tictactoe = createTicTacToe();
        print2DArray(tictactoe);

    }

    public static int[][] createTicTacToe() {
        int[][] field = new int[3][3];
        int currentPlayer = 1;
        boolean gameEnd = false;


        //Züge des Spielers eingeben und vergleichen ob das Feld schon befüllt ist
        while (!gameEnd) {
            print2DArray(field);
            boolean occupied = false;
            while (!occupied) {
                System.out.println("Spieler " + currentPlayer + " du bist dran!");
                int row = consoleInput("Gib die Reihe ein (0-2)", 0, 2);
                int col = consoleInput("Gib die Spalte ein (0-2)", 0, 2);

                if (field[row][col] != 0) {
                    System.out.println("Schon besetzt!");
                } else {
                    field[row][col] = currentPlayer;
                    occupied = true;
                }    //Unentschieden ermitteln
                if (hasDraw(field)) {
                    System.out.println(">>>Unentschieden<<<");
                    gameEnd = true;
                }
            }

            // das wird ein großer Block!!!!!!!! :)

            //Sieger ermitteln (Unten sind noch Infos für Verbesserungspotenzial)
            if ((field[0][0] == currentPlayer && field[0][1] == currentPlayer && field[0][2] == currentPlayer
                    || field[1][0] == currentPlayer && field[1][1] == currentPlayer && field[1][2] == currentPlayer
                    || field[2][0] == currentPlayer && field[2][1] == currentPlayer && field[2][2] == currentPlayer
                    || field[0][0] == currentPlayer && field[1][0] == currentPlayer && field[2][0] == currentPlayer
                    || field[0][1] == currentPlayer && field[1][1] == currentPlayer && field[2][1] == currentPlayer
                    || field[0][2] == currentPlayer && field[1][2] == currentPlayer && field[2][2] == currentPlayer
                    || field[0][0] == currentPlayer && field[1][1] == currentPlayer && field[2][2] == currentPlayer)
                    || field[0][2] == currentPlayer && field[1][1] == currentPlayer && field[2][0] == currentPlayer) {

                gameEnd = true;
                System.out.println("Spieler " + currentPlayer + " hat gewonnen!!");
            }

            //player switchen
            //currentPlayer = 3 - currentPlayer;
            if (!gameEnd)
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
        }

        return field;

        //Infos:
        //GUTE ÜBUNG Sieger ermitteln mit Methoden  2x Diagonal, 1x Vertikal, 1x Horizontal
        //Premium Unentschieden nach 9 Spielzügen momentan Unentschieden wenn das Board voll ist

    }

    public static boolean hasDraw(int[][] field) {
        boolean boardFull = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++)
                if (field[i][j] == 0) {
                    boardFull = false;
                }
        }
        return boardFull;
    }


    public static void print2DArray(int[][] dim) {
        System.out.println("<<<<Matchfield>>>>>");
        System.out.println("-------------------");
        for (int i = 0; i < dim.length; i++) {
            System.out.print("|");
            for (int j = 0; j < dim[i].length; j++) {
                System.out.printf("%3d ", dim[i][j]);
                System.out.print(" |");
            }

            System.out.println();
            System.out.println("-------------------");
        }

    }

    //    public static int consoleInput(String message) {
    public static int consoleInput(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein! ");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Zahl.");
            }
        }
        return value;
    }

}




