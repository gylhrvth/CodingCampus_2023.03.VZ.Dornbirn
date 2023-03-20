package sandro.week03;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] mergeArray = createArray(20);

        System.out.println(Arrays.toString(mergeArray));
//Beispiel
//        Arrays.sort(mergeArray);
//        System.out.println(Arrays.toString(mergeArray));

    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if (hi - lo <= 1) return;
        int mid = (lo + hi) / 2;

        mergeSort(arr, lo, mid);
        mergeSort(arr, mid, hi);

        int[] temp = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 1;

        while ((i < mid) && (j < hi)) {

        }
    }


    public static int[] createArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);
        }
        return result;
    }

}
