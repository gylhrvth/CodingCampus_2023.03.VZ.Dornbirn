package hassan.week02;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUebungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib die Größe des Arrays ein: ");
        int size = scanner.nextInt();
        System.out.println("Array 1:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Array 2:");
        int[] arr2 = new int[size];
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = size - i;
        }

        System.out.println(Arrays.toString(arr2));

    }
    public static int makeACopy(int [] original){

    }



}