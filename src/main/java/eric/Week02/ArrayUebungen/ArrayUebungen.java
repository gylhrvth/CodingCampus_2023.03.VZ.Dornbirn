package eric.Week02.ArrayUebungen;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayUebungen {

    static SecureRandom number = new SecureRandom();

    public static void main(String[] args) {
        int[] testArray = randomNumber(20);
        System.out.println(Arrays.toString(testArray));

        int[] doACopy = makeACopy(testArray);
        System.out.println(Arrays.toString(doACopy));

        numberArray();                                    //Array übung

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

        int min = minNum(ranNum);
        System.out.println("Minimum: " + min);
        System.out.println("------");

        int max = maxNum(ranNum);
        System.out.println("Maximum: " + max);
        System.out.println("------");

        double avg = avgNum(ranNum);
        System.out.println("Average: " + avg);
        System.out.println("------");

    }

    public static void numberArray() {
        System.out.println("Number Array");

        Scanner scan = new Scanner(System.in);

        System.out.println("Gib ein Zahl an!");
        try{
            scan.hasNextInt();
            System.out.println("------");
        } catch (InputMismatchException ime){
            System.out.println("Wer Lesen kann ist KLAR IM VORTEIL!");
            scan.nextLine();
        }

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
        System.out.println("------");
    }

    public static int[] makeACopy(int[] arr) {
        int[] makeACopy = new int[arr.length];
        for (int i = 0; i < makeACopy.length; i++) {
            makeACopy[i] = arr[i];
        }
        return makeACopy;
    }

    public static void printArray(int[] numbers) {
        for (int j : numbers) {
            System.out.print(j + " ");
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
            System.out.print("[" + element + "]");
        }
        System.out.println();
        System.out.println("------");

        System.out.println("ForI Schleife");
        for (int i = 0; i < ranArr.length; i++) {
            System.out.print("[" + ranArr[i] + "]");
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
        System.out.println("------");
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
        System.out.println("------");
    }

    public static int countBiggerThan30(int[] arrCount) {
        int count = 0;
        for (int j : arrCount) {
            if (j > 30) {
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

    public static int minNum(int[] num) {
        int minNumbers = 0;
        for (int j : num) {
            if (j < minNumbers) {
                minNumbers = j;
            }
        }
        return minNumbers;
    }

    public static int maxNum(int[] num) {
        int maxNumbers = 0;
        for (int j : num) {
            if (j > maxNumbers) {
                maxNumbers = j;
            }
        }
        return maxNumbers;
    }

    public static double avgNum(int[] num) {
        int avgNumbers = 0;
        for (int j : num) {
            avgNumbers += j;
        }
        return (double) avgNumbers / num.length;
    }
}