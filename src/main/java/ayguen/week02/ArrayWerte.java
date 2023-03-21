package ayguen.week02;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;
import java.util.Random;

public class ArrayWerte {
    public static Random rand = new Random();



    public static void main(String[] args) {
        int size = ConsoleInputNumber.readNumber_v5("yarrak", 1, 100);
        int[] crazyArray = createCrazyRange(size, 0, 100);

        System.out.println(Arrays.toString(crazyArray));
        printArrayWithForI(crazyArray);
        printArrayWithForEach(crazyArray);
        arraySumme(crazyArray);
    }


    private static void printArrayWithForI(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
    }


    private static void printArrayWithForEach(int[] numbers) {
        System.out.println("FOREACH_____________");
        // TODO: 17.03.2023 Hier brauche ich ein For-Each Schleife
        for (int number : numbers) {

        }
    }


    public static int[] createCrazyRange(int size, int min, int max) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt((max - min + 1)) + min;
        }

        return result;
    }

    public static int arraySumme(int[] arr) {
        System.out.println();
        System.out.println("------------SUM-----------");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            System.out.println(i);
            arr[i]++;

        }return sum;

    }


}


