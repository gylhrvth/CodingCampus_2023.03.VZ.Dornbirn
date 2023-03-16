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

    }

    public static int[] crazyRange(int[] size) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int zufallszahl = rand.nextInt(101);
            numbers[i] = zufallszahl;

            for (int asdf : numbers) {

                System.out.println(asdf);
            }

        }
return numbers;

    }
}