package joachim.week02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
//        exel();
//        copy();
//        random();
//        int[] randomArray = randomArray(1, 100);
//        arrayCrazyRange();
//        arrayGreater30();
//        arraySum();
//        max();
//        min();
//        avg();
        bubbleSort(randomArray(1, 100), ARRAY_WIDTH);
    }

    static Random random = new Random();
    public static int ARRAY_WIDTH = 10;

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^here i define the width of the random generated Array, the "from" and "to" is defined in the methods themself, ---> see randomArray.
    public static int[] randomArray(int from, int to) {
        int[] rand = new int[ARRAY_WIDTH];
        for (int i = 0; i < rand.length; i++) { // The rand.length and the ARRAY_WIDTH are the same number, just for easier understanding it is named differently as the ARRAY_WIDTH is no normal occurence.
            rand[i] = random.nextInt(from, to + 1);
        }
        return rand;
    }

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

    public static void arrayCrazyRange() {
        int[] numbers = randomArray(-50, 50);
        for (int number : numbers) {
            System.out.println(number + " ");

        }

    }

    public static void arrayGreater30() {
        int[] numbers = randomArray(1, 100);
        for (int number : numbers) {
            if (number > 30)
                System.out.println(number + " ");

        }
    }

    public static void arraySum() {
        int result = 0;
        int[] numbers = randomArray(1, 100);
        for (int number : numbers) {
            result = number + result;
        }
        System.out.println(result);

    }

    public static int max() {
        int[] numbers = randomArray(1, 100);
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
        return max;
    }

    public static int min() {
        int[] numbers = randomArray(1, 100);
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(min);
        return min;
    }

    public static double avg() {
        int[] numbers = randomArray(1, 100);
        int avgb = 0;
        for (int number : numbers) {
            avgb = avgb + number;

        }
        double avg = (double) avgb / numbers.length;
        System.out.println(avg);
        return avg;
    }

    static void bubbleSort(int[] array, int n) { //the Array is defined at the Top, also int n is the Array width wich is also defined at the top.
        if (n == 1)                             //passes are done
        {
            return;
        }

        for (int i = 0; i < n - 1; i++)    //iteration through unsorted elements
        {
            if (array[i] > array[i + 1])      //check if the elements are in order
            {
                int temp = array[i];        //if not, swap them
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}