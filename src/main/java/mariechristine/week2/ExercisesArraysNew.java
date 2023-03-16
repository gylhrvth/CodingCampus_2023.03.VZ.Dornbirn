package mariechristine.week2;


import java.util.Arrays;

public class ExercisesArraysNew {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        numbers[0] = 1;

        System.out.println(Arrays.toString(numbers));

        printArray(numbers);

        //int size = readNumberFromUser();

        numbers1(15);
        numbers2();
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void numbers1(int size) {
        int[] numbers = new int[size];

        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void numbers2() {
        int[] numbers = new int[15];

        for (int i = 10; i > 0; i--) {
            numbers[i - 1] = 11 - i;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] makeACopy(int[] original) {
        int[] copy = new int[5];

        return copy;
    }
}


