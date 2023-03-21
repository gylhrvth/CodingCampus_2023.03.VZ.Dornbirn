package sandro.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2D {


    //todo print Row print Col
    //todo formatieren und optional Ausdrucken
    public static Random rand = new Random();

    public static void main(String[] args) {
        int rowspace = readRowspace("Wieviele Reihen?");
        int colspace = readColspace("Wieviele Spalten");

        int[][] randomArray = createRandomArray(rowspace, colspace);
        print2DArray(randomArray);

summerow(randomArray);
summecol(randomArray);
    }


//    public static int[] createRandomNumbers(int arrayspace) {
//        int[][] result = new int[arrayspace][arrayspace];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = rand.nextInt(101);
//
//        }
//        return result;
//    }


    public static int readRowspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die Zahl muss positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("das ist keine gültige Zahl");
            }
        }
        return value;
    }

    public static int readColspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die Zahl muss positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("das ist keine gültige Zahl");
            }
        }
        return value;
    }

    public static void print2DArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(Arrays.toString(values[i]));
        }
    }
    public static int[][] createRandomArray(int rowspace, int colspace) {
        int[][] value = new int[rowspace][colspace];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                value[i][j] = rand.nextInt(101);
                ;
            }
        }
        return value;
    }

    public static int[] summerow(int[][] arr) {
        int[] sum = new int[arr.length];
        for (int irow = 0; irow < arr.length; irow++) {
            sum[irow] = 0;
            for (int icol = 0; icol < arr[irow].length;  icol++) {
            sum[irow] += arr[irow][icol] ;
            }

        }
        System.out.print(Arrays.toString(sum));

        return sum;
    }

    public static int[] summecol(int[][] arr) {
        if (arr.length < 1) return new int[]{};
        int[] sum = new int[arr[0].length];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = 0;
        }

        for (int irow = 0; irow < arr.length; irow++) {
            for (int icol = 0; icol < arr[irow].length;  icol++) {
                sum[icol] += arr[irow][icol] ;
            }

        }
        System.out.print(Arrays.toString(sum));

        return sum;
    }

    public static void printArraySumRow(int [][] arr, int[] sumRow){
        for (int irow = 0; irow < arr.length; irow++) {
            for (int icol = 0; icol < arr[irow].length; icol++) {
                System.out.printf("| ");
            }
        }
    }


}
