package mert.Week03;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        int player = 1;
        int movesleft = 9;
        boolean win = false;

        print2dArray(array);
        while (movesleft > 0 && !win) {
            int pos = -1;

            while (!guilty2(array, pos)) {
                pos = guilty("Player " + player + ": Geben Sie eine Position: ", 1, 9);
            }
            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;

            array[row][col] = player;
            print2dArray(array);

            player = player - 3;

        }
    }

        public static void print2dArray ( int[][] values){
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

        public static int guilty (String message,int min, int max){
            int result = Integer.MIN_VALUE;
            Scanner sc = new Scanner(System.in);

            while (result < min || result > max) {
                System.out.println(message);
                String line = sc.nextLine();
                try {
                    result = Integer.parseInt(line);
                    if (result < min) {
                        System.out.println("Die Zahl darf nicht kleiner sein als" + min);
                    } else if (result > max) {
                        System.out.println("Die Zahl darf nicht kleiner sein als" + max);
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Geben sie eine Zahl ein");
                }
            }
            return result;

        }

        public static boolean guilty2 ( int[][] field, int pos){
            if (pos < 1) {
                return false;

            }
            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;
            if (field[row][col] != 0) {
                System.out.println("Diese Posionist belegt. Geben sie eine neue ein");
                return false;
            }
            return true;
        }
    }




