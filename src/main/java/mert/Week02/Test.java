package mert.Week02;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int console = ConsoleInputNumber.readNumber_v5("Random Number Crazy. Wie groß", 1, 1000);
        int[] asdfadf = randomNumberAray(console);
        int randsumme = randomSumme(asdfadf);


        int[] array2 = new int[console];


        for (int i = 0; i < array2.length; i++) {
            int zufallszahl2 = rand.nextInt(-50, 51);
            array2[i] = zufallszahl2;


        }
        for (int ausgabe : array2) {
            System.out.print(ausgabe + ", ");

        }
        System.out.println();

        int[] myRandomNumber = randomNumberAray(console);
        System.out.println(Arrays.toString(myRandomNumber));
        int count = groeserals30(myRandomNumber);
        System.out.println("Zahlen größer als 30 =" + count);
        System.out.println(randsumme);
        System.out.println("Random Summe =" + randsumme);


    }


    public static int[] randomNumberAray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);

        }
        return array;
    }

    public static int groeserals30(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                count = count + 1;

            }

        }
        return count;
    }

    public static int randomSumme(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
    return sum;
    }

}



