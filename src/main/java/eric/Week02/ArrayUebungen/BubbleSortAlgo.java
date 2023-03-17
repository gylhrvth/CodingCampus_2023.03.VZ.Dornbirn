package eric.Week02.ArrayUebungen;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSortAlgo {
    static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int []{};
        System.out.println("Gib eine Zahl an um die Größe des Arrays anzugeben");
        try{
            scan.nextInt();
        } catch (InputMismatchException ine){
            System.out.println("Wer Lesen kann ist KLAR IM VORTEIL!");
            scan.nextLine();
        }



        bubbleSortAscend(arr);

        System.out.println("Sortiert das Ascending Array: " + Arrays.toString(arr));

        bubbleSortDescend(arr);

        System.out.println("Sortiert das Descending Array: " + Arrays.toString(arr));


    }


    public static void bubbleSortAscend(int[] arr){
        int n = arr.length;
        boolean swap = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j + 1]){
                    swap = true;
                }
                arr[i] = random.nextInt(1000);
            }
            if (!swap){
                break;
            }
        }
    }


    public static void bubbleSortDescend(int[] arr){
        int n = arr.length;
        boolean swap = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] < arr[j + 1]){
                    swap = true;
                }
                arr[i] = random.nextInt(1000);
            }
            if (!swap){
                break;
            }
        }
    }
}
