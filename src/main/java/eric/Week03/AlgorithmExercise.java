package eric.Week03;

import java.security.SecureRandom;
import java.util.Arrays;

public class AlgorithmExercise {
    public static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        int[] outputArray = createArray(20);
        System.out.println(Arrays.toString(outputArray));

        System.out.println("------");

        selectionSort(outputArray);
        System.out.println(Arrays.toString(outputArray));

        System.out.println("------");

        insertionSort(outputArray);
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


    public static int[] createArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);
        }
        return result;
    }
}
