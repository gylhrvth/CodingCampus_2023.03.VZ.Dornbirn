package mariechristine.week2;


import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("Crazy Range");
        int[] cArray = arrayCrazyRange(10);
        for (int crazyRange : cArray) {
            System.out.print("[" + crazyRange + "]");
        }

        System.out.println("Summe > 30: " + arrayCount30(ranArray));
        System.out.println("Summe zählen: " + randomSum(ranArray));

        System.out.println(Arrays.toString(ranNumArray(20)));

        int number = minArray(ranArray);
        System.out.println("Minimum: " + number);

        int number2 = maxArray(ranArray);
        System.out.println("Maximum: " + number2);

        int[] avg = createNumbersRandom(20);
        System.out.println(Arrays.toString(avg));
        System.out.println("Average: " + average(avg));


        System.out.println("Bubble !!!");
        System.out.println(Arrays.toString(ranArray));
        bubblesort(ranArray);
        System.out.println(Arrays.toString(ranArray));

        ranArray = createNumbersRandom(randomLength * 10);
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(ranArray));
        selectionSort(ranArray);
        System.out.println(Arrays.toString(ranArray));


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

    public static int[] arrayCrazyRange(int size) {
//        System.out.println("Crazy Range");
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50;
        }
//        for (int crazyRange : numbers) {
//            System.out.print("[" + crazyRange + "]");
//        }

        return numbers;

    }

    public static int arrayCount30(int[] arrCount) {
        System.out.println();
        System.out.println("Array Zählen");
        int result = 0;
        for (int i = 0; i < arrCount.length; i++) {
            if (arrCount[i] > 30) {
                ++result;
            }
        }
        return result;
    }

    public static int randomSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;

    }

    public static int[] ranNumArray(int size) {
        System.out.println();
        System.out.println("Array Min/Max/Avg");
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        return numbers;
    }

    public static int minArray(int[] number) {
        System.out.println();
        int minNumbers = Integer.MAX_VALUE;
        for (int i : number) {
            if (i < minNumbers) {
                minNumbers = i;
            }
        }
        return minNumbers;

    }

    public static int maxArray(int[] number2) {
        System.out.println();
        int maxNumbers = Integer.MIN_VALUE;
        for (int i : number2) {
            if (i > maxNumbers) {
                maxNumbers = i;
            }
        }
        return maxNumbers;
    }

    public static double average(int[] arr) {
        System.out.println();
        return (double) randomSum(arr) / arr.length;
    }

    public static void bubblesort(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    // Tausch -- swap
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            int min = i;
            for ( int j = i + 1; j < sort.length; j++) {
                if (sort[j] < sort[min]) {
                    min = j;
                }
            }
            int temp = sort[i];
            sort[i] = sort[min];
            sort[min] = temp;
        }
    }
}





