package eric.Week02.ArrayUebungen;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayAsc = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayDsc = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        bubbleSortAscend(arrayAsc);
        bubbleSortDescend(arrayDsc);

        for (int i : arrayAsc) {
            System.out.print("[" + i + "]");
        }

        System.out.println();
        System.out.println();

        for (int i : arrayDsc) {
            System.out.print("[" + i + "]");
        }
    }

    public static void bubbleSortAscend(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void bubbleSortDescend(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
