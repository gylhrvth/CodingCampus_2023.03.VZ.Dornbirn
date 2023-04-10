/*package eric.osterFerien.ticTacToeKI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeBot {
    private static char player = 'X', opponent = 'O';
    private static Scanner scan = new Scanner(System.in);

    private static class Move {
        int row, col;
    }

    public static char[][] board = new char[][]
            {{' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

    public static void main(String[] args) {
        printBoardEmptySpace(board);
        printBoard(board);
        while (!isMoveLeft(board)) {
            minimaxKI(board, -1, !isMoveLeft(board));
            printBoard(board);
        }
    }

    public static Boolean isMoveLeft(char board[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public static int evaluate(char b[][]) {
        //Kontrolliert die Reihe eine Win Condition vorhanden ist
        for (int row = 0; row < 3; row++) {
            if (b[row][0] == b[row][1] &&
                    b[row][1] == b[row][2]) {
                if (b[row][0] == player) {
                    return +10;
                } else if (b[row][0] == opponent) {
                    return -10;
                }
            }
        }
        //Kontrolliert die Zeilen ob eine Win Condition vorhanden ist
        for (int col = 0; col < 3; col++) {
            if (b[0][col] == b[1][col] &&
                    b[1][col] == b[2][col]) {
                if (b[0][col] == player) {
                    return +10;
                } else if (b[0][col] == opponent) {
                    return -10;
                }
            }
        }
        //Kontrolliert ob Quer eine Win Condition vorhanden ist
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            if (b[0][0] == player) {
                return +10;
            } else if (b[0][0] == opponent) {
                return -10;
            }
        }
        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            if (b[0][2] == player) {
                return +10;
            } else if (b[0][2] == opponent) {
                return -10;
            }
        }
        //Wenn keine Condition eintrifft return 0
        return 0;
    }

    public static int minimaxKI(char board[][], int depth, Boolean isMax) {
        int score = evaluate(board);
        if (score == 10) {
            return score;
        }
        if (score == -10) {
            return score;
        }
        if (isMoveLeft(board) == false) {
            return 0;
        }
        if (isMax) {
            int best = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    try {
                        System.out.println("Bitte gib eine Zahl ein!");
                        scan.nextLine();
                        if (board[i][j] == ' ') {
                            board[i][j] = player;
                            best = Math.max(best, minimaxKI(board, +1, !isMax));
                            board[i][j] = ' ';
                        }
                    } catch (InputMismatchException ime) {
                        System.out.println("Input wurde nicht akzeptiert bitte probier es nochmal!");
                        scan.nextLine();
                    }
                }
            }

            return best;
        } else {
            int best = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = opponent;
                        best = Math.max(best, minimaxKI(board, +1, !isMax));
                        board[i][j] = ' ';
                    }
                }
            }
            return best;
        }
    }


    public static void printBoardEmptySpace(char board[][]) {
        for (int emptySpaceI = 0; emptySpaceI < 3; emptySpaceI++) {
            for (int emptySpaceJ = 0; emptySpaceJ < 3; emptySpaceJ++) {
                board[emptySpaceI][emptySpaceJ] = ' ';
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------------");
        for (int boardDesign = 0; boardDesign < 3; boardDesign++) {
            System.out.print("| ");
            for (int boardDesign2 = 0; boardDesign2 < 3; boardDesign2++) {
                System.out.print(board[boardDesign][boardDesign2] + " | ");

            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}*/
