package eric.Week02.ArrayUebungen;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUebungen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein");
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[size];
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = size - i;
        }
        System.out.println(Arrays.toString(arr2));

    }

 /*   public static int[] makeACopy(int[] original){

    }*/
}
