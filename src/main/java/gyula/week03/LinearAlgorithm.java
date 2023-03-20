package gyula.week03;

import java.util.Arrays;
import java.util.Random;

public class LinearAlgorithm {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] testArray = createArray(20);
        System.out.println(Arrays.toString(testArray));

        System.out.println("AVG:       " + average(testArray));
        System.out.println("Count >30: " + countOver30(testArray));

        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static int countOver30(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                ++result;
            }
        }
        return result;
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


    public static int sum(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static double average(int[] arr){
        return (double)sum(arr) / arr.length;
    }

    public static int[] createArray(int size){
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);
        }
        return result;
    }
}
