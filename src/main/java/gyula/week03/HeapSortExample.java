package gyula.week03;

import java.util.Arrays;

public class HeapSortExample {
    public static void main(String[] args) {
        int[] testArray = LinearAlgorithm.createArray(200000);

        System.out.println(Arrays.toString(testArray));
        heapSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }


    public static void heapSort(int[] arr) {
        buildHeap(arr);
        int n = arr.length - 1;
        while (n > 0){
            swap(arr, 0, n);
            --n;
            siftDown(arr, 0, n + 1);
        }
    }

    public static void buildHeap(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--) {
            siftDown(arr, i, arr.length);
        }
    }

    public static void siftDown(int[] arr, int i, int n){
        if (2 * i >= n) return;
        int k = 2 * i;

        if ((2 * i + 1 < n) && (arr[2 * i] < arr[2 * i + 1])){
            ++k;
        }

        if (arr[i] < arr[k]){
            swap(arr, i, k);
            siftDown(arr, k, n);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
