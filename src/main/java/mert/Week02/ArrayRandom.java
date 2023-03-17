package mert.Week02;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    static Random rand = new Random();

    public static void main(String[] args) {

//        int size = ConsoleInputNumber.readNumber_v5("Wie viele Elemende sollen erstellt werden?", 1, 1000);
//        int[] array = new int[size];
//
//        for (int i = 0; i < array.length; i++) {
//            int zufallszahl = rand.nextInt(101);
//            array[i] = zufallszahl;
//
//        }
//
//        for (int name : array) {
//            System.out.print(name + ", ");
//        }
//        System.out.println();
//
//        System.out.println("Ausgabe mit Arrays.toString()");
//        System.out.println(Arrays.toString(array));
//        System.out.println("Ausgabe mit fori Schleife");
//
//        array[2] = 54;
//        array[5] = 54;
//        array[10] = 54;
//
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//
//
//        }
//        System.out.print("]");


        int size2 = ConsoleInputNumber.readNumber_v5("Wie groß", 1, 1000);
        int[] myCrazyArray = crazyRange(size2);

        System.out.println(Arrays.toString(myCrazyArray));
        printArrayWithForI(myCrazyArray);
        printArrayWithForEach(myCrazyArray);


    }

    public static int[] crazyRange(int size) {
        int[] array2 = new int[size];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(-50, 51);
        }
        return array2;
    }

    public static void printArrayWithForI(int[] arr) {

    }

    public static void printArrayWithForEach(int[] arr) {

    }
}


