package gyula.week03;

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] testArray = LinearAlgorithm.createArray(20);

        System.out.println(Arrays.toString(testArray));
        mergeSort("", testArray, 0, testArray.length);
        System.out.println(Arrays.toString(testArray));
    }

    public static void mergeSort(String prefix, int[] arr, int lo, int hi){
        System.out.println(prefix + "mergeSort(..., " + lo + ", " + hi + ")");
        if (hi - lo <= 1) return;
        int mid = (lo + hi) / 2;
        mergeSort(prefix + "  ", arr, lo, mid);
        mergeSort(prefix + "  ", arr, mid, hi);

        int[] temp = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 0;
        while ((i < mid) && (j < hi)){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                ++i;
                ++k;
            } else {
                temp[k] = arr[j];
                ++j;
                ++k;
            }
        }
        while (i < mid){
            temp[k] = arr[i];
            ++i;
            ++k;
        }
        while (j < hi){
            temp[k] = arr[j];
            ++j;
            ++k;
        }
        for (int l = lo; l < hi; l++) {
            arr[l] = temp[l - lo];
        }
        System.out.println(prefix + Arrays.toString(arr));
    }
}
