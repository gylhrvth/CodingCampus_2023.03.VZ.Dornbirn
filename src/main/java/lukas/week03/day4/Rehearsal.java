package lukas.week03.day4;

import java.util.Arrays;

public class Rehearsal {
    public static void main(String[] args) {
        int height = 10;
        int width = 10;

        int[][] arr = new int[height][width];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random() * 100);
            }
        }


        int[] arr1 = new int[]{10, 9, 8, 7, 6};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int[] myInt : arr) {
            System.out.println(myInt);
        }


        printArr(arr);

        arr[4][2] = 100;

        System.out.println("---");


        int[] lastRow = arr[arr.length - 1];
        lastRow[lastRow.length - 1] = 101;

        printArr(arr);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hallo");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException exc) {
                //noop
            }
        }

        //Bedeutung ist die selbe
        int[][] arr2;
        int arr3[][];


    }

    public static void printArr(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
