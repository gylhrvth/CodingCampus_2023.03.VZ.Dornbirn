package mariechristine.week2;


import java.util.Arrays;

public class ExercisesArraysNew {
    public static void main(String[] args) {
        int[] numbers = new int [8];

        numbers[0] = 1;

        System.out.println(Arrays.toString(numbers));

        printArray(numbers);

        }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void numbers1() {
        int[] numbers = new int[10];
        numbers[0] = 1;

        for (int i = 1; i < 10; i++) {
            numbers[i - 1] = i;
        }
        System.out.println(Arrays.toString(numbers));

    }
}

