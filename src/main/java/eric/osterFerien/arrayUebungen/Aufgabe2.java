package eric.osterFerien.arrayUebungen;

import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 23, 5, 12, 4, 4, 2, 5, 2, 10};

        int[] arr2 = new int[]{123, 19471, 1, 4, 15715, 15, 1, 5, 15, 1, -10, -100};

        int[] arr3 = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println();

        printStats(arr);
        printStats(arr2);
        printStats(arr3);
    }

    public static void printStats(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double avg = (double) sum / arr.length;

        System.out.println("Maximale Zahl: " + max);
        System.out.println("Minimale Zahl: " + min);
        System.out.println("Durchschnittliche Zahl: " + avg);
        System.out.println();
    }
}
