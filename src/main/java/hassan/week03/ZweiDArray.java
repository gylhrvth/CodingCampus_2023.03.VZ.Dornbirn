package hassan.week03;

import java.util.Random;
import java.util.Scanner;

public class ZweiDArray {
    static Random rand = new Random();

    public static void main(String[] args) {

        int rows = getArrayLength("Gib Anzahl der Zeilen ein : ");
        int cols = getArrayLength("Gib Anzahl der Spalten ein: ");


        //2-D Array
        System.out.println();
        int[][] zweid = creatzweiDArray(rows, cols);
        int[] sum = arraySummeReihe(zweid);
        System.out.println("=======2D Array======");
        for (int i = 0; i < zweid.length; i++) {
            for (int j = 0; j < zweid[i].length; j++) {
                System.out.printf("%3d ", zweid[i][j]);
            }


            System.out.println();
        }

        //Zum Benutzer Fragen was er rechnen will
        boolean repeat = true;
        while (repeat) {
            System.out.println("1 für REIHE.");
            System.out.println("2 für SPALTE.");
            System.out.println("------------");
            System.out.println("0 für EXIT");
            int choose = readSum("Was Willst du ausrechnen?", 0, 2);
            if (choose == 1) {
                int[] sumcol = arraySummeReihe(zweid);
                for (int i = 0; i < zweid.length; i++) {

                    System.out.printf("(SUMME : %4d)", sumcol[i]);
                    System.out.println();
                }
            } else if (choose == 2) {
                int[] sumrow = arraySummeSpalte(zweid);
                for (int i = 0; i < zweid[0].length; i++) {
                    System.out.printf("(SUMME : %4d)", sumrow[i]);
                    System.out.println();
                }
            } else if (choose == 0) {
                repeat = false;
            } else {
                System.out.println("Gib 1 für Reihe und 2 für Spalte..");
            }
        }
        System.out.println("Ciaoooooooo");

    }

    public static int[][] creatzweiDArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randomValue = rand.nextInt(101);
                array[i][j] = randomValue;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            }
        }
        return array;
    }

    public static int[] arraySummeReihe(int[][] arr) {
        int[] sums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sums[i] = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sums[i] += arr[i][j];
            }
        }
        return sums;
    }


    public static int[] arraySummeSpalte(int[][] arr) {
        int[] sums = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sums[i] += arr[j][i];
            }
        }
        return sums;
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
                    System.out.println("die zahl muss POSITIV sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Das Ist Keine Gültige Zahl!!!");
            }
        }
        return value;
    }

    public static int readSum(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean nubmerIsValid = false;
        while (!nubmerIsValid) {

            System.out.println(message);
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
