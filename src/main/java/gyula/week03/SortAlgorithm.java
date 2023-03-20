package gyula.week03;

import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] testArray = LinearAlgorithm.createArray(20);
        System.out.println(Arrays.toString(testArray));
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Tausch -- swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
