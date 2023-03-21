package ayguen.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays2D {
    public static Random rand = new Random();
    private static int anzahlSpalten;

    public static void main(String[] args) {
        int anzahlReihen = readsquare("Wie viele Reihen möchten sie haben?", 0, 100);
        int anzahlSpalten = readsquare("Wie viele Spalten möchten sie haben ?", 0, 100);

        int[][] values = createValues100(anzahlSpalten, anzahlReihen);

        print2dArray(values, sumRows(values));
        System.out.println("SUM: " + Arrays.toString(sumColumns(values)));


    }

    public static int[][] createValues100(int columns, int rows) {
        int[][] values = new int[columns][rows];
        for (int iSpalte = 0; iSpalte < values.length; iSpalte++) {
            for (int iRheihe = 0; iRheihe < values[iSpalte].length; iRheihe++) {
                values[iSpalte][iRheihe] = rand.nextInt(101);
            }
        }
        return values;
    }

    public static void print2dArray(int[][] arr, int[] sumRows) {
        if (arr.length < 1) {
            System.out.println("Empty");
            return;
        }

        for (int iReihe = 0; iReihe < arr[0].length; iReihe++) {
            for (int iSpalte = 0; iSpalte < arr.length; ++iSpalte) {
                System.out.printf(" %3d", arr[iSpalte][iReihe]);
            }
            System.out.printf(" | %5d", sumRows[iReihe]);
            System.out.println();
        }
    }


    public static int[] sumRows(int[][] arr) {
        if (arr.length < 1) {
            return new int[]{};
        }

        int[] result = new int[arr[0].length]; // Anzahl Zeilen in der 1. Spalte
        for (int iReihe = 0; iReihe < arr[0].length; iReihe++) {
            result[iReihe] = 0;
            for (int iSpalte = 0; iSpalte < arr.length; ++iSpalte) {
                result[iReihe] += arr[iSpalte][iReihe];
            }
        }return result;
    }
    public static int[] sumColumns(int [][] arr) {

        int[] result = new int[arr.length]; // Anzahl Spalten
        for (int iSpalte = 0; iSpalte < result.length; iSpalte++) {
            result[iSpalte] = 0;
        }

        for (int iReihe = 0; iReihe < arr[0].length; iReihe++) {
            for (int iSpalte = 0; iSpalte < arr.length; ++iSpalte) {
                result[iSpalte] += arr[iSpalte][iReihe];
            }
        }
        return result;
    }



    public static int readsquare(String Frage, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(Frage);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);

                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein!");
                }
            } catch (NumberFormatException nme) {
                System.out.println("Das geht nicht!");

            }
        }
        return value;
    }
}



