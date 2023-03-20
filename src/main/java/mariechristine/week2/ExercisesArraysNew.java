package mariechristine.week2;


import java.util.Arrays;
import java.util.Random;

public class ExercisesArraysNew {

    static Random random = new Random();

    public static void main(String[] args) {

        int[] arrIncreasing = createNumbersInrc(15);
        System.out.println(Arrays.toString(arrIncreasing));

        int[] arrDecreasing = createNumbersDecr(20);
        System.out.println(Arrays.toString(arrDecreasing));

        int[] originalCopy = makeACopy(arrDecreasing);
        System.out.println(Arrays.toString(originalCopy));

        int randomLength = random.nextInt(21);
        int[] ranArray = createNumbersRandom(randomLength);
        System.out.println("Print in 3 different kind");
        System.out.println(Arrays.toString(ranArray));
        printWithForEach(ranArray);
        printWithForI(ranArray);

        if (randomLength >= 10) {
            System.out.println("Zweite: " + ranArray[1]);
            System.out.println("Fünfte: " + ranArray[4]);
            System.out.println("Zehnte: " + ranArray[9]);
        } else {
            System.out.println("Es stehen nicht ausreichenden Elementen in Array zur Verfügung...");
        }


    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int[] createNumbersRandom(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        return numbers;
    }

    public static int[] createNumbersInrc(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + i;
        }
        return numbers;
        //System.out.println(Arrays.toString(numbers));
    }

    public static int[] createNumbersDecr(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length - i;
        }
        return numbers;
    }

    public static int[] makeACopy(int[] original) {
        int[] makeACopy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            makeACopy[i] = original[i];
        }
        return makeACopy;

    }

    public static void printWithForEach(int[] arr) {
        System.out.print("[");
        boolean first = true;
        for (int curent : arr) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(curent);
            first = false;
        }
        System.out.println("]");
    }

    public static void printWithForI(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            }
            System.out.println("]");
    }


}




