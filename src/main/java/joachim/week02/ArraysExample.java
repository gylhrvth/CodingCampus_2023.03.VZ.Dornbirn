package joachim.week02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
//        exel();
//        copy();
//        random();
//        int[] randomArray = randomArray();
//        forBeach();
//        forBeach2();
//        forBeach3();
        forBeach4();
    }

    static Random random = new Random();
    public static int ARRAY_WIDTH = 10000000;

    public static void exel() {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int[] safes = new int[width];

        for (int i = 0; i < safes.length; i++) {
            safes[i] = 1 + i;
        }

        int[] safes2 = new int[width];
        for (int i = 0; i < safes2.length; i++) {
            safes2[i] = safes2.length - i;
        }

        System.out.println(Arrays.toString(safes));
        System.out.println(Arrays.toString(safes2));

    }

    public static int[] copy(int[] orginal) {
        int[] makeACopy = new int[orginal.length];
        for (int i = 0; i < orginal.length; i++) {
            makeACopy[i] = orginal[i];

        }
        return makeACopy;
    }

    public static int[] randomArray(int from, int to) {
        int[] rand = new int[ARRAY_WIDTH];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = random.nextInt(from, to + 1);
        }
        return rand;
    }

    public static void forBeach() {
        int[] numbers = randomArray(-50, 50);
        for (int number : numbers) {
            System.out.println(number + " ");

        }

    }

    public static void forBeach2() {
        int[] numbers = randomArray(1, 100);
        for (int number : numbers) {
            if (number > 30)
                System.out.println(number + " ");

        }
    }

    public static void forBeach3() {
        int result = 0;
        int[] numbers = randomArray(1, 100);
        for (int number : numbers) {
            result = number + result;
        }
        System.out.println(result);

    }

    public static void forBeach4() {
        int result = 0;
        int[] numbers = randomArray(1, 100);
        for (int number : numbers) {
            result = (number + result);
        }
        double average = result / (double) numbers.length;
        System.out.println(average);
        System.out.println();
    }
}