package mert.Week03;

import java.util.Arrays;
import java.util.Random;

public class Arrays2 {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] array = crateArray(10);
        System.out.println(Arrays.toString(array));

        System.out.println("Summe =   " + summme(array));
        System.out.println("min =   " + min(array));
        System.out.println("max =   " + max(array));
        System.out.println("Durchschnitt = " + avg(array));

        bubblesort(array);
        System.out.println("Aufsteigend = " + Arrays.toString(array));

        bubblesort2(array);
        System.out.println("Absteigend = " + Arrays.toString(array));

        gnomeSort(array);
        System.out.println("gnomeSort = " + Arrays.toString(array));

        mergesort("", array, 0, array.length);
        System.out.println("mertsort");
        System.out.println(Arrays.toString(array));

    }

    public static int[] crateArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);

        }
        return result;
    }

    public static int summme(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int min(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < minValue) {
                minValue = value;
            }

        }
        return minValue;
    }

    public static int max(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static double avg(int[] arr) {
        int avgnum = 0;
        for (int value : arr) {
            avgnum += value;

        }
        return (double) avgnum / arr.length;
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
        int value = 1;
        int value2 = 2;

        while (value < arr.length) {
            if (arr[value - 1] <= arr[value]) {
                value = value2;
                value2++;

            } else {
                int temp = arr[value - 1];
                arr[value - 1] = arr[value];
                arr[value--] = temp;
                value = (value == 0) ? value2++ : value;
            }
        }

    }

    public static void mergesort(String prefix, int[] arr, int lo, int hi) {
        if (hi - lo <= 1) return;
        int mid = (lo + hi) / 2;
        mergesort(prefix + " ", arr, lo, mid);
        mergesort(prefix + " ", arr, mid, hi);

        int[] temp = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 0;

        while ((i < mid) && (j < hi)) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;

            } else {
                temp[k] = arr[j];
                k++;
                j++;

            }
        }
        while (i < mid) {
            temp[k] = arr[i];
            k++;
            i++;


        }
        while (j < hi) {
            temp[k] = arr[j];
            k++;
            j++;

        }


    }

}





