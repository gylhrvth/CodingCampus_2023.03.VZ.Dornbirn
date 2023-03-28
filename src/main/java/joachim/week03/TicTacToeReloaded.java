package joachim.Week03;

import java.util.Scanner;

public class TicTacToeReloaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }

        }
        System.out.println("Hello! Who are you?");
        String p1 = scanner.nextLine();
        System.out.println("Hello " + p1 + "\nWho is the second Player?");
        String p2 = scanner.nextLine();
        System.out.println("Hello " + p2 + " Let's begin");

        boolean game = true;
        boolean player = true;
        while (game) {
            if (player) {
                System.out.println(p1 + "'s turn");
                ask(field, scanner, 1);
                prtint(field);
                if (winConditionReached(field, p1, 1)) {
                    game = false;
                }

            } else {
                System.out.println(p2 + "'s turn");
                ask(field, scanner, 2);
                prtint(field);
                if (winConditionReached(field, p2, 2)) {
                    game = false;
                }
            }

            player = !player;
        }
    }

    public static int[][] ask(int[][] arr, Scanner scanner, int player) {
        int row = 0;
        int col = 0;
        while (true) {
            try {
                System.out.println("where do you want to place your bet");
                System.out.println("choose a Row and a Column afterwards (0, 1, 2)");
                row = scanner.nextInt();
                System.out.println("Now a Column(0, 1, 2)");
                col = scanner.nextInt();
                if (arr[row][col] != 0) {
                    System.out.println("This field is already taken");
                } else {
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException Aiob){
                System.out.println("a number between (0, 1, 2)");
            }
        }
        arr[row][col] = player;
        return arr;
    }

    public static void prtint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" |  %1d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean winConditionReached(int[][] field, String p1, int playernumber) {
        //          Rows
        if (field[0][0] == 1 && field[0][1] == 1 && field[0][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
        if (field[1][0] == 1 && field[1][1] == 1 && field[1][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
        if (field[2][0] == 1 && field[2][1] == 1 && field[2][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
//          Columns
        if (field[0][0] == 1 && field[1][0] == 1 && field[2][0] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
        if (field[0][1] == 1 && field[1][1] == 1 && field[1][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
        if (field[0][2] == 1 && field[1][2] == 1 && field[2][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
//          Diagonal
        if (field[0][0] == 1 && field[1][1] == 1 && field[2][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }
        if (field[2][0] == 1 && field[1][1] == 1 && field[0][2] == playernumber) {
            System.out.println(p1 + " has won!");
            return true;
        }

        return false;
    }
}