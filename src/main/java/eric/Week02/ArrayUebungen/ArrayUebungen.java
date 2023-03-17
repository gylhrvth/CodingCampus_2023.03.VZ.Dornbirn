package eric.Week02.ArrayUebungen;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUebungen {

    static SecureRandom number = new SecureRandom();

    public static void main(String[] args) {
        //numberArray();                                    //Array übung

        System.out.println("Copy Array");                   //Copy Array
        int[] arr = new int[]{1, 2, 3};
        int[] arrCopy = makeACopy(arr);
        printArray(arr);
        printArray(arrCopy);

        System.out.println("------");

        randomArray();                                      //Random Number Array mit ForEach und ForI Schleifen

        System.out.println("------");
        System.out.println();

        crazyRangeArray();                                  //Crazy Range Array -50 - 50 zufall Zahlen

        System.out.println("------");
        System.out.println();


        System.out.println("Array Random number Zählen");   //Zählt von 1 - 100 mit Zufalls Zahlen
        int[] zufallZahlen = new int[15];
        for (int i = 0; i < zufallZahlen.length; i++) {
            zufallZahlen[i] = number.nextInt(101);
        }
        for (int arrZaehlen : zufallZahlen) {
            System.out.print("[" + arrZaehlen + "]");
        }

        System.out.println();
        System.out.println();

        int arrayCount = countBiggerThan30(zufallZahlen);         //Array zeigt nur Zahlen größer als 30 an
        System.out.println(Arrays.toString(zufallZahlen));
        System.out.print("Arrays Anzahl deren Werte größer als 30 sind: ");
        System.out.println(arrayCount);
        System.out.println();
        System.out.println("------");

        int[] ranNum = randomNumber(10);
        printArray(ranNum);
        System.out.println("------");

        int min = minimumNumbers(ranNum);
        System.out.println("Minimum: " + min);
        System.out.println("------");

        int max = maximumNumbers(ranNum);
        System.out.println("Maximum: " + max);
        System.out.println("------");

        double  avg = averageNumbers(ranNum);
        System.out.println("Average: " + avg);
        System.out.println("------");

    }

    public static void numberArray() {
        System.out.println("Number Array");
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        int size = scan.nextInt();

        int[] arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[size];
        for (int i = arr3.length - 1; i >= 0; i--) {
            arr3[i] = size - i;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] makeACopy(int[] arr) {
        int[] makeACopy = new int[arr.length];
        for (int i = 0; i < makeACopy.length; i++) {
            makeACopy[i] = arr[i];
        }
        return makeACopy;
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void randomArray() {
        System.out.println("Random Array");
        int[] ranArr = new int[20];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < ranArr.length; i++) {
            ranArr[i] = random.nextInt(101);
        }

        System.out.println("------");

        System.out.println("ForEach Schleife");
        for (int element : ranArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("------");

        System.out.println("ForI Schleife");
        for (int i = 0; i < ranArr.length; i++) {
            System.out.print(ranArr[i] + " ");
        }
        System.out.println();
        System.out.println("------");

        System.out.println("2. 5. und 10. Wert des Arrays");
        System.out.println();

        System.out.println("Der 2. Array Wert beträgt [" + ranArr[1] + "]");
        System.out.println("Der 5. Array Wert beträgt [" + ranArr[4] + "]");
        System.out.println("Der 10. Array Wert beträgt [" + ranArr[9] + "]");

        System.out.println("------");

        System.out.println("Jeder 2. Wert des Arrays");
        for (int i = 0; i < ranArr.length; i += 2) {
            System.out.print("[" + ranArr[i] + "]");
        }
    }

    public static void crazyRangeArray() {
        System.out.println("Crazy Range Array");
        int[] zufallZahlen = new int[15];
        for (int i = 0; i < zufallZahlen.length; i++) {
            zufallZahlen[i] = number.nextInt(101) - 50;
        }
        for (int crazyRange : zufallZahlen) {
            System.out.print("[" + crazyRange + "]");
        }
    }

    public static int countBiggerThan30(int[] arrCount) {
        int count = 0;
        for (int i = 0; i < arrCount.length; i++) {
            if (arrCount[i] > 30) {
                count++;
            }
        }
        return count;
    }

    public static int[] randomNumber(int size) {
        int[] ranNum = new int[size];
        for (int i = 0; i < size; i++) {
            ranNum[i] = number.nextInt(101);
        }
        return ranNum;
    }

    public static int minimumNumbers(int[] num) {
        int minNumbers = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < minNumbers) {
                minNumbers = num[i];
            }
        }
        return minNumbers;
    }

    public static int maximumNumbers(int[] num) {
        int maxNumbers = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNumbers) {
                maxNumbers = num[i];
            }
        }
        return maxNumbers;
    }

    public static double averageNumbers(int[] num) {
        int avgNumbers = 0;
        for (int i = 0; i < num.length; i++) {
                avgNumbers += num[i];
        }
        return (double) avgNumbers / num.length;
    }
}