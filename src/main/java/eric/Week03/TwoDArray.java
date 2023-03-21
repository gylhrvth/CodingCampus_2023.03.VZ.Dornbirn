package eric.Week03;

import java.security.SecureRandom;
import java.util.Scanner;

public class TwoDArray {
    static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        int rows = getArrayLength("Gib Anzahl der Zeilen ein : ");
        int cols = getArrayLength("Gib Anzahl der Spalten ein: ");

        System.out.println();
        int[][] twoD = creatzweiDArray(rows, cols);
        System.out.println("----===2D Array===----");
        for (int iRow = 0; iRow < twoD.length; iRow++) {
            for (int iCol = 0; iCol < twoD[iRow].length; iCol++) {
                System.out.printf("%4d ", twoD[iRow][iCol]);
            }
            System.out.println();
        }

        boolean repeat = true;

        while (repeat) {
            System.out.println();
            System.out.println("Willst du jeweils die Reihen oder Spalten ausgerechnet haben?");
            System.out.println("1 - Reihe");
            System.out.println("2 - Spalte");
            System.out.println("--------");
            System.out.println("0 - EXIT");
            int choose = askForRowOrCol(" ", 0, 2);

            if (choose == 1) {
                int[] sumRow = rowSum(twoD);
                for (int iRow = 0; iRow < twoD.length; iRow++) {
                    System.out.printf(" (SUM = %6d)", sumRow[iRow]);
                }
            } else if (choose == 2) {
                int[] sumCol = colSum(twoD);
                for (int iCol = 0; iCol < twoD[0].length; iCol++) {
                    System.out.printf(" (SUM = %6d)", sumCol[iCol]);
                }
            } else if (choose == 0) {
                repeat = false;
            } else {
                System.out.println("Bitte gib 1 für Reihe oder 2 für Spalten an!");
            }
        }
        System.out.println("Auf Wiedersehen!!!");
    }
    public static int[][] creatzweiDArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randomValue = rand.nextInt(10);
                array[i][j] = randomValue;
            }
        }
        return array;
    }

    public static int[] rowSum(int[][] arr){
        int[] sum = new int[arr.length];
        for (int iRow = 0; iRow < arr.length; iRow++) {
            sum[iRow] = 0;
            for (int iCol = 0; iCol < arr[iRow].length; iCol++){
                sum[iRow] += arr[iRow][iCol];
            }
        }
        return sum;
    }

    public static int[] colSum(int[][] arr){
        if (arr.length < 1){
            return new int[]{};
        }
        int[] sum = new int[arr[0].length];
        for (int iRow = 0; iRow < arr.length; iRow++) {
            for (int iCol = 0; iCol < sum.length; iCol++){
                sum[iCol] += arr[iRow][iCol];
            }
        }
        return sum;
    }

    public static int getArrayLength(String message) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = scanner.nextLine();
                value = Integer.parseInt(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die zahl MUSS Positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Wer lesen kann ist KLAR im VORTEIL!!!");
            }
        }
        return value;
    }

    public static int askForRowOrCol(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean nubmerIsValid = false;
        while (!nubmerIsValid) {

            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    nubmerIsValid = true;
                } else {
                    System.out.println("Wie oben schon genannt MUSS!! die Zahl zwischen " + minValue + " und " + maxValue + " sein.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist keine Gültige Zahl");
            }
        }
        return value;
    }
}