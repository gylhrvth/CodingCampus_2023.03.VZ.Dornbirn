package joachim.Week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PascalDreieck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createArray(rows(),columns());
    }

    public static int[][] pascalDreieck;{}

    public static int rows(){
        Scanner scotty = new Scanner(System.in);
        int roworcol = 0;
        while (true) {
            try {
                System.out.println("Bitte gib die Reihen Anzahl and");
                roworcol = scotty.nextInt();
                scotty.nextLine();
            } catch (InputMismatchException ignore) {
                System.out.println("Eine Nummerische Zahl bitte!");
                scotty.nextLine();
            }
            return roworcol;
        }
    }
    public static int columns(){
        Scanner scotty = new Scanner(System.in);
        int roworcol = 0;
        while (true) {
            try {
                System.out.println("Bitte gib die Spalten Anzahl and");
                roworcol = scotty.nextInt();
                scotty.nextLine();
            } catch (InputMismatchException ignore) {
                System.out.println("Eine Nummerische Zahl bitte!");
                scotty.nextLine();
            }
            return roworcol;
        }
    }

    public static int[][] createArray(int rows,int cols) {
        int[][] values = new int[rows][cols];
        for (int irows = 0; irows < values.length; irows++) {
            for (int jcol = 0; jcol < values[irows].length; jcol++) {
                values[irows][jcol] = 0;
                System.out.printf("[  %4d]", values[0][0]);
            }
            System.out.println();
        }
        return values;
    }

}
