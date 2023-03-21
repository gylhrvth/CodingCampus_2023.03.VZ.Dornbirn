package eric.Week03;

import java.security.SecureRandom;
import java.util.Arrays;

public class AlgorithmExercise {
    public static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        int[] outputArray = createArray(10000);
        System.out.println(Arrays.toString(outputArray));

        System.out.println("------");

//        System.out.println("Selection Sorting");
//        selectionSort(outputArray);
//        System.out.println(Arrays.toString(outputArray));
//
//        System.out.println("------");
//
//        System.out.println("Insertion Sorting");
//        insertionSort(outputArray);
//        System.out.println(Arrays.toString(outputArray));
//
//        System.out.println("------");
//
//        System.out.println("Gnome Sorting");
//        gnomeSort(outputArray);
//        System.out.println(Arrays.toString(outputArray));
//
//        System.out.println("------");

        System.out.println("Merge Sorting");
        System.out.println("Original: " + Arrays.toString(outputArray));
        mergeSort(outputArray, 0, outputArray.length);
        System.out.println("Ergebnis: " + Arrays.toString(outputArray));

    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void insertionSort(int[] arr){
        for (int i = 2; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j = j - 1;
            }
        }
    }
    public static void gnomeSort(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] >= arr[i - 1]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                if (i > 1){
                    i--;
                }
            }
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(high - low <= 1) return;
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid, high);

        int[] temp = new int[high - low];
        int i = low;
        int j = mid;
        int k = 0;
        while ((i < mid) && (j < high)){
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
        while (j < high){
            temp[k] = arr[j];
            ++j;
            ++k;
        }
        for (int l = low; l < high; l++) {
            arr[l] = temp[l - low];
        }
    }
    public static int[] createArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(10001);
        }
        return result;
    }
}
