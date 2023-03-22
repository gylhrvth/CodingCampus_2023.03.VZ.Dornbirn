package joachim.Week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] field = new char[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '-';
            }

        }
        System.out.println("Hello! Who are you?");
        String p1 = scanner.nextLine();
        System.out.println("Hello " + p1 + "\nWho is the second Player?");
        String p2 = scanner.nextLine();
        System.out.println("Hello " + p2 + " Let's begin");

        boolean game = true;
        while (game = true) {

            int player = 0;
            if (player == 0) {
                try {
                    boolean answer = false;
                    while(!answer) {
                        System.out.println(p1 + " Please Choose a Row (0, 1, 2), afterwards a Column");
                        int row = scanner.nextInt();
                        System.out.println("Good. Now a Column (0, 1, 2)");
                        int col = scanner.nextInt();
                        field[row][col] = 'X';
                        printfield(field);
                        if (row < 0 || row > 2 || col < 0 || col > 2) {
                            System.out.println("Please use the given numbers (0, 1, 2)");
                            answer = true;
                        }
                    }

                } catch (InputMismatchException ime) {
                    System.out.println("A number please " + p1);
                }
            } else {
                try {
                    boolean answer = false;
                    while (!answer)
                    System.out.println(p2 + " Please Choose a Row (0, 1, 2), afterwards a Column");
                    int row = scanner.nextInt();
                    System.out.println("Good. Now a Column... (0, 1, 2)");
                    int col = scanner.nextInt();
                    if (row < 0 || row > 2 || col < 0 || col > 2) {
                        System.out.println("Please use the given numbers (0, 1, 2)");
                        return;
                    }
                    field[row][col] = 'O';
                    printfield(field);
                    player = 0;
                } catch (InputMismatchException ime) {
                    System.out.println("A number please " + p2);
                }
            }
            for (int i = 0; i < 9; i++) {
                if (i == 9) {
                    System.out.println("Unentschieden");
                    boolean game = false;
                    return game;
                }
            }
        }

    }

    public static void printfield(char[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}