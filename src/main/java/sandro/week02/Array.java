package sandro.week02;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("args: " + Arrays.toString(args));

        int arrayspace = readArrayspace("Wieviel Arrayspace möchtest du?");

        int[] increasing = createIncreasingArray(arrayspace);
        int[] decreasing = createDecreasingArray(arrayspace);
        int[] copyArray = makeacopy(increasing);

        int[] randomNumber = createRandomArray(arrayspace);
        int[] crazyRandomNumber = crazyRandomnumbers(arrayspace);
        int[] inputArray = createRandomArray(arrayspace);


        System.out.println("Array input increasing");
        System.out.println(Arrays.toString(increasing));
        System.out.println("---");

        System.out.println("Array input decreasing");
        System.out.println(Arrays.toString(decreasing));
        System.out.println("---");

        System.out.println("Array input Arrays.toString");
        System.out.println(Arrays.toString(copyArray));
        System.out.println("---");

        System.out.println("Random Output mit forEach");
        printForEach(randomNumber);
        System.out.println("---");

        System.out.println("Random Output mit Array.toString");
        System.out.println(Arrays.toString(randomNumber));
        System.out.println("---");

        System.out.println("Random Output mit fori");
        printForI(randomNumber);
        System.out.println("---");

        System.out.println("Random Output die 2,5 und 10 zahl");
        printSpecificNumber(randomNumber);
        System.out.println("---");

        System.out.println("Random Output jeden zweiten Wert: 1,3,5,7,9");
        printEverySecondNumber(randomNumber);
        System.out.println("---");

        System.out.println("Random Output jeden zweiten Wert: 2,4,6,8,10");
        printEverySecondNumber2(randomNumber);
        System.out.println("---");

        System.out.println("CrazyRandom Output mit forEach");
        System.out.println("Kontrolloutput");
        System.out.println(Arrays.toString(crazyRandomNumber));
        System.out.println("---");
        printCrazyNumberForEach(crazyRandomNumber);
        System.out.println("---");

        System.out.println("Array Random von 1-100 alles über 30");
        System.out.println("Kontrolloutput");
        System.out.println(Arrays.toString(randomNumber));
        System.out.println("---");
        printOver30(randomNumber);
        System.out.println("---");

        System.out.println("Array Random von Arrays addieren");
        System.out.println("Kontrolloutput");
        System.out.println(Arrays.toString(randomNumber));
        printAdd(randomNumber);
        System.out.println("---");

        System.out.println("RandomMinMaxAvg");
        System.out.println(Arrays.toString(inputArray));

        System.out.println("Der Maximus ist     : " + maxValue(inputArray));
        System.out.println("Das Minimum ist     : " + minValue(inputArray));
        System.out.println("Das Minimum 1.2 ist : " + minValue3(inputArray));
        System.out.println("Das Minimum 2.0 ist : " + minValue2(inputArray));
        System.out.println("Der Durchschnitt ist: " + averageValue(inputArray));
        System.out.println("---");

        System.out.println("IndexMax und Min");
        System.out.println("Maximum zahl ist Index : " + indexMaxValue(inputArray));
        System.out.println("Minimum Zahl ist Index : " + indexMinValue(inputArray));
        System.out.println("---");

        System.out.println("BubbleSort");
        System.out.println("Kontrolle");

        int[] inputCopy = makeacopy(inputArray);

        System.out.println("Descending Sort");
        System.out.println(Arrays.toString(inputCopy));
        bubbleSortDescending(inputCopy);
        System.out.println(Arrays.toString(inputCopy));

        inputCopy = makeacopy(inputArray);
        System.out.println("Ascending Sort");
        System.out.println(Arrays.toString(inputCopy));
        bubbleSortAscending(inputCopy);
        System.out.println(Arrays.toString(inputCopy));
        System.out.println("---");

        System.out.println("Select Sort");
        System.out.println("kontrolle");
        System.out.println(Arrays.toString(randomNumber));

        System.out.println("SelectSortAscending");
        selectSortAscending(randomNumber);
        System.out.println(Arrays.toString(randomNumber));


    }

public static void selectSortAscending (int [] arr) {
    for (int i = 0; i < arr.length; i++) {
        int min = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        int temp = arr [i];
        arr [i] = arr[min];
        arr [min] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

    public static void bubbleSortDescending(int[] arr) {
//        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    System.out.println("counter: " + count + Arrays.toString(arr));
                }
            }
        }
    }

    public static void bubbleSortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static int maxValue(int[] arr) {
        int max = 0;
        if (arr.length > 0) {
            max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static int minValue(int[] arr) {
        int min = 0;
        if (arr.length > 0) {
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

        }
        return min;
    }

    public static int minValue2(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minValue3(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

    public static int[] crazyRandomnumbers(int arrayspace) {
        int[] crazyRandom = new int[arrayspace];
        for (int i = 0; i < crazyRandom.length; i++) {
            int randomValue = rand.nextInt(-50, 51);
            crazyRandom[i] = randomValue;
        }

        return crazyRandom;
    }

    public static int[] createRandomArray(int arrayspace) {
        int[] result = new int[arrayspace];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);
        }
        return result;
    }

    public static void printCrazyNumberForEach(int[] arr) {
        for (int crazy : arr) {
            System.out.print(crazy + ", ");
        }
        System.out.println();
    }

    public static void printOver30(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                count = count + 1;
            }
        }
        System.out.println(count + " Zahlen sind über 30");
    }

    public static void printAdd(int[] arr) {
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + arr[i];
        }
        System.out.println("Die Summer der Zahlen ist :" + summe);
    }

    public static void printEverySecondNumber(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void printSpecificNumber(int[] arr) {
//        if (arr.length > 1) {
//            System.out.println("die zweite Zahl ist :" + arr[1]);
//        } else {
//            System.out.println("die zweite Zahl ist nicht vorhanden");
//        }
//        try {
//            System.out.println("die fünfte Zahl ist :" + arr[4]);
//        } catch (IndexOutOfBoundsException ioobe) {
//            System.out.println("Oups I did it again!");
//        }
//        System.out.println("die zehnte Zahl ist :" + arr[9]);

        System.out.println("---");

        int[] positions = new int[]{1, 4, 9, 15, 25, 90};
        for (int currentPosition : positions) {
            if (currentPosition < arr.length) {
                System.out.println("Pos: " + currentPosition + " ist " + arr[currentPosition]);
            } else {
                System.out.println("Pos: " + currentPosition + " ist NICHT vorhanden");
            }
        }
    }

    public static void printEverySecondNumber2(int[] arr) {
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int indexMaxValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexMinValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }



    public static float averageValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (float) sum / arr.length;

    }

    public static void printForI(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printForEach(int[] arr) {
        System.out.print("[");
        boolean first = true;
        for (int random : arr) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(random);
            first = false;
        }
        System.out.print("]");
        System.out.println();
    }

    public static int readArrayspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die Zahl muss positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("das ist keine gültige Zahl");
            }
        }
        return value;
    }


}
