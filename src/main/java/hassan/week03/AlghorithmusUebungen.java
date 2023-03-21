package hassan.week03;

import java.security.SecureRandom;
import java.util.Arrays;

public class AlghorithmusUebungen {
    public static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        int[] outputArray = createArray(20);
        System.out.println("Array ");
        System.out.println(Arrays.toString(outputArray));

        System.out.println("------");

        System.out.println("Selection Sort");
        selectionSort(outputArray);
        System.out.println(Arrays.toString(outputArray));

        System.out.println("------");

        System.out.println("Insertion Sort");
        insertionSort(outputArray);
        System.out.println(Arrays.toString(outputArray));

        System.out.println("Cocktail Shaker Sort");
        cocktailShakerSort(outputArray);
        System.out.println(Arrays.toString(outputArray));


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

    public static void insertionSort(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j = j - 1;
            }
        }
    }
    public static void cocktailShakerSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
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

