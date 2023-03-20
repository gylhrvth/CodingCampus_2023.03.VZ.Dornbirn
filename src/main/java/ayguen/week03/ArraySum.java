package ayguen.week03;

import java.util.Arrays;
import java.util.Random;

public class ArraySum {
    public static Random rand = new Random();


    public static void main(String[] args) {
        int[] testArray = createArray(8);
        System.out.println(Arrays.toString(testArray));
        System.out.println();
        System.out.println("Count > 30: " + countOver30(testArray));
        System.out.println();
        System.out.println("sum = " + sum(testArray));
        System.out.println("");

        bubblesort(testArray);
        System.out.println("Bubblesort aufsteigend");
        System.out.println(Arrays.toString(testArray));


        bubblesort2(testArray);
        System.out.println("Bubblesort absteigend");
        System.out.println(Arrays.toString(testArray));

        gnomeSort(testArray);
        System.out.println("gnomeSort");
        System.out.println(Arrays.toString(testArray));
        System.out.println("");



        System.out.println("mergeSort");
        mergeSort("", testArray, 0, testArray.length);
        System.out.println(Arrays.toString(testArray));
        System.out.println();


        System.out.println("average: " + average(testArray));
        System.out.println("minimum: " + minimum(testArray));
        System.out.println("maximum: " + maximum(testArray));


    }

    public static int countOver30(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                ++result;
            }

        }
        return result;
    }

    public static int[] createArray(int size) {

        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);

        }
        return result;

    }

    public static int sum(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];

        }
        return result;
    }


    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    public static void bubblesort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    public static void gnomeSort(int[] arr) {

        int result = 0;

        while (result < arr.length) {
            if (result == 0)
                result++;
            if (arr[result] >= arr[result - 1])
                result++;
            else {
                int temp = 0;
                temp = arr[result];
                arr[result] = arr[result - 1];
                arr[result - 1] = temp;
                result--;
            }

        }

    }

    public static void mergeSort(String prefix, int[] arr, int lo, int hi) {

        if (hi - lo <= 1) return;
        int mid = (lo + hi) / 2;
        mergeSort(prefix + "  ", arr, lo, mid);
        mergeSort(prefix + "  ", arr, mid, hi);

        int[] temp = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 0;
        while ((i < mid) && (j < hi)) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                ++i;
                ++k;
            } else {
                temp[k] = arr[i];
                ++j;
                ++k;
            }
        }
        while (i < mid){
            temp[k] = arr [i];
            ++i;
            ++k;
        }
        while (i<mid){
            temp [k]=arr [i];
            ++j;
            ++k;
        }
        while (j < hi){
            temp[k] = arr [j];
            ++j;
            ++k;
        }
        for (int l = lo; l < hi ; l++) {
            arr[l] = temp [l - lo];

        }
        System.out.println(prefix + Arrays.toString(arr));
    }


    public static double average(int[] arr) {
        int avgnum = 0;
        for (int i = 0; i < arr.length; i++) {
            avgnum += arr[i];

        }
        return (double) avgnum / arr.length;

    }

    public static int minimum(int[] min) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < min.length; i++) {
            if (min[i] < result) {
                result = min[i];
            }


        }
        return result;
    }

    public static int maximum(int[] max) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > result) {
                result = max[i];
            }


        }
        return result;
    }

}
