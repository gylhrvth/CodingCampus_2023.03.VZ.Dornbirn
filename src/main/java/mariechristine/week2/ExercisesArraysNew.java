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
        numbers2(20);
        int[] makeACopy = new int[]{};
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

    public static void numbers2(int size) {
        int[] numbers = new int[size];

        for (int i = numbers.length; i > 0; i--) {
            numbers[i - 1] = numbers.length - i;
        }
        System.out.println(Arrays.toString(numbers));
    }


}


