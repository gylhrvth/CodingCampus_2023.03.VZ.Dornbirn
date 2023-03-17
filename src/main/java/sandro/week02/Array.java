package sandro.week02;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("args: " + Arrays.toString(args));

        int arrayspace = readArrayspace("Wieviel Arrayspace möchtest du?");
        int[] countNumber = createIncreasingArray(arrayspace);
        int[] countNumber2 = createDecreasingArray(arrayspace);
        int[] copyNumbers = makeacopy(countNumber);
        int[] randomNumber = randomInput(arrayspace);
        int[] crazyRandom = crazyRandomnumbers(arrayspace);
        int[] random100add = randomAddieren(arrayspace);
        int[] random30iger = random30Plus(arrayspace);



        System.out.println(Arrays.toString(countNumber));
        System.out.println("---");
        System.out.println(Arrays.toString(countNumber2));
        System.out.println("---");
        System.out.println(Arrays.toString(copyNumbers));
        System.out.println("---");
        System.out.println("Random Output mit forEach");
        myArrayPrintForEach(randomNumber);
        System.out.println();
        System.out.println("---");
        System.out.println("Random Output mit Array.toString");
        System.out.println(Arrays.toString(randomNumber));
        System.out.println("---");
        System.out.println("Random Output mit fori");
        myArrayPrint(randomNumber);

        System.out.println();
        System.out.println("---");
        System.out.println("Random Output die 2,5 und 10 zahl");
        System.out.println("die zweite Zahl ist :" + randomNumber[1]);
        System.out.println("die fünfte Zahl ist :" + randomNumber[4]);
        System.out.println("die zehnte Zahl ist :" + randomNumber[9]);

        int[] indexes = new int[]{1, 4, 9};
        for (int index : indexes) {
            System.out.println(randomNumber[index]);
        }

        System.out.println("---");
        System.out.println("Random Output jeden zweiten Wert: 1,3,5,7,9");
        for (int i = 0; i < randomNumber.length; i = i + 2) {
            System.out.print(randomNumber[i] + ", ");
        }
        System.out.println();
        System.out.println("---");
        System.out.println("Random Output jeden zweiten Wert: 2,4,6,8,10");
        for (int i = 1; i < randomNumber.length; i = i + 2) {
            System.out.print(randomNumber[i] + ", ");
        }
        System.out.println();
        System.out.println("---");
        System.out.println("CrazyRandom Kontrolloutput");
        System.out.println(Arrays.toString(crazyRandom));
        System.out.println("---");
        System.out.println("CrazyRandom Output mit forEach");
        for (int crazy : crazyRandom) {
            System.out.print(crazy + ", ");
        }
        System.out.println();
        System.out.println("---");
        System.out.println("Array Random von 1-100 alles über 30");
        System.out.println(Arrays.toString(random30iger));
        int count = 0;
        for (int i = 0; i < random30iger.length; i++) {
            if (random30iger[i] > 30) {
                count = count +1;
            }
        }
        System.out.println(count + " Zahlen sind über 30");
        System.out.println("---");
        System.out.println("Array Random von Arrays addieren");
        System.out.println(Arrays.toString(random100add));
        int summe = 0;
        for (int i = 0; i < random100add.length; i++) {
            summe = summe + random100add[i];
        }
        System.out.println("Die Summer der Zahlen ist :" +summe);
        System.out.println("---");
        System.out.println("RandomMinMaxAvg");

        int[] inputArray = createRandomArray(arrayspace);
        System.out.println(Arrays.toString(inputArray));

        System.out.println("Der Maximus ist: " + maxValue(inputArray));
        System.out.println("Der Maximus aus COPY ist: " + maxValue(copyNumbers));
        System.out.println("Der Maximus aus 30iger ist: " + maxValue(random30iger));


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

    public static int[] randomInput(int arrayspace) {
        int[] randomArray = new int[arrayspace];
        for (int i = 0; i < randomArray.length; i++) {
            int randomValue = rand.nextInt(101);
            randomArray[i] = randomValue;
        }

        return randomArray;
    }

    public static int[] crazyRandomnumbers(int arrayspace) {
        int[] crazyRandom = new int[arrayspace];
        for (int i = 0; i < crazyRandom.length; i++) {
            int randomValue = rand.nextInt(-50, 51);
            crazyRandom[i] = randomValue;
        }

        return crazyRandom;
    }

    public static int[] randomAddieren(int arrayspace) {
        int[] random100 = new int[arrayspace];
        for (int i = 0; i < random100.length; i++) {
            int randomValue = rand.nextInt(101);
            random100[i] = randomValue;
        }
        return random100;
    }

    public static int[] random30Plus(int arrayspace) {
        int[] random30iger = new int[arrayspace];
        for (int i = 0; i < random30iger.length; i++) {
            int randomValue = rand.nextInt(101);
            random30iger[i] = randomValue;
        }
        return random30iger;
    }




    public static int[] createRandomArray(int arrayspace) {
        int[] randomMinMaxAvg = new int[arrayspace];
        for (int i = 0; i < randomMinMaxAvg.length; i++) {
            randomMinMaxAvg[i] = rand.nextInt(101);
        }
        return randomMinMaxAvg;
    }

    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void myArrayPrint(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }


    public static void myArrayPrintForEach(int[] arr){
        System.out.print("[");
        boolean first = true;
        for (int random : arr) {
            if (!first){
                System.out.print(", ");
            }
            System.out.print(random);
            first = false;
        }
        System.out.println("]");
    }

    public static int readArrayspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println(message);
        try {
            String line = sc.nextLine();
            value = Integer.valueOf(line);
        } catch (NumberFormatException nfe) {
            System.out.println("das ist keine gültige Zahl");
        }

        return value;
    }


}
