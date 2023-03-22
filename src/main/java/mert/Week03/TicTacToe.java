package mert.Week03;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        int player = 1;


        boolean gameover = false;
        while (!gameover) {
            print2dArray(array);
            System.out.println("Spieler " + player + "ist am zug");


        }
    }


    public static void print2dArray(int[][] values) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (values[i][j] == 0) {
                    System.out.print("| |");
                } else if (values[i][j] == 1) {
                    System.out.print("|X|");
                } else if (values[i][j] == 2) {
                    System.out.print("|o|");

                }
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    public static void spielZug() {
        int player = 1;

    }
}




