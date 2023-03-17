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
        printWithForI(ranArray);
        printWithForEach(ranArray);


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

    }


    public static void printWithForI(int[] arr) {

    }

}



