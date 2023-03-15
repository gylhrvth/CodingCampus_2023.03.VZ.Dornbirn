package sandro.week02;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("args: " + Arrays.toString(args));

        int arrayspace = readArrayspace("Wieviel Arrayspace möchtest du?");
        int[] countNumber = createIncreasingArray(arrayspace);
        int[] countNumber2 = createDecreasingArray(arrayspace);
        int[] countNumber3 = makeacopy(countNumber);
        int[] randomNumber = randomInput(arrayspace);

        System.out.println(Arrays.toString(countNumber));
        System.out.println(Arrays.toString(countNumber2));
        System.out.println(Arrays.toString(countNumber3));
        System.out.println(Arrays.toString(randomNumber));

    }

    public static int[] createDecreasingArray(int arrayspace) {
        int[] countNumber2 = new int[arrayspace];
        for (int i = 0; i < countNumber2.length; i++) {
            countNumber2[i] = arrayspace - i;
        }
        return countNumber2;
    }

    public static int[] createIncreasingArray(int arrayspace) {
        int[] countNumber = new int[arrayspace];
        for (int i = 0; i < countNumber.length; i++) {
            countNumber[i] = 1 + i;
        }

        return countNumber;
    }

    public static int[] makeacopy(int[] arrayToCopy) {
        int[] result = new int[arrayToCopy.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayToCopy[i];
        }
        return result;
    }

    public static int[] randomInput(int arrayspace){
        int [] randomArray = new int [arrayspace];
        for (int i = 0; i < randomArray.length; i++) {
            int randomValue = rand.nextInt(101);
            randomArray[i] = randomValue;
        }

        return randomArray;
    }

    public static int readArrayspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println(message);
        try {
            String line = sc.nextLine();
            value = Integer.valueOf(line);
        } catch (NumberFormatException nfe) {
            System.out.println("das ist keine gültige Zahl");
        }

        return value;
    }


}
