package ayguen.week02;

import java.util.Arrays;
import java.util.Random;

public class ArrayWerte1 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[] myValues = ArrayWerte.createCrazyRange(15, 0, 100);

        System.out.println(Arrays.toString(myValues));
        System.out.println("Die Anzahl der Elementen unter 30 sind: " + arrayUnter30(myValues));
        System.out.println("Die Summe der Werte ist               : " + summeArray(myValues));
//        summeArray("Wie oft? ", 1, 7);



    }


    public static int arrayUnter30(int[] numbers1) {
        int count = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] < 30) {
                ++count;
            }
        }
        return count;

    }
    public static int summeArray(int[] numbers) {
        /*
        System.out.println("............................");
        int[] numbers = new int[max];
        for (int i = 0; i < max; i++) {
            numbers[i] = rand.nextInt(100);


        }
        System.out.println(Arrays.toString(numbers));
        int sum = 0;
        sum += numbers.length;
        System.out.println(sum + numbers.length);

*/
        return 0;
    }
}
