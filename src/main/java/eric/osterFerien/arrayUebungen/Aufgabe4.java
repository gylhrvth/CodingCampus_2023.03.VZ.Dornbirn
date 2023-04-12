package eric.osterFerien.arrayUebungen;

import java.util.Arrays;

public class Aufgabe4 {
    public static void main(String[] args) {
        int[] arr = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0, 2623636, 25, 242, 26, 26, 234, 62, 35, 503450134, 412, 4, 124, 1, 243};
        System.out.println(Arrays.toString(arr));

        System.out.println();
        bubbleSortAscend(arr);

        for (int i : arr) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
        bubbleSortDescend(arr);


        for (int i:arr) {
            System.out.print("[" + i + "] ");
        }
    }


    public static void bubbleSortAscend(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortDescend(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
